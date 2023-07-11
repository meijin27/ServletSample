package chapter17;

import java.io.IOException;
import java.io.PrintWriter;
import tool.Page;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

@WebServlet(urlPatterns = { "/chapter17/cart-remove" })
public class CartRemove extends HttpServlet{
        public void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        HttpSession session = request.getSession();
        session.removeAttribute("cart");

        out.println("カートを削除しました。");

        Page.footer(out);
        
    }
}
