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
public class Order {
    private int orderId;
    private String status;
    private String[] statusTab= new String[]{"aktywne","zakończone"};
    private Product product;
    public static int tmpId = 1; //odpowiada za ID zamowienia, jest iterowana w funkcji addOrder w klasie Orders


    public Order(Product product) {
        this.orderId = Order.tmpId;
        this.status = this.statusTab[0];
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusFromTab(int index) { //zmodyfikowana metoda get zwracajaca jeden obiekt typu String z tablicy
        return statusTab[index];
    }

    public void setStatusTab(String[] statusTab) {
        this.statusTab = statusTab;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return("ID zamówienia: "+getOrderId()+"\n Status: "+getStatus()+"\n Zamówienie:  "+getProduct()+"\n\n");//To change body of generated methods, choose Tools | Templates.
    }
    
}
