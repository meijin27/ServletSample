<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%@page import="java.lang.Math" %>

<%! double countA=Math.random(); %>

<p>宣言による変数countAは<%=countA%></p>
<p><%=Math.random()%></p>
<p><% out.println(Math.random());%></p>

<%@include file="../footer.html" %>