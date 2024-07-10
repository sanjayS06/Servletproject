package com.avg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Percentage")
public class Percentageservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Percentageservlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();

	int maths= Integer.parseInt(request.getParameter("maths"));
	int physics= Integer.parseInt(request.getParameter("physics"));
	int chemistry= Integer.parseInt(request.getParameter("chemistry"));
	int biology= Integer.parseInt(request.getParameter("biology"));
	
	int avg=(maths+physics+chemistry+biology)/4;
	
	String result="";
	
     if(avg<35) {
    	 result="fail";
     }
     else if(avg<60) {
    	 result="Second class";
     }
     else if(avg<75) {
    	 result="First class";
    	 
     }
     else {
    	 result="distinction";
     }
     request.setAttribute("finalresult", result);
		
	
	
	RequestDispatcher r=request.getRequestDispatcher("display.jsp");
	r.forward(request, response);
	
	
	}
	
	
	
	
	
	
		
	

}
