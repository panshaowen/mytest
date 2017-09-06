package day25_jdbc_shiwu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import org.junit.Test;

import util.JDBCUtil;

/*
 演示jdbc对事务的支持
 */
public class Test01 {
	
	@Test
	public void jdbcTransaction() throws SQLException{
		//获取连接
		Connection connection = JDBCUtil.getConnection();
		
		try {
			//开启事务
			connection.setAutoCommit(false);
			
			//准备sql,创建预编译对象
			String sql = "update bank set money = money + ? where name = ?";
			//创建预编译对象
			PreparedStatement pst = connection.prepareStatement(sql);
			
			//设置参数--张三
			pst.setDouble(1, 1000);
			pst.setString(2, "张三");
			//执行
			pst.execute();
			
			//出现错误
			int a = 1/0;
			
			//设置参数--李四
			pst.setDouble(1, -1000);
			pst.setString(2, "李四");
			//执行
			pst.execute();
			
			//提交事务
			connection.commit();
			System.out.println("事务提交了...");
			
		} catch (Exception e) {
			//回滚事务
			connection.rollback();
			System.out.println("事务回滚了..");
			e.printStackTrace();
			
		}
	}
}
