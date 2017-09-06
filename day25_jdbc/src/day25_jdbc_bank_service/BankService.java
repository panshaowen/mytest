package day25_jdbc_bank_service;

import java.sql.Connection;

import day25_jdbc_bank_dao.BankDao;
import util.JDBCUtil;

/*
 * �������������
 */
public class BankService {
	
	private BankDao bankDao = new BankDao();
	
	
//	ת�˵ķ���
	public void  transfer(String outName, String inName,double money) throws Exception{
		Connection connection = JDBCUtil.getConnection();
		
		try {
			//��������
			connection.setAutoCommit(false);
			
			/*Ϊ�˱�֤connection��ͬһ,��Ҫ��connection�ڷ��������д���*/
			bankDao.outMoney(connection ,outName, money);
			
			int a = 1/0;//���ִ���
			
			bankDao.inMoney(connection ,inName ,money);
			
			//�ύ����
			connection.commit();
			System.out.println("�Ѿ��ύ������..");
			
		} catch (Exception e) {
			
			connection.rollback();
			System.out.println("����ع���..");
			e.printStackTrace();
			
		}
		
	}
}
