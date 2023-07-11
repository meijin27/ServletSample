package chapter19;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
public class ParamFilter implements Filter{
    
    private String message;

    public void init(FilterConfig config) throws ServletException {
        message = config.getInitParameter("message");
    }

    public void doFilter(
        ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = response.getWriter(); 
        out.println(message);
        chain.doFilter(request, response); 
    }

    public void destroy(){}
}
