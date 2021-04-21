# JSTL(JSP Standard Tag Library)

## JSTL이란?

- JSP를 html tag 형태로 작성하게 해준다.
- 유지보수에 용이함.

## JSTL 사용방법

#### 1. 다운로드

- http://tomcat.apache.org/download-taglibs.cgi
- 위의 사이트에서 3가지 jar파일을 다운로드 한 후 WEB-INF/lib/ 폴더에 복사를 한다.

[![img](https://cphinf.pstatic.net/mooc/20180130_248/1517289861733CmzUv_PNG/2_6_2_jstl_.PNG?type=w760)
  ](https://www.boostcourse.org/web316/lecture/254291/?isDesc=false#)

#### 2. 코드

```java
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
//ex
<c:set var="value1" scope="request" value="kim"/> //변수 설정
<c:remove var="value1" scope="request"/> //변수 제거

```

## 코어 태그 : 흐름제어 태그 

####  Choose

```java
<c:set var="n" scope="request" type="number" value="83"/>
```

```java
<c:choose>
	<c:when test="${score >= 90 }">
		A 학점 입니다.   //test의 조건이 true일때 실행
	</c:when>
	<c:when test="${score >= 80 }">
		B 학점 입니다.
	</c:when>
	<c:when test="${score >= 70 }">
		c 학점 입니다.
	</c:when>
	<c:when test="${score >= 60 }">
		D 학점 입니다.
	</c:when>
	<c:otherwise>  //else랑 같은것같다.
		F 학점 입니다.
	</c:otherwise>
</c:choose>
```

####  ForEach

```java
<%
	List<String> list = new ArrayList<>(); //list 생성
	list.add("hello");
	list.add("world");
	list.add("!!!!!");
	
	request.setAttribute("list", list);	
%>
```
```java
<c:forEach items="${list }" var="item" begin="0">
	${item } <br>
</c:forEach>
```

- var : EL에서 사용 될 변수명

- items : 배열, List, Iterator, Enumeration, Map 등의 Collection

- begin : items에 지정한 목록에서 값을 읽어올 인덱스의 시작 값

- end : item에 지정한 목록에서 값을 읽어올 인덱스의 끝 값

#### Import

```java
<c:import url="http://www.google.com" var="urlValue" scope="request"/>
```

```java
${urlValue }
```

- url  : 결과를 읽어올 url
- charEncoding : 결과를 저장할때 사용할 캐릭터 인코딩
- var : 읽어온 결과를 저장할 변수명
- scope : 변수를 저장할 영역
- url이 변경되지 않는다.

#### Redirect

```java
<c:redirect url="http://localhost:8080/WebExam/jstl05.jsp">
	<c:param name="name" value="value"/>
</c:redirect>
```

- url이 변경된다.

- \<c:param> : redirect할 페이지에 전달할 파라미터 지정


