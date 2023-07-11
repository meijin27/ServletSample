package chapter9;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/chapter9/forward-from" })
public class ForwardFrom extends HttpServlet {

    

    public void doGet(
        HttpServletRequest request, HttpServletResponse response 
    ) throws ServletException, IOException {
        request.getRequestDispatcher("/chapter9/forward-to").forward(request, response);

    }    
}
