package com.dxc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.Jdbcdao.UserJdbcDAO;
import com.dxc.Jdbcservice.UserServiceImple;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		
		if(UserServiceImple.validate(un, pw)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("usnme", un);
			RequestDispatcher rd = request.getRequestDispatcher("DisplayStudents.jsp");
			rd.forward(request, response);
			
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}

}
