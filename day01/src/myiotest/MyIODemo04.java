package myiotest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIODemo04 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("copy31.txt");
		FileReader fr = new FileReader ("E:\\project\\day01\\src\\com\\itheima\\Student.java");
		
		char[] ch = new char [1024];
		int len;
		while( (len = fr.read(ch))!= -1){
			//System.out.print(new String (ch,0 ,len));
			fw.write(ch,0,len);
		}
		
//		int ch1 ;
//		//int len1;
//		while((ch1 = fr.read())!= -1){
//			//System.out.print(new String (ch,0 ,len));
//			fw.write((char)ch1);
//		}
		
		
		
		fw.close();
		fr.close();
	}

}
