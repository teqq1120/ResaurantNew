/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import gui.*;



/**
 *
 * @author tkonieczny
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Products.addToProducts("Ryba z frytkami",19.50);
        Products.addToProducts("Pizza",22.00);
        Products.addToProducts("Spaghetti",15.0);
        Products.addToProducts("Skrzydełka z kurczaka",12.50);
        Products.addToProducts("Owoce morza",28.20);
        Products.addToProducts("Schabowy z ziemniakami",17.50);
        Products.addToProducts("Coca-Cola",4.20);
        Products.addToProducts("Woda",1.50);
        Products.addToProducts("Piwo",5.0);
        Products.addToProducts("Sok",3.00);
        Products.addToProducts("Wino",15.0);
        
        jOrdersFrame ramka = new jOrdersFrame();
        ramka.setVisible(true);
    }
    
}
