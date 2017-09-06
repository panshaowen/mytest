package day25_jdbc_shiwu;
/*
  DBUtils使用事务
  		1.使用c3p0创建一个连接池DataSource dataSource =  new ComboPooleDataSource();
  		2.获取连接得到一个Connection对象
  			Connection connection = dataSource.getConnection();
  			
  		3.使用DBUtils工具类创建一个QueryRunner对象
  			QueryRunner queryRunner = new QueryRunner();
  			//注意使用事务的时候不用在构造方法里面传入连接池的对象dataSource;因为需要保证事务使用的connnection的同一性;
  			//如果在构造方法上传入连接池dataSource,则在使用QueryRunner的对象的是都会从连接池中拿出来一连接connection,不一定相同
  			//如果事务使用的connection不相同,则会报错
//  try/catch第4,第5,第6步	
  		try{
  		4.开启事务
  		 	connection.getAutoCommit(false);//参数为是否自动提交事务,选择FALSE
  		 	
  		5.准备sql语句模板,设置queryRunner.update(connnection,sql,params)的参数,执行的数据是多条
  				String sql ="update bank set money=money+? where name = ? ";
  				Object[]params2 = {-1000,"李四"};
				queryRunner.update(connection, sql, params2);
				Object[]params = {1000,"张三"};
				queryRunner.update(connection, sql, params);
  			注意从connection 必须是同一个
  		6.提交事务
  			connection.commit();
  			}catch(Execption e){
  		7.事务回滚
  				connection.rollback();
  			}
  		
  		
  			 
 */
import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class Test02 {
	
	
	@Test
	public void DBUtilsTransaction() throws Exception{
		DataSource dataSource = new ComboPooledDataSource();
		Connection connection = dataSource.getConnection();
		QueryRunner queryRunner = new QueryRunner();
		
		
		try {
			//开启事务
			connection.setAutoCommit(false);
			//准备模板
			String sql ="update bank set money=money+? where name = ? ";
			//准备sql数据
			Object[]params2 = {-1000,"李四"};
			queryRunner.update(connection, sql, params2);
			
			//出现错误了
//			int a = 1/0;
			
			//准备sql数据
			Object[]params = {1000,"张三"};
			queryRunner.update(connection, sql, params);
			
			//提交事务
			connection.commit();
			System.out.println("事务提交了...");
		} catch (Exception e) {
			//回滚事务
			connection.rollback();
			System.out.println("事务回滚了...");
			e.printStackTrace();
		}
		
		
	}
}
