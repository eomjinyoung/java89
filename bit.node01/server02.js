/* 클라이언트에게 응답 메시지 보내기
 */    
const http = require('http');

var httpServer = http.createServer(function(req, resp) {
	console.log('클라이언트가 접속하였네!');
	resp.write('hello!');
	resp.end();
});

httpServer.listen(8888, function() {
	console.log('localhost:8888 번에서 웹서버가 실행되었습니다.');
});
console.log('서버 실행!');









