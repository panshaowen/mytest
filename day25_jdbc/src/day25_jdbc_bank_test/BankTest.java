package day25_jdbc_bank_test;
import day25_jdbc_bank_service.BankService;

public class BankTest {

	public static void main(String[] args) throws Exception {
		//����ҵ���Ķ���
		BankService bankService = new BankService();
		bankService.transfer("����", "����", 1000);
	}

}
