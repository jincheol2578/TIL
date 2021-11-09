# 쿠키(Cookie) & 세션(Session)

### 차이점

|          |                     Cookie                      |     Session      |
| :------: | :---------------------------------------------: | :--------------: |
| 저장위치 |                     Client                      |      Server      |
| 저장형식 |                      Text                       |      Object      |
| 만료시점 | 쿠키 저장시 설정 (설정 없으면 브라우저 종료 시) | 정확한 시점 모름 |
|  리소스  |               클라이언트의 리소스               |  서버의 리소스   |
| 용량제한 |        한 도메인 당 20개, 한 쿠키당 4KB         |     제한없음     |

##### 저장 위치

- 쿠키 : 클라이언트의 웹 브라우저가 지정하는 메모리 or 하드디스크
- 세션 : 서버의 메모리에 저장




##### 만료 시점

- 쿠키 : 저장할 때 expires 속성을 정의해 무효화시키면 삭제될 날짜 정할 수 있음
- 세션 : 클라이언트가 로그아웃하거나, 설정 시간동안 반응이 없으면 무효화 되기 때문에 정확한 시점 알 수 없음  



##### 리소스

- 쿠키 : 클라이언트에 저장되고 클라이언트의 메모리를 사용하기 때문에 서버 자원 사용하지 않음
- 세션 : 세션은 서버에 저장되고, 서버 메모리로 로딩 되기 때문에 세션이 생길 때마다 리소스를 차지함




##### 용량 제한

- 쿠키 : 클라이언트도 모르게 접속되는 사이트에 의하여 설정될 수 있기 때문에 쿠키로 인해 문제가 발생하는 걸 막고자 한 도메인당 20개, 하나의 쿠키 당 4KB로 제한해 둠
- 세션 : 클라이언트가 접속하면 서버에 의해 생성되므로 개수나 용량 제한 없음



> 출처 : [tech interview] https://gyoogle.dev/blog/web-knowledge/Cookie%20&%20Session.html#%E1%84%86%E1%85%A1%E1%86%AB%E1%84%85%E1%85%AD-%E1%84%89%E1%85%B5%E1%84%8C%E1%85%A5%E1%86%B7
