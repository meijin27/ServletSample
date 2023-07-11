package chapter23;

import bean.Product;
import dao.ProductDAO;
import tool.Action;
import javax.servlet.http.*;
import java.util.List;

public class InsertAction extends Action{
    
    public String execute(
        HttpServletRequest request, HttpServletResponse response) throws Exception{

            String name = request.getParameter("name");
            String priceStr = request.getParameter("price");
            Integer price = null;
    
            try {
                price = Integer.parseInt(priceStr);
            } catch (NumberFormatException e) {
                // Set error message in request scope
                request.setAttribute("error", "Invalid price. Please enter a number.");
                // Redirect to the product registration page
                return "insert.jsp"; // replace with the name of your product registration page
            }
    
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        ProductDAO dao = new ProductDAO();
        dao.insert(p);

        List<Product> list = dao.search("");

        request.setAttribute("list", list);

        return "list.jsp";

    }
}
