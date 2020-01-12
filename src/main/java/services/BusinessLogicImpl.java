package services;

import model.Tax;
import model.TaxType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Stream;

public class BusinessLogicImpl implements BusinessLogic {

    @Autowired
    private DBService dbService;

    public BusinessLogicImpl() {
    }

    @Override
    public List<TaxType> getPopularTaxType() {
        List<TaxType> res = new ArrayList<>();

        Map<TaxType, Integer> taxTypeIntegerMap = new HashMap<>();
        for (Tax tax : dbService.getAllTaxList()) {
            TaxType taxType = tax.getTaxType();

            if (!taxTypeIntegerMap.containsKey(taxType)) {
                taxTypeIntegerMap.put(taxType, 1);
            } else {
                taxTypeIntegerMap.put(taxType, taxTypeIntegerMap.get(taxType) + 1);
            }
        }

        Stream<Map.Entry<TaxType, Integer>> sorted = taxTypeIntegerMap.entrySet().stream().sorted(
                Map.Entry.<TaxType, Integer>comparingByValue().reversed());
        sorted.forEach(e -> res.add(e.getKey()));

        if (res.size() > 5) {
            List<TaxType> res_5 = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                res_5.add(res.get(i));
            }

            return res_5;
        }

        return res;
    }

    @Override
    public List<Tax> getTaxFromParam(String fio, String gosNumber) {
        List<Tax> res = new LinkedList<>();

        for (Tax tax : dbService.getAllTaxList()) {
            if (!fio.isEmpty() && !gosNumber.isEmpty()) {
                if (tax.getFio().equals(fio) && tax.getGosnumber().equals(gosNumber)) {
                    res.add(tax);
                }
            } else if (!fio.isEmpty() && gosNumber.isEmpty()) {
                if (tax.getFio().equals(fio)) {
                    res.add(tax);
                }
            } else if (fio.isEmpty() && !gosNumber.isEmpty()) {
                if (tax.getGosnumber().equals(gosNumber)) {
                    res.add(tax);
                }
            }
        }

        return res;
    }

    @Override
    public List<Tax> getAllTax() {
        return dbService.getAllTaxList();
    }

    @Override
    public List<TaxType> getAllTaxTypes() {
        return dbService.getAllTaxTypeList();
    }
}
