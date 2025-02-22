package ioprograms;
import java.io.*;
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("pqr.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String str="Hibernate is a ORM framework";
		//fos.write(str.getBytes()); // Converts String into byte[]
		bos.write(str.getBytes());
		System.out.println("File Created");
		bos.close();
		fos.close();
	}

}
