package net.slipp.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import net.slipp.support.MyVaildatorFactory;


@WebServlet("/users/create")
public class CreateUserServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//4자 이상, 12자 이하. 영문자/숫자만 허용 
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		//2자 이상, 10자 이하. 
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		User user = new User(userId, password, name, email);
		Validator validator = MyVaildatorFactory.createValidator();
		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
		if(constraintViolations.size() > 0) {  
			request.setAttribute("user",user);
			String errorMessage = constraintViolations.iterator().next().getMessage();
			forwordJSP(request,response,errorMessage);
			return;
		}
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.addUser(user);
		} catch (SQLException e) {
			 System.out.println("error : " + e.getMessage());
		}
		
		//회원가입이 끝났으면 메인페이지로 이동
		response.sendRedirect("/");
	}
	private void forwordJSP(HttpServletRequest request, HttpServletResponse response, String errorMessage)
			throws ServletException, IOException {
		request.setAttribute("errorMessage",errorMessage);
		RequestDispatcher rd = request.getRequestDispatcher("/form.jsp");
		rd.forward(request, response);
	}
}
