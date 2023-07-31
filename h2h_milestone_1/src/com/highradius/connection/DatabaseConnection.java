package com.highradius.connection;

import java.util.List;

import com.highradius.model.Invoice;

public class DatabaseConnection {
    private List <Invoice> invoices;

    public List<Invoice> getInvoices() {
        return invoices;
    }
    public void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }
}
