import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    protected int count = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        boolean reset = Boolean.parseBoolean(request.getParameter("reset"));
        if(reset){
            count = 0;
        }else {
            count++;
        }
        out.println("<p>COUNT: " + count);
    }
}