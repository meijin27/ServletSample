package chapter6;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.Collections;
import java.util.List;

@WebServlet(urlPatterns = { "/chapter6/reserve" })
public class Reserve extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        String count = request.getParameter("count");
        String seat = request.getParameter("seat");

        Page.header(out);
        out.print(count + "名様で");
        out.println(seat + "席のご予約を承りました。");

        String[] values = request.getParameterValues("option");

        if (values != null) {
            for (String value : values) {
                out.println("「" + value + "」");
            }
            out.println("をご用意いたします");
        }
        Page.footer(out);

    }
}
