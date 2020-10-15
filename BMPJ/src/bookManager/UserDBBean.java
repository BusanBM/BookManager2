package bookManager;

import java.sql.*;

import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;

public class UserDBBean {

	public static Connection getMySQLConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://192.168.0.151:3306/mydb?useSSL=false&useUnicode=true&characterEncoding=euc-kr";
			String user = "root";
			String password = "busanit";
			conn = DriverManager.getConnection(url, user, password);
		}catch (ClassNotFoundException e) {
			System.out.println("MySQL ����̹��� �����ϴ�.");
		}catch (MySQLDataException e) {
			System.out.println("�����ͺ��̽��� �����ϴ�.");
		}catch (SQLException e) {
			System.out.println("����� ���� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		return conn;
	}
	public static void close(Connection conn) {
		try {
			if(conn !=null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			if(stmt !=null) {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pstmt) {
		try {
			if(pstmt !=null) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			if(rs !=null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



