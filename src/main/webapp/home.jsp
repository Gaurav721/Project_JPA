<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="addAlien">
      <label>Aid</label>
      <input type="text" name="aid"><br>
      <label>Aname</label>
      <input type="text" name="aname"><br>
      <label>tech</label>
      <input type="text" name="tech"><br>
      <input type="submit"><br>  
      
      <hr>
      <h5>Enter aid and fetch data</h5> 
   
   </form>
   
      <form action="getAlien">
      <label>Aid</label>
      <input type="text" name="aid"><br>  
      <input type="submit"><br>   
   
   </form>
</body>
</html>