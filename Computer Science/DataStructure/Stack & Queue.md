# 스택(Stack)

입력과 출력이 한 곳으로 제한 LIFO (Last in First Out : 후입선출) 

![img](https://blog.kakaocdn.net/dn/EZMh5/btqNSzGD3dv/VJ3bvnKH1hs1rm3Iq0Sad0/img.png)

스택은 데이터를 빠르게 가지고 올 수 있는 장점이 있다. 또한 균형성 검사를 할 수 있기 때문에 수식, 괄호 등의 검사에도 사용된다.

함수의 콜스택, 문자열 역순 출력, 연산자 후위표기법에 사용

```java
push()  // 데이터 넣기
pop() // 데이터 최상위 값 빼기
```



# Queue

먼저 들어간 자료가 먼저 나오는 구조 FIFO (First In First out :선입선출 )

한쪽은 프런트(front)로 정하여 삭제 연산만 수행, 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행.

![img](https://blog.kakaocdn.net/dn/bhvAPe/btqHlVqf0RY/Y4oCoA4wUkEpvIkU80i43K/img.png)

Enqueue : 큐 맨 뒤에 데이터 추가

Dequeue : 큐 맨 앞쪽의 데이터 삭제

그래프의 넓이 우선 탐색에서 사용된다. 컴퓨터 버퍼에서 주로 사용. 입력이 되었으나 처리를 하지 못할때 버퍼(큐)를 만들어 대기시킴 



> 참고자료 :  [코딩팩토리] https://coding-factory.tistory.com/602 
>
> ​				   [Tech Interview] https://gyoogle.dev/blog/

