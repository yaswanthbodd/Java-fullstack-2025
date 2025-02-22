package ioprograms;
import java.io.*;
public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("text.txt");
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);
		int n=dis.readInt();
		System.out.println(n);
		double d=dis.readDouble();
		System.out.println(d);
		dis.close();
		fis.close();

	}

}
