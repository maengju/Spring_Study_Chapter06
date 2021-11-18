<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%-- <h1>${param.x }+${param.y } = ${param.x + param.y }</h1>
 --%>
 
 <%-- <h1>${x }+${y } = ${x + y }</h1> <!-- 웹에는 자료형이 없기때문에 string으로 받아도 계산가능 --> --%>

<h1>${sumDTO.x } + ${sumDTO.y } = ${sumDTO.x+ sumDTO.y }</h1>
</body>
</html>