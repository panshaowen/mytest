package day25_jdbc_shiwu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import org.junit.Test;

import util.JDBCUtil;

/*
 ��ʾjdbc�������֧��
 */
public class Test01 {
	
	@Test
	public void jdbcTransaction() throws SQLException{
		//��ȡ����
		Connection connection = JDBCUtil.getConnection();
		
		try {
			//��������
			connection.setAutoCommit(false);
			
			//׼��sql,����Ԥ�������
			String sql = "update bank set money = money + ? where name = ?";
			//����Ԥ�������
			PreparedStatement pst = connection.prepareStatement(sql);
			
			//���ò���--����
			pst.setDouble(1, 1000);
			pst.setString(2, "����");
			//ִ��
			pst.execute();
			
			//���ִ���
			int a = 1/0;
			
			//���ò���--����
			pst.setDouble(1, -1000);
			pst.setString(2, "����");
			//ִ��
			pst.execute();
			
			//�ύ����
			connection.commit();
			System.out.println("�����ύ��...");
			
		} catch (Exception e) {
			//�ع�����
			connection.rollback();
			System.out.println("����ع���..");
			e.printStackTrace();
			
		}
	}
}
