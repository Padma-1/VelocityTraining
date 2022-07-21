package fileiodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		// Writing to a file using BufferedWriter in Java 

        try { 
        // Creating Writer obj in Append mode -true
        FileWriter writer = new FileWriter("d:/javatest/names.txt",true); //append mode is true, we can add new contents.
        BufferedWriter bwr = new BufferedWriter(writer);  
        
        
        bwr.write("Peter Parker"); //first run as it is, and change the contents for next time,  the details will be appended here. In fileWriterDemo(as true is not given), if we give new content, before ones are overriden and previous contents will be removed.
        bwr.write("\n"); // bwr.newLine();
        bwr.write("Mary Jane");
        bwr.write("\n");
        bwr.close(); 

        System.out.println("succesfully written to a file"); } 
        catch (IOException ioe) { 
        ioe.printStackTrace(); 
        }

	}

}
