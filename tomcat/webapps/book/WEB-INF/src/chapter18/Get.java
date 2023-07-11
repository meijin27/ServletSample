package chapter18;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

@WebServlet(urlPatterns = { "/chapter18/get" })
public class Get extends HttpServlet{
    
    public void doGet(
        HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        Page.header(out);

        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie cookie: cookies){
                String name = URLDecoder.decode(cookie.getName(), "UTF-8");
                String value = URLDecoder.decode(cookie.getValue(), "UTF-8");
                out.println("<p>"+name+" : "+value+"</p>");
            } 
        } else {
                out.println("クッキーは存在しません");
        }
        
        Page.footer(out);    
        
    }


}
