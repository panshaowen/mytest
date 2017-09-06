package day25_jdbc_bank_test;
import day25_jdbc_bank_service.BankService;

public class BankTest {

	public static void main(String[] args) throws Exception {
		//创建业务层的对象
		BankService bankService = new BankService();
		bankService.transfer("张三", "李四", 1000);
	}

}
