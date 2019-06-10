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
public class Orders {
    
    public static ArrayList<Order> activeOrders = new ArrayList<>();
        
    /**
     *
     * @param index Dodajemy indexy wybranych produktow z listy "Products"
     */
    public static void addOrder(int...index){
        for(int i=0;i<index.length;i++){
        Orders.activeOrders.add(new Order(Products.products.get(index[i])));
        }
        Order.tmpId++;
    }
    
    public static double SummaryPrice(int OrderID){
        double summaryPrice = 0.0;
        for (int i=0;i<Orders.activeOrders.size();i++){
            if(Orders.activeOrders.get(i).getOrderId()==OrderID) //funkcja sprawdza tylko te rekordy activeOrders, ktore maja to samo id zamowienia
                summaryPrice+=Orders.activeOrders.get(i).getProduct().getPrice();
        }
        return summaryPrice;
    }
    
    
   public static void removeAllCheckedIndex(ArrayList<Integer> tabIndex){
    for(int i=0;i<tabIndex.size();i++)
        Orders.activeOrders.remove((tabIndex.get(i).intValue()-i));
    }
}
