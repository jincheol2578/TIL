function printName(firstname){

    
    function inner() {
        return "inner value";
    }
    
    var result = inner();
    console.log (typeof inner);
    console.log("name is" + result);

}
printName();
// 자바스크립트 함수는 반드시 return값이 존재하며, 없을 때는 기본 반환값인 'undefined'가 반환된다.
// 자바스크립트에서는 void 타입이 없다.