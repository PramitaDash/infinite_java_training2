package com.java.otp;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerServlet
 */
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerServlet() {
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
		String pwd = request.getParameter("passWord");
		String reType = request.getParameter("retypePassword");
		if(pwd.equals(reType)) {
			String userName = request.getParameter("userName");
		CustomerDAO dao = new CustomerDAOImpl();
		try {
			Customer customer = dao.searchByUserName("userName");
			if(customer==null) {
				Customer customer1 = new Customer();
				customer1.setCustomer_Firstname(request.getParameter("firstname"));
				customer1.setCustomer_LastName (request.getParameter("lastname"));
				customer1.setCustomer_UserName(request.getParameter("userName"));
				String encr = EntryptPassword.getCode(request.getParameter("passWord"));
				customer1.setCustomer_Password(encr);
				customer1.setCustomer_Email(request.getParameter("email"));
				customer1.setCustomer_PhoneNo (request.getParameter("PhoneNo"));
				out.println(dao.addCustomerDao(customer1));
			}else {
				out.println("UserName Already Exixsts...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}else {
			out.println("invalid password");
		}
	}
}
