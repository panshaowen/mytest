package day25_jdbc_bank_service;

import java.sql.Connection;

import day25_jdbc_bank_dao.BankDao;
import util.JDBCUtil;

/*
 * 创建事务操作类
 */
public class BankService {
	
	private BankDao bankDao = new BankDao();
	
	
//	转账的方法
	public void  transfer(String outName, String inName,double money) throws Exception{
		Connection connection = JDBCUtil.getConnection();
		
		try {
			//开启事务
			connection.setAutoCommit(false);
			
			/*为了保证connection的同一,需要把connection在方法参数中传入*/
			bankDao.outMoney(connection ,outName, money);
			
			int a = 1/0;//出现错误
			
			bankDao.inMoney(connection ,inName ,money);
			
			//提交事务
			connection.commit();
			System.out.println("已经提交了事务..");
			
		} catch (Exception e) {
			
			connection.rollback();
			System.out.println("事务回滚了..");
			e.printStackTrace();
			
		}
		
	}
}
