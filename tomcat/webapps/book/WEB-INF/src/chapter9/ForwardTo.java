package chapter9;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/chapter9/forward-to" })
public class ForwardTo extends HttpServlet {

    

    public void doGet(
        HttpServletRequest request, HttpServletResponse response 
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("NU!dfas!");
        out.println(new java.util.Date());
        out.println("ドゴスギア");
    }    
}
