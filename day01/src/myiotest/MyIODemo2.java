package myiotest;

import java.io.FileReader;
import java.io.IOException;

public class MyIODemo2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("d.txt");
		int ch;
		while ((ch=fr.read())!= -1){
			System.out.print((char)ch);
		}
		fr.close();
	}

}
