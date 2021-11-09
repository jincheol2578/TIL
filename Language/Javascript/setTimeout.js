function run() { 
    
    setTimeout(function()  {// 비동기 콜백함수  Stack에 쌓여있는 함수의 실행이 다 끝나고 나서 실행된다
        var msg = "hello codesquad";  
        console.log(msg); 
    }, 1000);
    console.log("run function end");
}
console.log("start");
run();
console.log("end");