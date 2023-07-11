<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<p>検索キーワードを入力してください。</p>
<form action="Search.action" method="post">
    <input type="text" name="keyword">
    <input type="submit" value="検索"> 
</form>

<%@include file="../footer.html" %>