var mysql = require('mysql'); // mysql 모듈 설치가 필요하다.


var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'java89',
  password : '1111',
  database : 'java89db'
});

connection.connect();
console.log("연결 되었음.");

connection.query(
  'insert into memb(name,tel,email,pwd) values(?,?,?,password(?))', 
  ['오호라!', '1111-2222', 'ohora111@test.com', '1111'], // in-param에 들어갈 값을 배열에 담는다.
  function(err, rows, fields) {
	  if (err) throw err;
	  
	  console.log("입력 성공!");
});

connection.end(); // 실행 중인 SQL이 있으면, 모두 종료한 후에 연결을 끊는다.
console.log("연결 끊었음.");




