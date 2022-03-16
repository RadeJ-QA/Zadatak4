package product;

public class Chocolate extends Product{

    protected double weight;
    protected String chocolateUnitMeasure = "kg";



    public Chocolate(String productName, String barCode, double wholesalePrice, double weight) {
        super(productName, barCode, wholesalePrice);
        this.weight=weight;
    }

    @Override
    public String calculateProductPricePerVolumeUnit() {

        return "Price per " + chocolateUnitMeasure + " = " + df.format(calculatedRetailPrice()/weight);

    }


    @Override
    public String toString() {

        return "Chocolate{" +
                "productName='" + productName +
                ", weight=" + weight + chocolateUnitMeasure+ '\'' +
                ", barCode='" + barCode + '\'' +
                ", retailPrice='" + df.format(calculatedRetailPrice()) + moneyUnit +
                ", " + calculateProductPricePerVolumeUnit() + moneyUnit +
                '}';

    }


}
