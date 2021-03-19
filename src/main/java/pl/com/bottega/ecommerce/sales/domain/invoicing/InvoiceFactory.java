package pl.com.bottega.ecommerce.sales.domain.invoicing;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;

import java.net.IDN;

public class InvoiceFactory {
    public static Invoice createInvoice(Id id, ClientData clientData){
        return new Invoice(id, clientData);
    }
}
