package chapter22;

import bean.Product;
import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.List;

@WebServlet(urlPatterns = { "/chapter22/jstl" })
public class JSTL extends HttpServlet{
    
    public void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        try {
            ProductDAO dao = new ProductDAO();
            List<Product> list = dao.search("");

            request.setAttribute("list", list);
            request.getRequestDispatcher("jstl.jsp").forward(request, response);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace(out);
        }

    }
}



