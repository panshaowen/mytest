package konglei;

import java.util.Scanner;

public class SumDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		int sum =a + b;
		System.out.println(sum);
		System.out.println("-----------");
		
//	boolean flag = (a==b)? true : false;
//		System.out.println(flag);
		String s1 ="���";
		String s2 = "�����";
//		String str =(a==b)?"���":"�����";
//		System.out.println(str);
		String str =(a==b)?s1:s2;
		System.out.println(str);
	}

}
