package konglei;

public class Test1002 {
	public static void main(String[] args) {
		//����һ��int���͵�һά����
		int[] arr = {171,72,19,16,118,51,210,7,18};
		
		//����һ����ͱ���
		int sum = 0;
		
		//�������飬��ȡ�������е�ÿһ��Ԫ��
		for(int x=0; x<arr.length; x++) {
			if((arr[x] % 10 != 7) && (arr[x] / 10 % 10 != 7) && (arr[x] % 2 == 0)) {
				System.out.println(arr[x]);
				sum += arr[x];
			}
		}
		
		System.out.println("sum:"+sum);
	}
}
