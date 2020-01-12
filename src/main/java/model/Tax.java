package model;

public class Tax {
    private TaxType taxType;
    private String gosnumber;
    private String mark;
    private String model;
    private String fio;

    public Tax() {

    }

    public String getTaxName() {
        return taxType.getName();
    }

    public Double getTaxSumm() {
        return taxType.getSumm();
    }

    public TaxType getTaxType() {
        return taxType;
    }

    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    public String getGosnumber() {
        return gosnumber;
    }

    public void setGosnumber(String gosnumber) {
        this.gosnumber = gosnumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
