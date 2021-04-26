# Exception

```java
try {
			//에외가 발생될 가능성이 높은 소스를 위치
			int result = 10/0 ;   
			System.out.println("result : " + result);			
		} catch (Exception e) {
   		    e.printStackTrace();
			System.out.println("예외발생");
		}
```

```java
finally {
			System.out.println("무조건 실행");
		}
```

- `finally{}` : 무조건 실행한다 

- `e.printStackTrace();` : 콘솔창에 내용 출력

