package services;

import model.Tax;
import model.TaxType;

import java.util.LinkedList;
import java.util.List;

public class DBServiceImpl implements DBService {
    private final List<TaxType> taxTypeList = new LinkedList<>();
    private final List<Tax> taxList = new LinkedList<>();

    public DBServiceImpl() {
        fillTaxType();
        fillTax();
    }

    private void fillTaxType() {
        taxTypeList.add(new TaxType(
                "Превышение установленной скорости движения транспортного средства на величину более 20, но не более 40 километров в час",
                500D));
        taxTypeList.add(new TaxType(
                "Превышение установленной скорости движения ТС на величину более 40, но не более 60 километров в час",
                1000D));
        taxTypeList.add(new TaxType(
                "Превышение установленной скорости движения ТС на величину более 60 километров в час",
                2000D));
        taxTypeList.add(new TaxType(
                "Превышение установленной скорости движения транспортного средства на величину более 80 километров в час",
                5000D));

        taxTypeList.add(new TaxType(
                "Нарушение правил проезда через железнодорожные переезды, за исключением случаев, предусмотренных частью 1 настоящей статьи",
                1000D));
        taxTypeList.add(new TaxType(
                "Движение по автомагистрали на ТС, скорость которого по технической характеристике или по его состоянию менее 40 километров в час, а равно остановка ТС на автомагистрали вне специальных площадок для стоянки",
                1000D));
        taxTypeList.add(new TaxType(
                "Движение на грузовом автомобиле с разрешенной максимальной массой более 3,5 тонны по автомагистрали далее второй полосы, а равно учебная езда по автомагистрали",
                1000D));
        taxTypeList.add(new TaxType(
                "Разворот или въезд ТС в технологические разрывы разделительной полосы на автомагистрали либо движение задним ходом по автомагистрали",
                2500D));

        taxTypeList.add(new TaxType(
                "Движение по велосипедным или пешеходным дорожкам либо тротуарам в нарушение ПДД",
                2000D));
    }

    private void fillTax() {
        Tax tax = new Tax();
        tax.setGosnumber("ААА000А 777");
        tax.setMark("LADA");
        tax.setModel("Веста");
        tax.setFio("Иванов И.И.");
        tax.setTaxType(taxTypeList.get(0));
        taxList.add(tax);

        Tax tax2 = new Tax();
        tax2.setGosnumber("ААА010B 196");
        tax2.setMark("LADA");
        tax2.setModel("Калина");
        tax2.setFio("Иванов И.И.");
        tax2.setTaxType(taxTypeList.get(0));
        taxList.add(tax2);

        Tax tax3 = new Tax();
        tax3.setGosnumber("ААА123А 196");
        tax3.setMark("LADA");
        tax3.setModel("Веста");
        tax3.setFio("Петров П.П.");
        tax3.setTaxType(taxTypeList.get(0));
        taxList.add(tax3);

        Tax tax4 = new Tax();
        tax4.setGosnumber("ABC567А 196");
        tax4.setMark("Reno");
        tax4.setModel("Logan");
        tax4.setFio("Сидоров С.С.");
        tax4.setTaxType(taxTypeList.get(8));
        taxList.add(tax4);

        Tax tax5 = new Tax();
        tax5.setGosnumber("АCE597А 196");
        tax5.setMark("Toyota");
        tax5.setModel("Corolla");
        tax5.setFio("Пользователь П.П.");
        tax5.setTaxType(taxTypeList.get(8));
        taxList.add(tax5);

        Tax tax6 = new Tax();
        tax6.setGosnumber("BCE200C 196");
        tax6.setMark("Toyota");
        tax6.setModel("Camry");
        tax6.setFio("Пользователь В.И.");
        tax6.setTaxType(taxTypeList.get(2));
        taxList.add(tax6);

        Tax tax7 = new Tax();
        tax7.setGosnumber("BCE230C 196");
        tax7.setMark("Reno");
        tax7.setModel("Logan");
        tax7.setFio("Ванюков И.Н.");
        tax7.setTaxType(taxTypeList.get(3));
        taxList.add(tax7);

        Tax tax8 = new Tax();
        tax8.setGosnumber("ECH148C 196");
        tax8.setMark("Toyota");
        tax8.setModel("Camry");
        tax8.setFio("Ванюков И.Н.");
        tax8.setTaxType(taxTypeList.get(4));
        taxList.add(tax8);
    }

    @Override
    public List<TaxType> getAllTaxTypeList() {
        return new LinkedList<>(taxTypeList);
    }

    @Override
    public void addTaxType(TaxType taxType) {
        taxTypeList.add(taxType);
    }

    @Override
    public List<Tax> getAllTaxList() {
        return new LinkedList<>(taxList);
    }

    @Override
    public void addTax(Tax tax) {
        taxList.add(tax);
    }
}
