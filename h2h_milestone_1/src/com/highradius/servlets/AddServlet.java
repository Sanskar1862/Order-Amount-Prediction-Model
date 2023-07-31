package com.highradius.servlets;

import com.highradius.implementation.InvoiceDao;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;

public class AddServlet {
    public void main(String[] args) {
        InvoiceDao invoiceDao = new InvoiceDaoImpl();
        Invoice invoice = new Invoice(1, 24224233434L, 3533, "Greece", 3290, "22-03-2023", 1232.90, "USD", 21314542323L, 43533.66);
        addInvoice(invoiceDao,invoice);
    }
    public void addInvoice(InvoiceDao invoiceDao, Invoice invoice) {
        invoiceDao.insertInvoice(invoice);
    }
}
