package chapter15;

import bean.Product;
import tool.Page;
import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = { "/chapter15/insert2" })
public class Insert2 extends HttpServlet{
    
    public void doPost(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        try{
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));

            Product p = new Product();
            p.setName(name);
            p.setPrice(price);

            ProductDAO dao = new ProductDAO();
            int Line = dao.insert(p);

            if (Line>0){
                out.println("追加に成功しました！<br>");
                List<Product> list = new ArrayList<>();
                list = dao.search("");
                for (Product po: list){
                    out.println(po.getId());
                    out.println(":");
                    out.println(po.getName());;
                    out.println(":");
                    out.println(po.getPrice());
                    out.println("<br>");

                }
            }

        } catch (Exception e){
            e.printStackTrace(out);
        }

        Page.footer(out);
    }
}