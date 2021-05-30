# DBCP(Data Base Connection Pool)

##  DBCP란?

- 효율적인 DB커넥션을 위해 사용하는 Data Base Connection Pool이다.
- JDBC만 이용할 경우 DB접속시마다 JDCB드라이버 로드, getCon 메소드로 DB커넥션 객체를 받아오는것이 비효율적이다.
- DBCP(Data Base Connection Pool) 를 사용하면 WAS가 실행될떄 Pool 공간에 DB커넥션 객체를 저장한다. 그리고 DB연결 요청이 있을때마다 Pool에서 커넥션 객체를 받아서 쓰고 반환하게 된다.



## DBCP 라이브러리인 BasicDataSource 적용방법

```xml
<!-- basic data source -->
	<dependency>
		<groupId>org.apache.commons</groupId>
		<artifactId>commons-dbcp2</artifactId>
		<version>2.1.1</version>
	</dependency>
<!-- mariaDB DRIVER -->
```



## 사용방법

```java
@Configuration
@EnableTransactionManagement  //트랜잭션 때문에 필요한부분
public class DBConfig {
	private String driverClassName = "com.mysql.cj.jdbc.Driver";
	private String url = "jdcb:mysql://localhost:3306/exam";
	private String username = "root";
	private String password = "1234";
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;	
	}
}
```

