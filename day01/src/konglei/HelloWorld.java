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
		System.out.println("请输入一个数据");
		int age = sc.nextInt();
		if (age > 0 && age < 130) {
			
			switch (age) {
			case 100:
				System.out.println("大年纪");
				break;
			case 90:
				System.out.println("90岁");
				break;

			default:
				System.out.println("太小了");
				return;
			}
			
		}
	
	}

}
