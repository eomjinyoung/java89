/* express 프레임워크를 사용하여 웹 요청 처리하기
 */    
var express = require('express');
var app = express();

app.get('/', function(req, res){
  res.send('hello world');
});

app.get('/board/add.do', function(req, res){
  res.send('게시물 추가!');
});

app.get('/board/list.do', function(req, res){
  res.send('게시물 목록!');
});

app.listen(8888, function() {
	console.log('서버 실행중...');
});









