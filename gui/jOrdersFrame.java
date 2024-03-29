/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import restaurant.*;


/**
 *
 * @author tkonieczny
 */
public class jOrdersFrame extends javax.swing.JFrame {
    int tmpIndex=0;
    /**
     * Creates new form jOrdersFrame
     */
    public jOrdersFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaShowAllOrders = new javax.swing.JTextArea();
        jButtonIO = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldOrderID = new javax.swing.JTextField();
        jButtonDeleteOrders = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaErrorConsole = new javax.swing.JTextArea();
        jLabelErrorConsole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox1.setText("Ryba z frytkami (19,50 PLN)");

        jCheckBox2.setText("Pizza (22,00 PLN)");

        jCheckBox3.setText("Spaghetti (15,00 PLN)");

        jCheckBox4.setText("Skrzydełka z kurczaka (12,50 PLN)");

        jCheckBox5.setText("Owoce morza (28,20 PLN)");

        jCheckBox6.setText("Schabowy z ziemniakami (17,50 PLN)");

        jLabel1.setText("Dania główne:");

        jLabel2.setText("Napoje:");

        jCheckBox7.setText("Coca-Cola (4,20 PLN)");

        jCheckBox8.setText("Woda (1,50 PLN)");

        jCheckBox9.setText("Piwo (5,00 PLN)");

        jCheckBox10.setText("Sok (3,00 PLN)");

        jCheckBox11.setText("Wino (15,00 PLN)");

        jLabel3.setText("Podsumowanie zamówienia:");

        jLabel4.setText("PLN");

        jButton1.setText("Zatwierdź zamówienie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("CenaZamówienia");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Aktywne zamówienia:");

        jTextAreaShowAllOrders.setColumns(20);
        jTextAreaShowAllOrders.setRows(5);
        jScrollPane1.setViewportView(jTextAreaShowAllOrders);

