package com.highradius.implementation;

import java.util.List;

import com.highradius.model.Invoice;
import com.highradius.connection.DatabaseConnection;

public class InvoiceDaoImpl implements InvoiceDao {

    private DatabaseConnection databaseConnection;
    @Override
    public List<Invoice> getInvoice() {
        return databaseConnection.getInvoices();
    }

    @Override
    public void insertInvoice(Invoice invoice) {
        databaseConnection.addInvoice(invoice);
    }

    @Override
    public void updateInvoice(int id, Invoice invoice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInvoice'");
    }

    @Override
    public void deleteInvoice(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteInvoice'");
    }
    
}
