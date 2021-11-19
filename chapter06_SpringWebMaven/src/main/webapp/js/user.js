
//회원가입
$('#writeBtn').click(function(){
	$('#idDiv').empty();
	$('#nameDiv').empty();
	$('#pwdDiv').empty();
	
	//name 속성
	if($('#name').val() == '') {
		$('#nameDiv').html('이름 입력');
		$('#name').focus();
	}else if($('#id').val()=='')
		$('#idDiv').html('아이디 입력');
	else if($('#pwd').val()=='')
		$('#pwdDiv').html('비밀번호 입력');
	else 
		$.ajax({
			url:'/chapter06_SpringWebMaven/user/write'
			,type :'post'
			,data : $('#writeForm').serialize()
			,success : function(){
				alert("회원가입완료");
			}
			,error : function(err){
				console.log(err);
			}
		});
		
});

//중복체크
$('#id').focusout(function(){
   //alert('zzz');
   $('#idDiv').empty();
   
   if($('input[name="id"]').val()=='')
      $('#idDiv').html('아이디 입력');
   else
      $.ajax({
         url: '/chapter06_SpringWebMaven/user/checkId',
         type: 'post',
         data: 'id='+$('#id').val(),
         dataType: 'text',//서버로부터 받을 타입 exist- 사용불가능, non_exist= 사용가능
         success: function(data){
            if(data=='exist'){
               $('#idDiv').text('사용 불가능');
            }else if(data=='non_exist'){
               $('#idDiv').text('사용 가능');
            }
         },
         erorr: function(err){
            console.log(err);
         }
         
         
      });
            
});