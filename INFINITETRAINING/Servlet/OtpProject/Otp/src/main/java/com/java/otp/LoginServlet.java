package com.java.otp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("userName");
		String encr = EntryptPassword.getCode(request.getParameter("passWord"));
		CustomerDAO dao = new CustomerDAOImpl();
		try {
			Customer customer = dao.searchByUserName(user);
			if(customer!=null) {
				String storedPassword = customer .getCustomer_Password();
				System.out.println(storedPassword);
				
				if(encr.equals(storedPassword)) {
					out.println("Welcome");
				}else {
					System.out.println("Input Password: " +encr);
					System.out.println("Stored Password: " +storedPassword);
					out.println("Password is incorrect");
				}
			}else {
				out.println("userName Doesn't Exists...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
