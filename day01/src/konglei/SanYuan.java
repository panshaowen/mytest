package konglei;

import java.util.Scanner;

public class SanYuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 48;
		int b = 100;
		int c = 30;
		int d = (a > b) ? a : b;
		System.out.println(d);
		int temp = (a > b) ? a : b;
		int max = (temp > c) ? temp : c;
		System.out.println(max);
		System.out.println("----------");

		System.out.println("输入第一个数据");
		int a1 = sc.nextInt();
		System.out.println("输入第二个数据");
		int b1 = sc.nextInt();
		System.out.println("输入第三个数据");
		int c1 = sc.nextInt();
		int temp1 = 0;
		;
		if (a1 > b1) {
			temp1 = a1;
			// if(temp1>c1){
			// System.out.println(temp1);
		} else {
			temp1 = b1;
		}
		if (temp1 > c1) {
			System.out.println(temp1);
		} else {
			System.out.println(c1);
		}
	}
}
