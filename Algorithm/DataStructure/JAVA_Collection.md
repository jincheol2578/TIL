# Java Collection Framework

자바 컬렉션 프레임워크란 다수의 데이터를 쉽고 효과적으로 처리할수 있는 방법을 제공하는 클래스의 집합이다.

데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현한 것.



## 주요 인터페이스

![img](https://t1.daumcdn.net/cfile/tistory/99B88F3E5AC70FB419)

#### 3가지 상위 인터페이스

- List Interface

- Set Interface

- Queue Interface

#### Map 인터페이스

- Map Interface (Collection Interface를 상속받지는 않지만 Collection으로 분류)



### Collection 인터페이스의 특징

| 인터페이스 | 구현클래스                     | 특징                                                         |
| ---------- | ------------------------------ | ------------------------------------------------------------ |
| Set        | HashSet, TreeSet               | 순서를 유지하지 않는 데이터의 집합으로 데이터의 중복을 허용하지 않는다. |
| List       | Linked List, Vector, ArrayList | 순서가 있는 데이터의 집합으로 데이터의 중복을 허용한다.      |
| Queue      | Linked List, PriorityQueue     | List와 유사                                                  |
| Map        | Hashtable, HashMap, TreeMap    | 키(Key), 값(Value)의 쌍으로 이루어진 데이터으 집합으로,순서는 유지되지 않으며 키(Key)의 중복을 허용하지 않으나 값(Value)의 중복은 허용한다. |



> 참고자료 : https://gangnam-americano.tistory.com/41
