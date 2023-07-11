package chapter4;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

public class Hello3 extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>ServLet/JSP Sample Programs</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<p>Hello!</p>");
        out.println("<p>地球の皆様こんにちは</p>");
        out.println("<p>" + new java.util.Date() + "</p>");

        out.println("</body>");
        out.println("</html>");

    }

}