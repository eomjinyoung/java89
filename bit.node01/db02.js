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
  'select mno, name, tel, email, pwd from memb', 
  function(err, rows, fields) { // 서버에서 결과를 받았을 때 호출되는 함수
	  if (err) throw err;
	  
	  for (var i = 0; i < rows.length; i++) {
		  console.log(rows[i].mno, rows[i].name, rows[i].tel, rows[i].email, rows[i].pwd);
	  }
});

connection.end(); // 실행 중인 SQL이 있으면, 모두 종료한 후에 연결을 끊는다.
console.log("연결 끊었음.");