package myiotest;

//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIODemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d.txt");
		//fw.write("helloworld");
		//fw.write("helloworld");
		String str = "abcde";
		fw.write(str, 0, 5);
		fw.write("\r\n");
		fw.write(str, 1, 3);
		fw.write("\r\n");
		char []chs ={ 'a','b','c','r'};
		fw.write(chs, 1, 3);
		//System.out.println("--------");		
		char ch = 'a';
		fw.write(ch);
		fw.write("\r\n");
		fw.write((char)ch);
		fw.write("\r\n");
		fw.write(chs);
		
		fw.flush();
		fw.close();
	}
}
