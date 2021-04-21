# Hoisting

> Hoisting 이란

 - var를 어디에 놓든 항상 최상위에 선언된다.
 - 값을 가져가진 않음

```javascript
var  a  =  10;

console.log(a);

var  b;

console.log(b);

console.log(d);

console.log(c);

var  d;
```
*console.log(d); 는 콘솔창에 undefind가 출력된다.*
