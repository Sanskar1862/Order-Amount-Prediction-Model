package com.highradius.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;

/**
 * Servlet implementation class UpdateInvoice
 */
@WebServlet("/UpdateInvoice")
public class UpdateInvoice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateInvoice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long id = Long.parseLong(request.getParameter("idUp"));
		String st = request.getParameter("divisionUp");
		Invoice iv = new Invoice();
		iv.setDivision(st);
		
		InvoiceDaoImpl daoImpl = new InvoiceDaoImpl();
		daoImpl.updateInvoice(id, iv);
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Division at Sl_no "+id+" has been changed to "+st+"</h1>");
		pw.close();
		
	}

}
