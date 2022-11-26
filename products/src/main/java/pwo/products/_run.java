package pwo.products;

import pwo.products.Products;
import pwo.products.Products_template;

/**
 *
 * @author Jakub Nowakowski
 */
public class _run {

    /**
     *
     * Testowanie outputu z klasy Products.java
     */
    public static void main(String[] args) {
        Products_template[] products = Products.set_products();
        System.out.println(products[0].name);
    }
}
