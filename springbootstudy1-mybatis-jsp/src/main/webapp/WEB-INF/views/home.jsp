<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
Hello SpringBoot + MyBatis + JSP : ${message} 
<br><br>  총상품수 : ${totalProductCount}
<br><br> 
<form action="findProductByNo">
<input type="number" name="productNo" placeholder="상품번호"  required="required">
<button type="submit">검색</button>
</form>
<%--
		org.kosta.myproject.controller.ProductController 를 정의 
		productMapper를 생성자에서 DI 
		findProductByNo 메서드에서 상품번호를 클라이언트로부터 전달받아 
		productMapper 를 이용해 상품을 검색한다 
		상품이 존재하면 findbyno-ok.jsp 에서 검색한 상품정보를 보여주고 
		상품이 존재하지 않으면 findbyno-fail.jsp에서 alert 후 home으로 이동시킨다 location.href="/";
 --%>
</body>
</html>














