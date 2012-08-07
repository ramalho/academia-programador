<%--
    Document   : index
    Created on : 07/08/2012, 10:18:54
    Author     : turma3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Caracteres Unicode</h1>

        <form action="." method="get">
            Código de início: <input type="text" name="inicio">
            <input type="submit">
        </form>

        <p></p>

        <table border="1">
            <tr>
                    <th>decimal</th><th>hexadecimal</th><th>caractere</th>
            </tr>
        <%
            int inicioInt = 0;
            String inicioStr = request.getParameter("inicio");
            if (inicioStr != null) {
                 inicioInt = Integer.parseInt(inicioStr);
            }
            for (int i=inicioInt; i<(inicioInt+256); i++) {
                    out.println("<tr><td>");
                    out.println(i);
                    out.println("</td><td>");
                    out.println(Integer.toString(i, 16));
                    out.println("</td><td>");
                    out.println((char)(i));
                    out.println("</td></tr>");
            }
        %>
        </table>
    </body>
</html>
