# EL(Expression Language)

## EL 이란?

- 표현 언어(Expression Language)는 값을 표현하는 데 사용되는 스크립트 언어로서 JSP의 기본 문법을 보완하는 역할을 한다.

## EL이 제공하는 기능

- JSP의 스코프(scope)에 맞는 속성 사용
- 집합 객체에 대한 접근 방법 제공
- 수치 연산, 관계 연산, 논리 연산자 제공
- 자바 클래스 메소드 호출 기능 제공
- 표현언어만의 기본 객체 제공

## 문법 예제

```jsp
pageContext.getAttribute("p1") : <%=pageContext.getAttribute("p1") %>
pageContext.getAttribute("p1") : ${pageScope.p1}
```

## EL의 기본객체

![EL의 기본객체](https://cphinf.pstatic.net/mooc/20180130_153/1517281495386qOuqH_PNG/2_6_1__.PNG)



> 출처 :  [www.boostcourse.org/web316 부스트 코스 웹 프로그래밍(풀스택)](www.boostcourse.org/web316)

