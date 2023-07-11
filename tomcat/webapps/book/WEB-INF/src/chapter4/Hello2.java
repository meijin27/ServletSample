package chapter4;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter4/*"})
public class Hello2 extends HttpServlet {

    public void doGet(
        HttpServletRequest request, HttpServletResponse response 
    ) throws ServletException, IOException {

        response.setContentType("text/plain; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("AAAAAAA!");
        out.println(new java.util.Date());
        out.println("ドゴスギア");
    }


}