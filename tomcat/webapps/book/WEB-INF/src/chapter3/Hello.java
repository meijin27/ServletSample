package chapter3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter3/*"})
public class Hello extends HttpServlet {

    public void doGet(
        HttpServletRequest request, HttpServletResponse response 
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("NU!dfas!");
        out.println(new java.util.Date());
        out.println("ドゴスギア");
    }


}
