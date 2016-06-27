<html>
    <head>
        <title>Enter Data</title>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
    	<form action="EnterData" method="post">
    		<label for="numbers">Female</label>
    	    <input type="text" placeholder="numbers" required="" name="numbers" />
		    <button type="submit" name="button" value="Run">Run</button>
		</form>
		<%=(String)request.getAttribute("mean")%>
		
    </body>
</html>