package chapter11;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/chapter11/count-thread2" })
public class CountThread2 extends HttpServlet {
    
    
    private int count;
    
    public synchronized void incrementCount() {
        count++;
    }
    
    public void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        incrementCount();
        out.println(count);

        Page.footer(out);
    }

}
