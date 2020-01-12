package services;

import model.Tax;
import model.TaxType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DBService {
    List<TaxType> getAllTaxTypeList();
    void addTaxType(TaxType taxType);

    List<Tax> getAllTaxList();
    void addTax(Tax tax);
}
