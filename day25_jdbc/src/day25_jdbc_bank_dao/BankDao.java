package day25_jdbc_bank_dao;
/*
 * 创建操作数据库的类
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JDBCUtil;

public class BankDao {
	
	/*为了保证connection的同一,需要把connection在方法参数中传入*/
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
	
	/*为了保证connection的同一,需要把connection在方法参数中传入*/
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
