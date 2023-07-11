package chapter4;


import tool.Page;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter4/hello5"})
public class Hello5 extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        Page.header(out);
            

        out.println("<p>Congraturations!</p>");
        out.println("<p>おめでとう！</p>");
        out.println("<p>" + new java.util.Date() + "</p>");

        Page.footer(out);

    }

}