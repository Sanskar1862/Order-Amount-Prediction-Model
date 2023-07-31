package com.highradius.implementation;

import java.util.List;

import com.highradius.model.Invoice;

public interface InvoiceDao {
    List<Invoice> getInvoice();
    void insertInvoice(Invoice invoice);
    void updateInvoice(int id, Invoice invoice);
    void deleteInvoice(int id);
}
