package myiotest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIODemo3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("copy.txt");
		FileReader fr = new FileReader ("E:\\project\\day01\\src\\com\\itheima\\Student.java");
		int ch ;
		while((ch= fr.read())!= -1){
			fw.write(ch);
		}
		
		fw.close();
		fr.close();
	}

}
