package konglei;

import java.util.Scanner;

public class HelloWorld {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HelloWorld");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int age = sc.nextInt();
		if (age > 0 && age < 130) {
			
			switch (age) {
			case 100:
				System.out.println("�����");
				break;
			case 90:
				System.out.println("90��");
				break;

			default:
				System.out.println("̫С��");
				return;
			}
			
		}
	
	}

}
