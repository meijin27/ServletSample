<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Display error message if it exists -->
<c:if test="${not empty error}">
    <div class="alert alert-danger">${error}</div>
</c:if>

<p>追加する商品を入力してください。</p>
<form action="Insert2.action" method="post">
    商品名<input type="text" name="name">
    価格<input type="text" name="price">    
    <input type="submit" value="追加"> 
</form>

<%@include file="../footer.html" %>