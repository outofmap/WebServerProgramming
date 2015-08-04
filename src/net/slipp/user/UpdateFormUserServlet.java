package net.slipp.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/users/updateform")
public class UpdateFormUserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object object = session.getAttribute(LoginServlet.SESSION_USER_ID);
		if(object == null) {
			resp.sendRedirect("/");
			return;
		}
		//session의 attribute값은 userId로 정했음. object를 String으로 downcasting해준다.
		String userId = (String)object;
		System.out.println("User Id: "+userId);
		UserDAO userDao = new UserDAO();
		try {
			User user = userDao.findByUserId(userId);
			req.setAttribute("user",user);
			//session에 user를 갖고있는 채로 update_form.jsp로 redirect
			RequestDispatcher rd = req.getRequestDispatcher("/update_form.jsp");
			rd.forward(req, resp);
			
		} catch (SQLException e) {
			
		}
		
	}
}
