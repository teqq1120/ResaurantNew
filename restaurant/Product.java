/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;



/**
 *
 * @author tkonieczny
 */
public class Product {
    private int productId;
    private String name;
    private double price;
    

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.productId=Products.products.size()+1;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    @Override
    public String toString() {
        return("Nazwa: "+getName()+", Cena: "+getPrice()+" PLN");
    }
     
    
    
}
