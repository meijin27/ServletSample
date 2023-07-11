package chapter18;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import tool.Page;

@WebServlet(urlPatterns = { "/chapter18/remove" })
public class Remove extends HttpServlet{
    
    public void doGet(
        HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        

        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie cookie: cookies){
                cookie.setMaxAge(0);
                response.addCookie(cookie);
        
            }         
        }
    }

}