        jButtonIO.setText("Zapisz zamówienie/a do pliku .txt");
        jButtonIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIOActionPerformed(evt);
            }
        });

        jLabel6.setText("Menu zamówień:");

        jLabel7.setText("Podaj numer zamówienia (OrderID) lub wpisz \"all\" aby zastosować do wszystkich");

        jButtonDeleteOrders.setText("Usuń zamówienie/a");
        jButtonDeleteOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteOrdersActionPerformed(evt);
            }
        });

        jTextAreaErrorConsole.setColumns(20);
        jTextAreaErrorConsole.setRows(5);
        jScrollPane2.setViewportView(jTextAreaErrorConsole);

        jLabelErrorConsole.setText("Konsola błędów:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox6))
                                .addGap(49, 49, 49)
                                .addComponent(jCheckBox11))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox5))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox10)
                                    .addComponent(jLabel2)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox9))))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)
                        .addGap(397, 397, 397)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErrorConsole)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(118, 118, 118)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(174, 174, 174)
                        .addComponent(jTextFieldOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIO)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonDeleteOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabelErrorConsole))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jTextFieldOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIO)
                    .addComponent(jButtonDeleteOrders))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dodajDoListyZaznaczonychCheckBoxow(JCheckBox...listaChB){
        ArrayList<Integer> ListaIndexowZaznaczonychChB=new ArrayList<>();
        for(int i=0;i<listaChB.length;i++){
            if(listaChB[i].isSelected()==true)
                ListaIndexowZaznaczonychChB.add(i);
        }
        int[] tab = new int[ListaIndexowZaznaczonychChB.size()]; //potrzebuje tablicy prymitywnych int dla metody Orders.addOrder() ze wzgledu na specyfike OrderID
        for(int j=0;j<ListaIndexowZaznaczonychChB.size();j++){
           tab[j]=ListaIndexowZaznaczonychChB.get(j).intValue();
        }
        Orders.addOrder(tab);
        tmpIndex++;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dodajDoListyZaznaczonychCheckBoxow(jCheckBox1,jCheckBox2,jCheckBox3,jCheckBox4,jCheckBox5,jCheckBox6,jCheckBox7,jCheckBox8,jCheckBox9,jCheckBox10,jCheckBox11);
        jTextField1.setText(wypiszCeneZamowienia());
        jTextField1.repaint();
        jTextAreaShowAllOrders.setText(Orders.activeOrders.toString());
        jTextAreaShowAllOrders.repaint();
        jCheckBox1.setSelected(false);jCheckBox2.setSelected(false);jCheckBox3.setSelected(false);jCheckBox4.setSelected(false);jCheckBox5.setSelected(false);jCheckBox6.setSelected(false);jCheckBox7.setSelected(false);jCheckBox8.setSelected(false);jCheckBox9.setSelected(false);jCheckBox10.setSelected(false);jCheckBox11.setSelected(false);
        jTextAreaErrorConsole.setText("Dodano zamówienie pomyślnie!");
    }//GEN-LAST:event_jButton1ActionPerformed
    private String wypiszCeneZamowienia(){
       return Double.toString(Orders.SummaryPrice(tmpIndex));
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIOActionPerformed
        if ((Parsing.isPossibleToParseInt(jTextFieldOrderID.getText())) || ("all".equals(jTextFieldOrderID.getText()))) { //jesli jest to liczba lub slowo "all" to program pojdzie dalej
            try {
                OrdersIO.saveToFile(jTextFieldOrderID.getText()); //metoda moze rzucic wyjatkiem IOExcepption obsluzonym nizej
                jTextAreaErrorConsole.setText("Podane zamówienia zostały pomyślnie zapisane do pliku!");
            } catch (IOException ex) {
                jTextAreaErrorConsole.setText("Błąd: "+ex.getMessage());
            }
        }
        else jTextAreaErrorConsole.setText("Podano błędny ciąg znaków");
    }//GEN-LAST:event_jButtonIOActionPerformed

    private void jButtonDeleteOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteOrdersActionPerformed
        if ((Parsing.isPossibleToParseInt(jTextFieldOrderID.getText())) || ("all".equals(jTextFieldOrderID.getText()))) {
            if(Parsing.isPossibleToParseInt(jTextFieldOrderID.getText())){
                if(Integer.parseInt(jTextFieldOrderID.getText())<=tmpIndex){
                    ArrayList<Integer> tmpList = new ArrayList<>();
                    for(int j=0;j<Orders.activeOrders.size();j++){
                        if(Orders.activeOrders.get(j).getOrderId()==Integer.parseInt(jTextFieldOrderID.getText()))
                            tmpList.add(j); //dodaje indeksy obiektow z Orders.activeOrders ktore maja szukane OrderID
                    }
                    Orders.removeAllCheckedIndex(tmpList);
                    jTextAreaErrorConsole.setText("Usunięto wybrane zamówienie");
                }
            }
            if(jTextFieldOrderID.getText().equals("all")){
              boolean t =  Orders.activeOrders.removeAll(Orders.activeOrders);
              if(t==true)
                  jTextAreaErrorConsole.setText("Pomyślnie usunięto wszytskie zamówienia");
              else if(t==false)
                  jTextAreaErrorConsole.setText("Nie udało się usunąć wszystkich zamówień (tablica Order jest pusta)");
            }
        }
        else jTextAreaErrorConsole.setText("Podano błedny ciąg znaków");
           
        jTextAreaShowAllOrders.setText(Orders.activeOrders.toString());
        jTextAreaShowAllOrders.repaint();
        
    }//GEN-LAST:event_jButtonDeleteOrdersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
        int tmpIndex=0;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jOrdersFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeleteOrders;
    private javax.swing.JButton jButtonIO;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelErrorConsole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaErrorConsole;
    private javax.swing.JTextArea jTextAreaShowAllOrders;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldOrderID;
    // End of variables declaration//GEN-END:variables
}
