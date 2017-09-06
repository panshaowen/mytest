package day25_jdbc_shiwu;
/*
  DBUtilsʹ������
  		1.ʹ��c3p0����һ�����ӳ�DataSource dataSource =  new ComboPooleDataSource();
  		2.��ȡ���ӵõ�һ��Connection����
  			Connection connection = dataSource.getConnection();
  			
  		3.ʹ��DBUtils�����ഴ��һ��QueryRunner����
  			QueryRunner queryRunner = new QueryRunner();
  			//ע��ʹ�������ʱ�����ڹ��췽�����洫�����ӳصĶ���dataSource;��Ϊ��Ҫ��֤����ʹ�õ�connnection��ͬһ��;
  			//����ڹ��췽���ϴ������ӳ�dataSource,����ʹ��QueryRunner�Ķ�����Ƕ�������ӳ����ó���һ����connection,��һ����ͬ
  			//�������ʹ�õ�connection����ͬ,��ᱨ��
//  try/catch��4,��5,��6��	
  		try{
  		4.��������
  		 	connection.getAutoCommit(false);//����Ϊ�Ƿ��Զ��ύ����,ѡ��FALSE
  		 	
  		5.׼��sql���ģ��,����queryRunner.update(connnection,sql,params)�Ĳ���,ִ�е������Ƕ���
  				String sql ="update bank set money=money+? where name = ? ";
  				Object[]params2 = {-1000,"����"};
				queryRunner.update(connection, sql, params2);
				Object[]params = {1000,"����"};
				queryRunner.update(connection, sql, params);
  			ע���connection ������ͬһ��
  		6.�ύ����
  			connection.commit();
  			}catch(Execption e){
  		7.����ع�
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
			//��������
			connection.setAutoCommit(false);
			//׼��ģ��
			String sql ="update bank set money=money+? where name = ? ";
			//׼��sql����
			Object[]params2 = {-1000,"����"};
			queryRunner.update(connection, sql, params2);
			
			//���ִ�����
//			int a = 1/0;
			
			//׼��sql����
			Object[]params = {1000,"����"};
			queryRunner.update(connection, sql, params);
			
			//�ύ����
			connection.commit();
			System.out.println("�����ύ��...");
		} catch (Exception e) {
			//�ع�����
			connection.rollback();
			System.out.println("����ع���...");
			e.printStackTrace();
		}
		
		
	}
}
