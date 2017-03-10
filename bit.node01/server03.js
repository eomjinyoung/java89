/* JSON 출력
 */    
const http = require('http');

var httpServer = http.createServer(function(req, resp) {
	console.log('클라이언트가 접속하였네!');
	var obj = {
		title: '제목입니다.',
		content: '내용입니다',
		writer: '홍길동',
		views: 120
	};
	
	resp.writeHead(200, {'Content-Type': 'text/plain;charset=UTF-8'});
	resp.write(JSON.stringify(obj));
	resp.end();
});

httpServer.listen(8888, function() {
	console.log('localhost:8888 번에서 웹서버가 실행되었습니다.');
});
console.log('서버 실행!');









