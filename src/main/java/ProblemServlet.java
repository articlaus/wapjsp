import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * Created by: Ganbat Bayar
 * On: 11/13/2018
 * Project: wapjsp
 */
public class ProblemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String uuid = UUID.randomUUID().toString();
        PrintWriter out = resp.getWriter();
        ServletContext sc = this.getServletContext();
        String spemail = sc.getInitParameter("support-email");
        out.print("<html><head><title>Request Accepted</title></head><body>");
        out.print("<p>Thank you! " + name + "<br/> for contacting us. We should receive " +
                "reply from us with in 24 hrs in your email address " + email +
                "<br/>Let us know in our support email" + spemail + " if you don’t receive reply " +
                "within 24 hrs. Please be sure to attach your reference<br/>" +
                uuid + "<br/> in your email.</p>");
        out.print("</body></html>");

    }
}
