/* 'http' nodejs 기본 플러그인(=모듈=라이브러리)을 이용하여 웹 서버 만들기
 * 1) 모듈 로딩
 * => require('모듈명')
 *    - 모듈을 사용할 수 있도록 객체를 준비시키는 명령어
 */    
const http = require('http');

// 2) HTTP 요청을 받을 수 있는 서버 객체 생성
// => http.createServer(콜백함수)
//    - HTTP 요청이 들어오면 우리가 넘겨준 함수가 호출된다.
// => 콜백함수의 형식
//    - function(요청객체, 응답객체) {}
var httpServer = http.createServer(function(req, resp) {
	console.log('클라이언트가 접속하였네!');
	resp.end();
});

// 3) HTTP 서버 실행
// => listen(포트번호, IP주소, 콜백함수);
//    - 포트번호 : 클라이언트와 접속할 때 사용할 포트번호
//    - IP 주소 : 클라이언트와 접속할 때 사용할 IP 주소
//                IP 주소를 생략하면 현재 컴퓨터에 설정된 모든 주소로 들어오는
//                HTTP 요청을 받을 수 있다.
//    - 콜백함수 : 서버가 시작되면 호출된다.
httpServer.listen(8888, function() {
	console.log('localhost:8888 번에서 웹서버가 실행되었습니다.');
});
console.log('서버 실행!');









