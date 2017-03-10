/* express 프레임워크를 사용하여 웹 요청 처리하기
 */    
var express = require('express');
var app = express();

app.get('/', function(req, res){
  res.send('hello world');
});

app.listen(8888);









