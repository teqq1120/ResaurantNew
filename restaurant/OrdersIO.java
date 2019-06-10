/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tkonieczny
 */
public class OrdersIO implements Serializable {

String nazwaPliku;

    public static void saveToFile(String OrderID) throws IOException{
        File plik = new File("/Users/tkonieczny/NetBeansProjects/Restaurant/Zamowienia/Orders.txt");
        if(!plik.exists()) {
            plik.createNewFile();
        }
    try (DataOutputStream OrdersFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(plik)))) {
        if(OrderID.equals("all")){
            OrdersFile.writeUTF(Orders.activeOrders.toString());
            OrdersFile.close();
        }
        else{
            if(Integer.parseInt(OrderID)<=Order.tmpId){
                ArrayList<Order> tmpListaPomocnicza =new ArrayList<>();//do listy kopiuje zamowienia w ktorych zgadza sie OrderID
                for(int i=0;i<Orders.activeOrders.size();i++){
                    if(Orders.activeOrders.get(i).getOrderId()==Integer.parseInt(OrderID))
                        tmpListaPomocnicza.add(Orders.activeOrders.get(i));
                }
                OrdersFile.writeUTF(tmpListaPomocnicza.toString());
                OrdersFile.close();
            }
            else
                throw new IOException("Nie istnieje taki numer zamowienia!");
        }
    
    }
    }





}
