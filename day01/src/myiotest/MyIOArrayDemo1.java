package myiotest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyIOArrayDemo1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> array = new  ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		
	
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
//			bw.write(s);
			bw.newLine();
			bw.flush();
			bw.write(s);
		}
		bw.close();
	}

}
