function createRequest()
{
	
	var issueName = document.createRequestForm.issueName.value;
	// var password = document.createRequestForm.password.value;
	// alert("issueName: " + issueName + "\n password: " + password);
	// alert("issueName: " + issueName);
	if(issueName == "Select")
	{
		alert("Please select a valid issue!");
		return;
	}
	document.createRequestForm.action="CreateRequestAction?param=create";
	document.createRequestForm.method="POST";
    document.createRequestForm.submit();
}

function assign()
{		
		document.createRequestForm.action="CreateRequestAction?param=assign";
		document.createRequestForm.method="POST";
		document.createRequestForm.submit();
}

function cancel()
{
		document.createRequestForm.action="CreateRequestAction?param=cancel";
		document.createRequestForm.method="POST";
		document.createRequestForm.submit();
}

function acceptRequest()
{	
	document.techActionForm.action="TechAction?param=accept";
	document.techActionForm.method="POST";
    document.techActionForm.submit();
}

function jobDone()
{	
	document.techJobForm.action="TechAction?param=jobdone";
	document.techJobForm.method="POST";
    document.techJobForm.submit();
}