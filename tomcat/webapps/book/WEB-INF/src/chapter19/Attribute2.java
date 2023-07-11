package chapter19;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;
import java.io.FileInputStream;

@WebServlet(urlPatterns = { "/chapter19/attribute2" })
public class Attribute2 extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        Page.header(out);

        ServletContext context = getServletContext();
        String path = context.getRealPath("/WEB-INF/setting.txt");

        FileInputStream in = new FileInputStream(path);
        List<String> list = Collections.list(context.getAttributeNames());
        for (String name:list){
            out.println("<p>"+name+" : ");
            out.println(context.getAttribute(name));
            out.println("</p>");
        }

        Page.footer(out);

    }

}
