package day25_jdbc_bank_dao;
/*
 * �����������ݿ����
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JDBCUtil;

public class BankDao {
	
	/*Ϊ�˱�֤connection��ͬһ,��Ҫ��connection�ڷ��������д���*/
	public void outMoney(Connection connection ,String name,double money){
//		Connection connection = JDBCUtil.getConnection();
		try {
			String sql = "update bank set money = money - ? where name = ?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setDouble(1, money);
			pst.setString(2,name);
			pst.execute();
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
	}
	
	/*Ϊ�˱�֤connection��ͬһ,��Ҫ��connection�ڷ��������д���*/
	public void inMoney(Connection connection ,String name ,double money){
//		Connection connection = JDBCUtil.getConnection();
		String sql = "update bank set money = money + ? where name = ?";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setDouble(1, money);
			pst.setString(2, name);
			pst.execute();
			
		} catch (SQLException e) {
			
			throw new RuntimeException();
		}
	}
	
	
	
	
	
}
