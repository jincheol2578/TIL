# JavaScript Array

## 배열 선언

```javascript
var a = [];
var a = [1,2,3,"hello", null, true, []];
```

- 배열안에는 모든 타입이 다 들어갈 수 있다. 함수, 배열, 배열안의 배열도 다 들어감.



## 배열의 메소드

#### foreach()

array의 모든 요소들이 callback 함수에 순서대로 호출된다

```javascript
var arr = [ 1, 2, 3, 4 ];
arr.forEach(function(element){
console.log( element ); // 1 2 3 4 
});
```



#### map

map 함수는 callback 함수를 **실행한 결과**를 가지고 새로운 배열을 만들때 사용.

```javascript
var number = [1, 2, 3, 4];

var newNumber = number.map((number) => number * 2);

console.log(newNumber);
```



#### filter

filter 함수는 callback 함수의 **조건에 해당하는** 모든 요소가 있는 배열을 새로 생성한다.

```javascript
var numbers = [1, 3, 5]
var nuewNumber = numbers.filter((num, index, arr) =>
          	{console.log(num, index, arr)})
//
1 0 [ 1, 3, 5 ]
3 1 [ 1, 3, 5 ]
5 2 [ 1, 3, 5 ]
```



#### push()

- 순차적으로 추가

```javascript
var arr = [ 1, 2, 3, 4 ];
arr.push( 5 );
console.log( arr ); // [ 1, 2, 3, 4, 5 ]
```



#### pop()

- 배열 마지막 값을 삭제

```javascript
var arr = [ 1, 2, 3, 4 ];
arr.pop();
console.log( arr ); // [ 1, 2, 3 ]
```



#### indexOf()

- 특정한 문자열의 index를 반환함.

```javascript
var number = [1, 2, 3, 4];
console.log(number.indexOf(3)); // 2
```

