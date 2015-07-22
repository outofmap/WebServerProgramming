package net.slipp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloworld", urlPatterns = { "/helloworld","/hello","/hello/world","/hi" })
public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String name = req.getParameter("name");
		//System.out.println("Request Success!");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("<title>SLiPP</title>");
		out.println("<body>");
		out.println("<h1>Hello world!</h1>");
		out.println("여기는 servlet");
		out.println("</body>");
		out.println("</html>");
		
		//resp.getWriter().print(name + "Hello World!");
	}
}
