import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/PizzaOrder")
public class PizzaOrderServlet extends HttpServlet {
    protected String[] crustTypes = {"floppy-thin", "crunchy-thin", "deep-dish"};
    protected String[] toppings = {"pepperoni", "pineapple", "olive", "garlic", "spinach", "sausage"};

    //First: Where is my form SENDING the post request? Refactor the action to be a servlet with a doPost method ready to 'hear' that come in
    //Second: doPost where that action sends it : handle getting the info from the form, repackaging that info, and then sending that back up via requestDispatcher
    //Third your jsp has a directive listening for that variable to come back through from the servlet that was processing that POST request

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        int crustTypeIndex = Integer.parseInt(request.getParameter("crust"));
        String toppings = request.getParameter("toppingPepperoni") + ", "
                + request.getParameter("toppingPineapple") + ", "
                + request.getParameter("toppingOlive") + ", "
                + request.getParameter("toppingGarlic") + ", "
                + request.getParameter("toppingSpinach") + ", "
                + request.getParameter("toppingSausage");

        String customerAddress = request.getParameter("street") + "\n"
                + request.getParameter("city") + "\n"
                + request.getParameter("zip") + "\n"
                + request.getParameter("state");

        /*response.sendRedirect("/src/main/webapp/pizzaSummary.jsp");*/
        request.getSession().setAttribute("crustSelection", crustTypes[crustTypeIndex]);
        request.getSession().setAttribute("toppings", toppings);
        request.getSession().setAttribute("customerAddress", customerAddress);
        request.getRequestDispatcher("pizzaSummary.jsp").forward(request,response);
    }

}

