package myiotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIODemo5 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("copy333.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("XXX.java"));
		char[] chr = new char[1024];
		int len;
		while((len=br.read(chr) )!= -1){
			System.out.println(new String(chr,0,len));
			bw.write(chr, 0, len);
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
