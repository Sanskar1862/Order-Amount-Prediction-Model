package com.highradius.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;

/**
 * Servlet implementation class CreateInvoice
 */
@WebServlet("/CreateInvoice")
public class CreateInvoice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateInvoice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Adding Data to Database
		
		long customerOrderID = Long.parseLong(request.getParameter("customer_order_id"));
		long salesOrg =  Long.parseLong(request.getParameter("sales_org")); ;
		String distributionChannel = request.getParameter("distribution_channel");
		String division = request.getParameter("division");
		float releasedCreditValue = Float.parseFloat(request.getParameter("released_credit_value"));
		String purchaseOrderType =  request.getParameter("purchase_order_type");
		long  companyCode = Long.parseLong(request.getParameter("company_code"));
	    String orderCreationDate = request.getParameter("order_creation_date");
	    String orderCreationTime = request.getParameter("order_creation_time");
	    String creditControlArea = request.getParameter("credit_control_area");
	    long soldToParty = Long.parseLong(request.getParameter("sold_to_party"));
	    float orderAmount = Float.parseFloat(request.getParameter("order_amount"));
	    String requestedDeliveryDate = request.getParameter("requested_delivery_date");
	    String orderCurrency = request.getParameter("order_currency");
	    String creditStatus = request.getParameter("credit_status");
	    long customerNumber = Long.parseLong(request.getParameter("customer_number"));
	    float amountInUsd = Float.parseFloat(request.getParameter("amount_in_usd"));
	    long uniqueCustNumber = Long.parseLong(request.getParameter("unique_cust_id"));
	    
	    Invoice inv = new Invoice(customerOrderID, salesOrg, distributionChannel, division, releasedCreditValue, purchaseOrderType, companyCode, orderCreationDate, orderCreationTime, creditControlArea, soldToParty, orderAmount, requestedDeliveryDate, orderCurrency, creditStatus, customerNumber, amountInUsd, uniqueCustNumber);
	    
	    InvoiceDaoImpl daoImpl = new InvoiceDaoImpl();
	    daoImpl.insertInvoice(inv);
	    Gson gson = new Gson();
		response.setHeader("Acess-Control-Allow-Origin", "*");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().append(gson.toJson(inv));

//		try {
//			Connection con = ConnectionProvider.createConnection();
//			String query = "Select * From hrcdb.h2h_oap ORDER BY Sl_no Limit 1";
//			Statement stmt = con.createStatement();
//			ResultSet rSet = stmt.executeQuery(query);
//			Invoice invTest = new Invoice(rSet.getLong(1), rSet.getLong(2), rSet.getInt(3), rSet.getString(4), rSet.getString(5), rSet.getFloat(6), rSet.getString(7), rSet.getLong(8), rSet.getString(9), rSet.getString(10), rSet.getString(11), rSet.getLong(12), rSet.getFloat(13), rSet.getString(14), rSet.getString(15), rSet.getString(16), rSet.getLong(17), rSet.getFloat(18), rSet.getLong(19));
//			
//			
////			Closing Connection
//			con.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
