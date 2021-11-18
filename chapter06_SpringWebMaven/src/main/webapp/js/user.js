$('#writeBtn').click(function(){
	
	
});

//중복체크
$('#id').focusout(funtion(){
	$('#idDiv').empty();
	
	if($('#id').val()=='')
		$('#idDiv).html('id입력');
	else
		$.ajax({
			url:'/chapter06_SpringWebMaven/user/checkId'
			,type : 'post'
			,data : 'id='+$('#id').val()
			,dataType:'text'
			,success: function(data){
				if(data=='exist'){
					$('#idDiv').text('사용불가능');
				}else if(data=='non_exist'){
					$('#idDiv').text('사용 가능');
				}
			}
			,err : function(err){
				console.log(err);
			}
		});	
});