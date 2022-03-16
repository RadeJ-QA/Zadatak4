package product;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Chocolate chocolate1 = new Chocolate("Milka", "2365417895K412", 160,0.1);
        Wine wine1 = new Wine("Carica Milica", "236541h12785", 350, 0.7);
        Product chocolate2 = new Chocolate("Najlepse zelje", "I259647h2223", 333, 0.3);
        Wine wine2 = new Wine("Vranac Pro Corde", "852141h12785", 450, 1);
        Product wine3 = new Wine("Traminac", "866141O12785", 900, 0.7);

//        System.out.println(chocolate1.toString());
//        System.out.println(wine1.toString());
//        System.out.println(chocolate2.toString());
//        System.out.println(wine3.toString());

        Product [] products = {chocolate1, chocolate2, wine1, wine2, wine3};
        System.out.println(Arrays.toString(products));


    }
}
