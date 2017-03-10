/* express + mysql + select
 */    
var mysql = require('mysql');
var express = require('express');
var bodyParser = require('body-parser');
var app = express();

//express 모듈에 보조 장치 장착한다.
app.use(bodyParser.json()); // JSON 형식으로 넘오온 데이터 처리 
app.use(bodyParser.urlencoded({extended:true}));
app.use(express.static('static'));

var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'java89',
  password : '1111',
  database : 'java89db'
});

connection.connect();

app.get('/board/list.do', function(req, resp){
	resp.writeHead(200, {'Content-Type': 'text/html;charset=UTF-8'});
	resp.write('<html><head><title>게시물목록</title></head><body>');
	resp.write('<h1>게시물목록</h1>');
	resp.write('<p><a href="form.html">새 글</a></p>');
	
	connection.query(
	  'select mno, name, tel, email from memb', 
	  function(err, rows, fields) { // 서버에서 결과를 받았을 때 호출되는 함수
		  if (err) {
			  console.log(err);
			  resp.end('서버 실행중 오류 발생!');
			  return;
		  }
		  
		  for (var i = 0; i < rows.length; i++) {
			  resp.write('<p>' + rows[i].mno + ',' + rows[i].name + ',' + 
					  rows[i].tel + ',' + rows[i].email + '</p>');
		  }
		  resp.write('</body></html>');
		  resp.end();
	});
});

app.post('/board/add.do', function(req, resp){
	resp.writeHead(200, {'Content-Type': 'text/html;charset=UTF-8'});
	resp.write('<html><head><title>게시판</title></head><body>');
	resp.write('<h1>게시물 등록 결과</h1>');
	
	connection.query(
		'insert into memb(name,tel,email,pwd) values(?,?,?,password(?))', 
		//[req.query.name, req.query.tel, req.query.email, req.query.pwd], // GET 요청 파라미터
		[req.body.name, req.body.tel, req.body.email, req.body.pwd], // POST 요청 파라미터
		function(err, rows, fields) { 
		  if (err) {
			  console.log(err);
			  resp.end('서버 실행중 오류 발생!');
			  return;
		  }
		  
		  resp.write('<p>입력성공!</p>')
		  resp.write('</body></html>');
		  
		  resp.end();
	});
});

app.listen(8888, function() {
	console.log('서버 실행중...');
});









