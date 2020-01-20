package grit.task1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class aServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public aServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		String name = (String)request.getParameter("uname");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("nextPage.jsp").include(request, response);
		out.print("<h1>" + reverse(name) + "</h1>");
		
	}
	
	private String reverse(String str) {
		char[] temp = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			temp[str.length() - i -1] = str.toCharArray()[i];
		}
		return new String(temp);
		
	}
	
}
