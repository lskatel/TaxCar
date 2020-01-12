package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.BusinessLogic;

import java.util.Map;

@Controller
public class TaxController {

    @Autowired
    private BusinessLogic businessLogic;

    @GetMapping("/tax")
    public String taxGet(Map<String, Object> model) {
        model.put("topTaxes", businessLogic.getPopularTaxType());
        return "index";
    }

    @PostMapping("/tax")
    public String taxPost(
            @RequestParam(name = "fio") String fio,
            @RequestParam(name = "gosnumber") String gosnumber,
            Map<String, Object> model) {
        model.put("topTaxes", businessLogic.getPopularTaxType());
        model.put("taxes", businessLogic.getTaxFromParam(fio, gosnumber));
        return "index";
    }

    @GetMapping("/tax/admin")
    public String taxAdminGet(Map<String, Object> model) {
        model.put("allTaxTypes", businessLogic.getAllTaxTypes());
        model.put("allTaxes", businessLogic.getAllTax());
        return "admin";
    }
}
