package com.wipro.demo.service;

import java.io.IOException;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.wipro.demo.model.Book;
import org.apache.commons.io.IOUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

    @Autowired
    private GridFsTemplate template;

    @Autowired
    private GridFsOperations operations;

    public String addFile(MultipartFile upload) throws IOException {

        //define additional metadata
        DBObject metadata = new BasicDBObject();
        metadata.put("fileSize", upload.getSize());

        //store in database which returns the objectID
        Object fileID = template.store(upload.getInputStream(), upload.getOriginalFilename(), upload.getContentType(), metadata);

        //return as a string
        return fileID.toString();
    }

    public Book downloadFile(String id) throws IOException {

        //search file
        GridFSFile gridFSFile = template.findOne( new Query(Criteria.where("_id").is(id)) );


        //convert uri to byteArray
        //save data to LoadFile class
        Book loadFile = new Book();

        if (gridFSFile != null && gridFSFile.getMetadata() != null) {
          
            loadFile.setFile( IOUtils.toByteArray(operations.getResource(gridFSFile).getInputStream()) );
        }

        return loadFile;
    }
}
    