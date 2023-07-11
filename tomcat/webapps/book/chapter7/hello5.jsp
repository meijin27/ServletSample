<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@page import="java.util.Date" %>

<%-- メッセージの出力 --%>
<p>Hello!!</p>
<p>はじめてのJSPですね！！</p>

<p><%=new Date() %></p>

<%@include file="../footer.html" %>