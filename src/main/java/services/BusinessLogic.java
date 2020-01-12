package services;

import model.Tax;
import model.TaxType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusinessLogic {
    List<TaxType> getPopularTaxType();
    List<Tax> getTaxFromParam(String fio, String gosNumber);
    List<Tax> getAllTax();
    List<TaxType> getAllTaxTypes();
}
