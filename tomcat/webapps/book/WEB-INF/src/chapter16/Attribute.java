package chapter16;

import bean.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns = { "/chapter16/attribute" })
public class Attribute extends HttpServlet{
    
    public void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        Product p = new Product();
        p.setId(1);
        p.setName("中目黒");
        p.setPrice(300);

        request.setAttribute("product", p);

        request.getRequestDispatcher("attribute.jsp").forward(request, response);

    }
}
