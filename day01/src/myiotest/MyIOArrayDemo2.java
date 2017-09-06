package myiotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyIOArrayDemo2 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));

		ArrayList<String> array = new ArrayList<String>();

		String line;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}
		br.close();
		
		for (int i = 0; i < array.size(); i++) {
//			String s = array.get(i);
//			System.out.println(s);
			System.out.println(array.get(i));
		}
	}

}
