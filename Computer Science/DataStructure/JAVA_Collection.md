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



### SET



### List

#### LinkedList (연결리스트)

LinkedList 란 각 노드가 데이터와 포인터를 가지고 있는 선형 자료구조다. 노드들은 연결되어있고, 포인터가 노드의 연결을 담당한다. LinkedList에 객체를 삽입하거나 삭제하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 중간에 데이터를 삽입, 삭제 하더라도 인덱스가 밀리거나 당겨지지 않기때문에 **ArrayList에 비해서 추가, 삭제가 용이하다.** 하지만 인덱스가 없기 때문에 **특정요소에 접근하려면 순차탐색이 필요하여 탐색속도가 떨어지는 단점이 있다.** <u>**데이터의 추가, 삭제가 많은경우 LinkedList를 사용하는것이 유리하다.**</u>



#### ArrayList

JAVA에서 많이 사용되는 클래스이다. 일반 배열과 동일하게 연속된 메모리 공간을 사용하며 인덱스는 0부터 시작한다. 배열은 크기가 고정인 반면 ArrayList는 크기가 정해져있지 않기 때문에, 중간에 데이터를 추가, 삭제가 가능하다. 하지만 **중간에 데이터 추가, 삭제시 시간이 오래걸리는 단점이 있다.** **index를 가지고 있어 검색이 빠른 장점이 있다.**



### Queue



### Map

#### Hashtable

그냥 HashMap 쓰면된다.



#### HashMap 

HashMap 클래스는 Map 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.

해시 알고리즘을 사용하여 검색속도가 매우 빠른 장점이 있음.

Map 인터페이스를 구현하므로 키의 중복 X ,값의 중복 O, null 키/값을 허용한다.

엘리먼트들을 추가, 삭제, 수정 작업할때 유리하다. 

정렬되어 있는 Key값에 따라 탐색하려면 TreeMap이 더 효율적임.

**Hash 구조**

![img](https://mblogthumb-phinf.pstatic.net/MjAxODAxMTZfMTQ3/MDAxNTE2MTEwNTA0MTk1.5M63w34doiXF0zMJdRyII7o3xoRzV3lNwSHO3ngNF28g.y4xf0obeWKOvdD4d2stW4UPMHIugVeWJFZDcYY5kx74g.PNG.gngh0101/KakaoTalk_2018-01-16-22-46-58_Photo_5.png?type=w2)

시간 복잡도 O(1)



#### TreeMap

TreeMap 클래스는 키와 값을 한 쌍으로 하는 데이터를 이진 검색 트리(binary search tree)의 형태로 저장한다. 

이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠른 장점이 있다.

TreeMap의 키는 정렬이 되어있기 때문에 키에 대해 순차적인 접근이 필요할 경우 TreeMap 을 사용하는것이 유리하다.

**Tree 구조**

![img](https://mblogthumb-phinf.pstatic.net/MjAxODAxMTZfMjI4/MDAxNTE2MTEwNTA0MzE4.WwUCNZ8j-LGsl80WjSVkSsJ6ecqYmLS2zvb9soZ5uHkg.3z40fZHc7RQzNfv0-G2NKGulNfcslB3gT1IT_hp3A6cg.PNG.gngh0101/KakaoTalk_2018-01-16-22-48-06_Photo_68.png?type=w2)

시간복잡도 O(logN)
