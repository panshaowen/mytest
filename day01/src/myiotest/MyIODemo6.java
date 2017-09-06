package myiotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIODemo6 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("copy333.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("XXXzzz.java"));
		
		String line;
		while((line= br.readLine()) != null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
