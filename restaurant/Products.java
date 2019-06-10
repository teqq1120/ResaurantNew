/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author tkonieczny
 */
public class Products {
    public static ArrayList<Product> products = new ArrayList<Product>();


    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static void addToProducts(String name,double price) {
        products.add(new Product(name,price));
    }
  
    
    
    
}
