package s08lambda.challenge.application;

import s08lambda.challenge.entities.Product;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        /*
        * 1 - Get the final price (with discount) of a given product
        * 2 - Apply local taxes: >= 2500 (8.5%) | < 2500 (no taxes)
        * 3 - Delivery: >= 3000 (100 $) | < 3000 (50 $)
        * 4 - Round value: 2 decimal places
        * 5 - Format value: $ 1,234.56
        * */

        Product p = new Product("iPad", 3235.89, 13);

        Function<Product, Double> finalPrice =
                product -> product.getPrice() - (product.getPrice() * product.getDiscountPercent() / 100);
        UnaryOperator<Double> localTaxes = price -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> deliveryTaxes = price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> roundValue = price -> Double.parseDouble(String.format("%.2f", price));
        Function<Double, String> formatValue = price -> String.format("%,.2f", price);


        String price = finalPrice
                .andThen(localTaxes)
                .andThen(deliveryTaxes)
                .andThen(roundValue)
                .andThen(formatValue)
                .apply(p);

        System.out.println("Final price: " + price);

    }
}
