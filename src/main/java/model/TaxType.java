package model;

public class TaxType {
    private String name;
    private Double summ;

    public TaxType(String name, Double summ) {
        this.name = name;
        this.summ = summ;
    }

    public TaxType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSumm() {
        return summ;
    }

    public void setSumm(Double summ) {
        this.summ = summ;
    }
}
