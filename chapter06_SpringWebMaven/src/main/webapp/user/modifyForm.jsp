<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>modifyForm</h1>

수정할 아이디 입력 : <input type="text" id="searchId">
<input type="button" id="searchBtn" value="검색">
<br><br>
<div id="resultDiv"></div>
<br><br>

<div id="modifyFormDiv">
	<form id = "modifyForm" action="">
		<table border="1" cellspacing="0"cellpadding="5">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" id="name" >
					<div id="nameDiv"></div></td>
				
			</tr>
			
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" id="id" readonly="readonly">
				</td>
			</tr>
			
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pwd" id="pwd">
				<div id="pwdDiv"></div></td>
			</tr>
			
			<tr>
				<td colspan="2" style=" text-align: right;">
					<input type="button" id="modifyBtn" value="회원정보수정">
					<input type="reset" value="다시작성" id="resetBtn">
				</td>
			</tr>
			
		</table>
			
	</form>
</div>




<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#modifyFormDiv').hide();
	
	$('#searchBtn').click(function(){
		$('#resultDiv').empty();
		
		$.ajax({
			url: '/chapter06_SpringWebMaven/user/getUser'
			,type : 'post'
			,data : {'searchId' : $('#searchId').val()}
			/* ,dataType:'json' */
			//서버에서 받아올 데이터는 TEXT, HTML, XML, JSON 형식을 지정할 수 있다.
         	//생략하면 요청한 자료에 맞게 자동으로 형식이 설정된다.
			,success:function(data){
				console.log(JSON.stringify(data));
				if(data==""){
					$('#resultDiv').text("찾고자하는 데이터없음");
					$('#resultDiv').css('color','red');
					$('#resultDiv').css('font-weight','bold');
					$('#resultDiv').css('font-size','8');
					$('#modifyFormDiv').hide();
				}else{
					$('#modifyFormDiv').show();
					
					$('#name').val(data.name);
					$('#id').val(data.id);
					$('#pwd').val(data.pwd);
				}
				
			}
			,error:function(err){
				console.log(err);
				
			}
			
		});
	});
	
	//reset
	$('#resetBtn').click(function(){
		//이벤트 강제호출 trigger
		$('#searchBtn').trigger('click');
	});
	
	
	$('#modifyBtn').click(function(){
		$.ajax({
			url : '/chapter06_SpringWebMaven/user/modify'
			,type:'post'
			,data: $('#modifyForm').serialize()
			,success : function(data){
				alert('회원정보수정완료');
				location.href='/chapter06_SpringWebMaven/user/list';
			}
			,error : function(err){
				console.log(err);
			}
		});
		
		
	});
	
});
</script>
</body>
</html>