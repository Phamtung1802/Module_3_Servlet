import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/result")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String price = request.getParameter("price");
        String rebate = request.getParameter("rebate");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        double result= Integer.parseInt(price)-(Integer.parseInt(price)*(Integer.parseInt(rebate)*0.01));
            writer.println("Result: " + result+"</p>");
            writer.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
