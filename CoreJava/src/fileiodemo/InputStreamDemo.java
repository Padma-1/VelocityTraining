package fileiodemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//java program to read byte data using InputStream class
public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("d:/javatest/data.txt");	//this file should be there in before.

		/*
		 * A data input stream enable an application read primitive Java data types from
		 * an underlying input stream in a machine-independent way(instead of raw
		 * bytes).
		 */
		
		DataInputStream inst = new DataInputStream(input);

		int cnt = input.available();
		System.out.println("total available bytes: " + cnt);

		int count = input.available();

		byte[] ary = new byte[count];

		inst.read(ary);
		inst.close();
		for (byte bt : ary) {
			char k = (char) bt;	//conveting byte to char so we csn read.
			System.out.print(k + "-");
		}

	}

}
