
# Redirect와 Forward의 차이

 - **JSP환경에서 현재 작업중인 페이지에서 다른 페이지로 이동하는 페이지 전환방법** 
 -   **URL1, URL2, Browser(client)가 있다고 가정한다.**

## Redirect

1. 브라우저에서 URL1로 request명령을 보낸다. 
2. URL1은 브라우저로 URL2로 이동하라는 명령을 보냄. (URL = URL1
3. 브라우저에서 URL2로 request를 보낸다.
4. URL2는 브라우저로 response를 한다. (URL = URL2)

 - **URL이 변경된다. 객체를 재사용 하지 않는다.**
 - **새로운 페이지에서 request와 response객체는 새롭게 생성된다.**

## Forward

 1. 브라우저에서 URL1로 request명령을 보낸다.
 2. URL1은 URL2로 request, response 객체를 넘겨준다. (URL은 바뀌지 않음)
 3. URL2에서 브라우저로 response를 한다.

   - URL이 변경되지 않는다. 요정정보를 그대로 전달한다. 
   
   - 게시판에서 Forward 를 사용하는 경우 새로고침을 누를경우 요청정보가 살아있어 동일한 게시물이 등록될 수 있다.
  
 - 시스템(session, DB)에 변화가 생기는 요청이라면 Redirect를 사용하는게 바람직하고,
 단순 조회를 하는 요청이라면 Forward를 사용하는게 좋을 것 같다.
