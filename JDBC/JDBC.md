# JDBC 

- Java Database Connectivity 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API



## Connection

- 데이터베이스와 연결하는 객체

- `DriverManager.getConnection(url, username, password)` 로 객체 생성

- url

  ```java
  private static String dburl = "jdbc:Dirver종류://ip:port번호/DB명";
  ```



## DriverManager

- DirverManager 클래스는 JDBC 드라이버를 통하여 Connection을 만드는 역할을 한다.

- `Class.forName()` 메소드를 통해 생성

  ```java
  Class.forName("com.mysql.jdbc.Driver");  // mysql
  Class.forName("org.mariadb.jdbc.Driver"); // mariadb
  ```



## Statement 와 PreparedStatement

#### Statement와 PreparedStatement란?

- SQL을 실행할 수 있는 객체

#### Statement

- 단일로 사용될 때 빠름
- 쿼리에 인자부여 X
- 매번 컴파일 수행
- 스스로 SQL구문 해석 X 전달역할
- SQL 관리 O ,연결정보 X

```java
String sql2 = "SELECT description,role_id FROM role WHERE role_id =" + roleId;
			sm = conn.createStatement();
			rs = sm.executeQuery(sql2);
```

#### PreparedStatment

- 여러번 수행할때 빠름
- 쿼리에 인자부여 O
- 처음 컴파일 된 후 컴파일 X
- 안전성, 가독성 높음

```java
String sql = "SELECT description,role_id FROM role WHERE role_id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId);
			rs = ps.executeQuery();
```

#### excute()

- `excuteQuery()` : `SELECT`

- `excuteUpdate()` : `INSERT` `Update` `Delete` 



## bind variable (바인드 변수)

- sql 쿼리문에서 where 절에 value 값을 (?)로 사용하는 변수
- 바인드 변수를 이용하지 않으면 반복 수행문 안에서 쿼리 수행 횟수만큼 parsing 을 하기 떄문에 Hard Parsing에 대한 부하가 발행한다.(CPU자원 사용량 많음)
- 바인드 변수 이용시 Soft Parsing이 가능해진다고 함. (성능을 고려해서 바인드 변수 사용을 권장함)

```java
String sql = "SELECT description,role_id FROM role WHERE role_id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId);
```



## ResultSet

-  Statement or PreparedStatement의 excuteQuery()메소드를 통해 ResultSet 타입으로 반환받아 결과값을 저장할 수 있다.

- 저장된 값을 한 행 단위로 불러올 수 있다.

- 한 행에서 값을 가져올 때는 타입을 지정해 불러올 수 있다.
- `next()` :  next 메소드를 통해  결과 값이 있으면 첫번째 레코드로 커서를 이동하고 true, 결과값이 없으면 false를 리턴한다.  `get타입(?)`  '?' 안에는 컬럼명이나 순번을 넣을 수 있다.

```java
if(rs.next()) {
				String c1 = rs.getString(1); // 첫번째 column을 c1에 저장
				int c2 = rs.getInt("column2"); // column2를 c2에 저장
				role = new Role(id, description);
```
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
