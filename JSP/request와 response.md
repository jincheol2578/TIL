# request와 response

## request

- request 기본객체는 웹 브라우저가 전송한 요청정보를 담고있다

- Map방식이다.  `key=value`

#### 클라이언트에서 값이 넘어올때

- `request.getParameter("key");`
- `request.getParmeter()`는 리턴값이 항상 String 이다



#### survlet에서 jsp로 값 전달할때

- `request.setAttribute("key", value);`

#### jsp에서 survlet 값 받아올때

- `request.getAttribute("key", value);`

#### 페이지 이동방식 

- `forward` 로 이동

## response

- response 기본객체는 웹브라우저에 보내는 응답정보를 담는다.



#### 페이지 이동방식

- `sendredirect`, `forward` 로 이동