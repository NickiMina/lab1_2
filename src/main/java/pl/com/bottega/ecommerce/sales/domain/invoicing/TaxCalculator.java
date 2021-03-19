package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.lang.reflect.Type;

public interface TaxCalculator {


    Tax calculate(Money netto,RequestItem item);
    //wartosc netto i typ i zwracam tax

}
