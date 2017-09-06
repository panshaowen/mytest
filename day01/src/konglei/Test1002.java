package konglei;

public class Test1002 {
	public static void main(String[] args) {
		//定义一个int类型的一维数组
		int[] arr = {171,72,19,16,118,51,210,7,18};
		
		//定义一个求和变量
		int sum = 0;
		
		//遍历数组，获取到数组中的每一个元素
		for(int x=0; x<arr.length; x++) {
			if((arr[x] % 10 != 7) && (arr[x] / 10 % 10 != 7) && (arr[x] % 2 == 0)) {
				System.out.println(arr[x]);
				sum += arr[x];
			}
		}
		
		System.out.println("sum:"+sum);
	}
}
