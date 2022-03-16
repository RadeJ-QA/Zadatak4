package product;

import java.text.DecimalFormat;

public abstract class Product {

    protected String productName;
    protected String barCode;
    protected double wholesalePrice;
    static final double taxRetail= 0.2;
    static final double addTaxWine= 0.1;
    public static String moneyUnit = "RSD";
    public static final DecimalFormat df = new DecimalFormat("0.00");



    public Product(String productName, String barCode, double wholesalePrice) {
        this.productName = productName;
        this.barCode = barCode;
        this.wholesalePrice = wholesalePrice;
    }


    public double calculatedRetailPrice(){

        return wholesalePrice * (1+taxRetail);

    }

    public abstract String calculateProductPricePerVolumeUnit();

}
