package konglei;

import java.util.Scanner;

public class SumDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		int sum =a + b;
		System.out.println(sum);
		System.out.println("-----------");
		
//	boolean flag = (a==b)? true : false;
//		System.out.println(flag);
		String s1 ="相等";
		String s2 = "不相等";
//		String str =(a==b)?"相等":"不相等";
//		System.out.println(str);
		String str =(a==b)?s1:s2;
		System.out.println(str);
	}

}
