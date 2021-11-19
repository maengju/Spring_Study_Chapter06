<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>deleteForm</h1>

삭제할 아이디 입력 : <input type="text" id="searchId">
<input type="button" id="searchBtn" value="검색">
<br><br>
<div id="resultDiv"></div>




<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#deleteFormDiv').hide();
	
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
					
					
				}else{
					if(confirm('ㄹㅇ삭제?')){
						$.ajax({
							url : '/chapter06_SpringWebMaven/user/delete'
							,type:'post'
							,data: {'searchId' : $('#searchId').val()}
							,success : function(data){
								alert('회원정보삭제완료');
								location.href='/chapter06_SpringWebMaven/user/list'
							}
							,error : function(err){
								console.log(err);
							}
						});
					}
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
	
	
});
</script>


</body>
</html>