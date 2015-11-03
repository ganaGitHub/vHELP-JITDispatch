function login()
{
	var userName = document.loginForm.userName.value;
	var password = document.loginForm.password.value;
	// alert("userName: " + userName + "\n password: " + password);
	
	if(userName == "")
	{
		alert("Please enter userName");
    	document.loginForm.userName.focus();
    	return;
	}
	
//	if(password == "")
//	{
//		alert("Please enter password");
//    	document.loginForm.password.focus();
//    	return;
//	}
	
	document.loginForm.action="LoginAction?param=login";
	document.loginForm.method="POST";
    document.loginForm.submit();
}