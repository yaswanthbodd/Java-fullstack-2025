package ioprograms;
import java.io.*;
public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("text.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Welcome");
		dos.writeInt(10);
		dos.writeDouble(500.0);
		System.out.println("File Created");
		dos.close();
		fos.close();
	}

}
