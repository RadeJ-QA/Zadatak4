package product;

import java.text.DecimalFormat;

public class Wine extends Product{

    protected double bottleVolume;
    protected String wineUnitMeasure = "l";


    public Wine (String productName, String barCode, double wholesalePrice, double bottleVolume) {

        super(productName, barCode, wholesalePrice);
        this.bottleVolume=bottleVolume;

    }

    @Override
    public double calculatedRetailPrice() {
        return super.calculatedRetailPrice()*(1+addTaxWine);
    }

    @Override
    public String calculateProductPricePerVolumeUnit() {
        return " Price per " + wineUnitMeasure + " = " + df.format(calculatedRetailPrice()/bottleVolume);

    }


    @Override
    public String toString() {
        return "Wine{" +
                "productName='" + productName + '\'' +
                ", bottleVolume=" + bottleVolume + wineUnitMeasure +
                ", barCode='" + barCode + '\'' +
                ", wholesalePrice=" + df.format(calculatedRetailPrice()) + moneyUnit +
                ", " + calculateProductPricePerVolumeUnit()+ moneyUnit +
                '}';
    }


}
