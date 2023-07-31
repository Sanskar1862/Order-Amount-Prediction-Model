package com.highradius.servlets;

import java.util.List;

import com.highradius.implementation.InvoiceDao;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;

public class DataLoadingServlet {
    public static void main(String[] args) {
        InvoiceDao invoiceDao = new InvoiceDaoImpl();
        List<Invoice> invoices = getInvoice(invoiceDao);
        System.out.println(invoices);
    }

    private static List<Invoice> getInvoice(InvoiceDao invoiceDao) {
        return invoiceDao.getInvoice();
        
    }
}
