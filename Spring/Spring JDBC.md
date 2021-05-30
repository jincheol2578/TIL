# Spring JDBC

JDBC 프로그래밍을 보면 반복되는 개발요소가 굉장히 많아서 개발자를 지루하고 피곤하게 만든다.

JDBC의 모든 저수준 세부사항을 스프링 프레임워크가 처리해주게 되어 개발자는 필요한 부분만 개발하면 된다.

## 개발자가 해야 할 일

[                                   ![img](https://cphinf.pstatic.net/mooc/20180205_176/1517797019977L6ygq_PNG/2_11_2_springJDBC.PNG?type=w760)                                        ](https://www.boostcourse.org/web316/lecture/20660/?isDesc=false#)



## **Spring JDBC 패키지**

**org.springframework.jdbc.core**

- JdbcTemplate 및 관련 Helper 객체 제공

**org.springframework.jdbc.datasource**

- DataSource를 쉽게 접근하기 위한 유틸 클래스, 트랜젝션매니져 및 다양한 DataSource 구현을 제공

**org.springframework.jdbc.object**

- RDBMS 조회, 갱신, 저장등을 안전하고 재사용 가능한 객제 제공

**org.springframework.jdbc.support**

- jdbc.core 및 jdbc.object를 사용하는 JDBC 프레임워크를 지원

  

## **JDBC Template**

- org.springframework.jdbc.core에서 가장 중요한 클래스입니다.
- 리소스 생성, 해지를 처리해서 연결을 닫는 것을 잊어 발생하는 문제 등을 피할 수 있도록 합니다.
- 스테이먼트(Statement)의 생성과 실행을 처리합니다.
- SQL 조회, 업데이트, 저장 프로시저 호출, ResultSet 반복호출 등을 실행합니다.
- JDBC 예외가 발생할 경우 org.springframework.dao패키지에 정의되어 있는 일반적인 예외로 변환시킵니다.



## **JdbcTemplate외의 접근방법**

**NamedParameterJdbcTemplate**

- JdbcTemplate에서 JDBC statement 인자를 ?를 사용하는 대신 파라미터명을 사용하여 작성하는 것을 지원
- [NamedParameterJdbcTemplate 예제](https://docs.spring.io/spring/docs/current/spring-framework-reference/data-access.html#jdbc-NamedParameterJdbcTemplate)

**SimpleJdbcTemplate**

- JdbcTemplate과 NamedParameterJdbcTemplate 합쳐 놓은 템플릿 클래스
- 이제 JdbcTemplate과 NamedParameterJdbcTemplate에 모든 기능을 제공하기 때문에 삭제 예정될 예정(deprecated)
- [SimpleJdbcTemplate 예제](https://www.concretepage.com/spring/simplejdbctemplate-spring-example)

**SimpleJdbcInsert**

- 테이블에 쉽게 데이터 insert 기능을 제공
- [SimpleJdbcInsert 예제](https://www.tutorialspoint.com/springjdbc/springjdbc_simplejdbcinsert.htm)