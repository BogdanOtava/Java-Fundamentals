/*
Question: Create a method that has two parameters: a double, which is the full price and the String is the discount percentage. Return the discounted price.

Example:
Price: 149.99
Discount 50%
Discounted Price: 74.99
*/

public class DiscountedPrice {

    static void getDiscountedPrice(double price, String percentage) {

        // Replace the '%' sign with nothing:
        percentage = percentage.replace("%", "");

        // Convert String to double:
        double discount = Integer.parseInt(percentage);

        // Calculate discounted price:
        discount = price - (price * discount) / 100;

        System.out.println(discount);
    }

    public static void main(String[] args) {

        getDiscountedPrice(149.99, "50%");
    }
}
