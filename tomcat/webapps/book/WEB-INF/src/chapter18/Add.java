package chapter18;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import tool.Page;

@WebServlet(urlPatterns = { "/chapter18/add" })
public class Add extends HttpServlet{
    
    public void doGet(
        HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String name = URLEncoder.encode("名前", "UTF-8");
        String value = URLEncoder.encode("値", "UTF-8");
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);        
        
    }


}
