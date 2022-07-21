package fileiodemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//program to create a text based file
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("d:/javatest/data.txt"); // file will be automatically created, but folder javatest
		// need to be there before.

		try {

			String content = "She Sells Sea Shells In the Sea.";

			w.write(content); // write contents into file

			System.out.println("Character Data Written to File");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			w.close();
		}

	}

}
