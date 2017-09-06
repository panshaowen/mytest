package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	// ���������ļ�
	private static Properties properties = new Properties();

	static {
		
			try {
				properties.load(JDBCUtil.class.getResourceAsStream("/db.properties"));
				Class.forName(properties.getProperty("driverClass"));
			} catch (Exception e) {
				throw new RuntimeException();
			}
		 
			
		}
	

	// ��ȡ����
	public static Connection getConnection() {

		Connection connection = null;
		
		
		try {
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),
					properties.getProperty("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

	// �ر���Դ
	public static void close(Connection connection, Statement st, ResultSet rs) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException();
			} finally {

				if (st != null) {
					try {
						st.close();
					} catch (SQLException e) {
						throw new RuntimeException();
					} finally {
						
						if (rs != null) {
							try {
								rs.close();
							} catch (SQLException e) {
								throw new RuntimeException();
							}
						}
						
					}
				}
				
			}
		}

	}

}
