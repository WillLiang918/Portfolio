$(document).ready(function(){
	//Update user name JS
	$('#updateUsername').submit(function(){
		$.ajax({
			url: 'update',
			type: 'POST',
			dataType: 'json',
			data: $('#updateUsername').serialize(),
			success: function(data){
				if(data.isValid){
					$('#displayName').html('Your name is: ' + data.username);
					$('#displayName').slideDown(500);
				}
				else {
					alert('Please enter a valid username!')
				}
			}
		});
		return false;
	});
	
	//Forgot Password
	$('#forgotPassword').submit(function(){
		$.ajax({
			url: 'update',
			type: 'POST',
			dataType: 'json',
			data: $('#forgotPassword').serialize(),
			success: function(data){
				if(data.isValid){
					$('#displayName').html('Your name is: ' + data.username);
					$('#displayName').slideDown(500);
				}
				else {
					alert('Please enter a valid username!')
				}
			}
		});
		return false;
	});
});