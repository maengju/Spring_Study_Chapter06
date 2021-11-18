<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

div{
	color:red;
	font-size:8pt;
	font-weight:bold;
}
</style>

</head>
<body>

<h1>WriteForm</h1>



	<img style="width: 140px; height: 140px; cursor: pointer;" alt="꺄루룽" 
		src="/chapter06_SpringWebMaven/image/03.png"
		onclick="location.href='/chapter06_SpringWebMaven/index'">

<form name="wirteForm" id="wirteForm" method="post" action="">

	<table border="1" cellspacing="0"cellpadding="5">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" id="name" >
				<div id="nameDiv"></div></td>
			
		</tr>
		
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" id="id">
			<div id="idDiv"></div></td>
		</tr>
		
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pwd" id="pwd">
			<div id="pwdDiv"></div></td>
		</tr>
		
		<tr>
			<td colspan="2" style=" text-align: right;">
				<input type="button" id="writeBtn" value="회원가입">
				<input type="reset" value="취소">
			</td>
		</tr>
		
	</table>


</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/chapter06_SpringWebMaven/js/user.js"></script>

</body>
</html>