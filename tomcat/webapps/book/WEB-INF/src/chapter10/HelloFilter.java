package chapter10;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;

public class HelloFilter implements Filter {

    public void doFilter(
            ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        PrintWriter out = response.getWriter();
        
        out.println("[HelloFilter(pre)]");
        chain.doFilter(request, response);
        out.println("[HelloFilter(post)]");
    }

    public void init(FilterConfig filtercConfig) {
    }

    public void destroy() {
    }
}
