import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessServlet", urlPatterns="/guess")
public class GuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        int randomNum = (int) (Math.random() * 3) + 1;
        int userGuess = Integer.parseInt(request.getParameter("guess"));
        if(userGuess == randomNum){
            response.sendRedirect("/correct");
        } else {
            response.sendRedirect("/incorrect");
        }
    }
}
