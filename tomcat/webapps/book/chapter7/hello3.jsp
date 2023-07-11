<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%-- メッセージの出力 --%>
<p>Hello!!</p>
<p>はじめてのJSPですね！！</p>

<p><% out.println(new java.util.Date()); %></p>

<%@include file="../footer.html" %>