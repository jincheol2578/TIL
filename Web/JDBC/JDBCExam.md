# 예제



```java
package sec06.ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionExam4 {
	public static void main(String[] args) {

		DbUtils du = new DbUtils();
		Connection con = du.getCon();
	}
}

class DbUtils {
	Connection getCon() {
		Connection con = null;
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");  //드라이버 로딩
			final String URL = "jdbc:mysql://localhost:3308/java";
							  //jdbc:mssql://ip주소 : 포트번호/db명;
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("접속성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속실패");
		} 

		return con;
	}
}
```
