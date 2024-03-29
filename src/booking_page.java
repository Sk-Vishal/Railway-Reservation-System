
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author VISHALROSHAN
 */
public class booking_page extends javax.swing.JFrame {

    /**
     * Creates new form booking_page
     */
    public booking_page() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JComboBox<String> from_combo = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> to_combo = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> class_combo = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        pnr_btn = new javax.swing.JButton();
        from_textfield = new javax.swing.JTextField();
        to_textfield = new javax.swing.JTextField();
        class_textfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Book Railway Ticket");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("To :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("YYYY/MM/DD :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("From :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Class :");

        from_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select anyone--", "madurai", "chennai", "kanyakumari" ,"rameshwaram","tirupathi"}));
        from_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_comboActionPerformed(evt);
            }
        });

        to_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select anyone--", "madurai", "chennai", "kanyakumari" ,"rameshwaram","tirupathi"}));
        to_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_comboActionPerformed(evt);
            }
        });

        class_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--select class--", "First class", "Sleeper", "1AC", "2AC", "3AC", "second class" }));
        class_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_comboActionPerformed(evt);
            }
        });

        search_btn.setBackground(new java.awt.Color(51, 51, 255));
        search_btn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        pnr_btn.setBackground(new java.awt.Color(51, 51, 255));
        pnr_btn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        pnr_btn.setText("PNR Status");
        pnr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnr_btnActionPerformed(evt);
            }
        });

        from_textfield.setVisible(false);
        from_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_textfieldActionPerformed(evt);
            }
        });

        to_textfield.setVisible(false);
        to_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_textfieldActionPerformed(evt);
            }
        });

        class_textfield.setVisible(false);
        class_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_textfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(from_textfield)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(from_combo, 0, 206, Short.MAX_VALUE)
                    .addComponent(to_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(class_combo, 0, 155, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addComponent(jTextField1))
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(class_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(pnr_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(from_combo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(from_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(to_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(class_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(to_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(class_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnr_btn))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int id_q1 = 0;
    private void from_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_comboActionPerformed
        // TODO add your handling code here:
        ItemSelectable is = (ItemSelectable)evt.getSource();
        String name="";
        Object selected[]=is.getSelectedObjects();
        name=(String)selected[0];        
        from_textfield.setText(name);               
    }//GEN-LAST:event_from_comboActionPerformed

    private void to_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_comboActionPerformed
        // TODO add your handling code here:
        ItemSelectable is = (ItemSelectable)evt.getSource();
        String name="";
        Object selected[]=is.getSelectedObjects();
        name=(String)selected[0];        
        to_textfield.setText(name);
    }//GEN-LAST:event_to_comboActionPerformed

    private void class_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_comboActionPerformed
        // TODO add your handling code here:
        ItemSelectable is = (ItemSelectable)evt.getSource();
        String name="";
        Object selected[]=is.getSelectedObjects();
        name=(String)selected[0];        
        class_textfield.setText(name);
    }//GEN-LAST:event_class_comboActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here: 
        Random rand = new Random();
        String url="jdbc:mysql://root@127.0.0.1:3306/book_ticket";
        String user="local";
        String pw="";
        try {
            Connection con = DriverManager.getConnection(url,user,pw);
            Statement st = con.createStatement();            
            String from=from_textfield.getText();
            String to=to_textfield.getText();
            String date=jTextField1.getText();
            String class_field=class_textfield.getText();
            String query="";
            String q1="";
            id_q1 = rand.nextInt(1000);
            trains_available ta = new trains_available();
            if(class_field.equals("") && date.equals("")){
                query="select * from `reservation` where from_place='"+from+"' and to_place='"+to+"'";
                ta.date_class("true");
            }             
            else if(class_field.equals("")){
                query="select * from `reservation` where from_place='"+from+"' and to_place='"+to+"' and date_res='"+date+"'";
            } 
            else{
                query="select * from `reservation` where from_place='"+from+"' and to_place='"+to+"' and date_res='"+date+"' and class='"+class_field+"'";
//                id_q1++;
            }
            ResultSet rs = st.executeQuery(query);            
            
            int pnr,index=0;  
            String fr,t,dt,cl;            
            while(rs.next()){
                pnr=rs.getInt("pnr");
                fr=rs.getString("from_place");
                t=rs.getString("to_place");
                dt=rs.getString("date_res");
                cl=rs.getString("class");                
                Object[] row = {pnr,fr,t,dt,cl};
                ta.update(row,index,id_q1);
                index++;
            }
            
            q1 = "insert into `booked` (id,fromplace,toplace,dateoftravel,class) values("+id_q1+",'"+from+"','"+to+"','"+date+"','"+class_field+"')";
            st.executeUpdate(q1);
            ta.setVisible(true);            
            
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(booking_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void from_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_textfieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_from_textfieldActionPerformed

    private void to_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to_textfieldActionPerformed

    private void class_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class_textfieldActionPerformed

    private void pnr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnr_btnActionPerformed
        // TODO add your handling code here:
        pnr_status ps = new pnr_status();
        ps.idnum(id_q1);
        ps.setVisible(true);
        this .dispose();
    }//GEN-LAST:event_pnr_btnActionPerformed

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
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new booking_page().setVisible(true);
            }            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField class_textfield;
    private javax.swing.JTextField from_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pnr_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField to_textfield;
    // End of variables declaration//GEN-END:variables
}
