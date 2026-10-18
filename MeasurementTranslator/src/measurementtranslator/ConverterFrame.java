/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package measurementtranslator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.*;


public class ConverterFrame extends JFrame {
    
    private String system; //The selected system(SI,CGS,FPS)
    private String unitType;
    
   public ConverterFrame(String system, String unitType) {
        this.system = system;
        this.unitType = unitType;
        initComponents();
        setTitle("Converter - " + unitType + " (" + system + ")");
        populateComboBoxes();
    }

    // Populate the combo boxes based on unit type and system
    private void populateComboBoxes() {
        String[] units = {};

        switch (unitType) {
            case "Weight":
                if (system.equals("SI") || system.equals("MKS")) {
                    units = new String[]{"kg", "g"};
                } else if (system.equals("CGS")) {
                    units = new String[]{"g", "mg"};
                } else if (system.equals("FPS")) {
                    units = new String[]{"pound", "ounce"};
                }
                break;

            case "Pressure":
                if (system.equals("SI")) {
                    units = new String[]{"Pascal", "atm", "bar"};
                } else if (system.equals("CGS")) {
                    units = new String[]{"barye", "dyne/cm²"};
                } else if (system.equals("FPS")) {
                    units = new String[]{"psi", "psf"};
                }
                break;

            case "Volume":
                if (system.equals("SI") || system.equals("MKS")) {
                    units = new String[]{"Liter", "Milliliter"};
                } else if (system.equals("CGS")) {
                    units = new String[]{"cm³", "mL"};
                } else if (system.equals("FPS")) {
                    units = new String[]{"gallon", "fluid ounce"};
                }
                break;

            case "Temperature":
                units = new String[]{"Celsius", "Fahrenheit", "Kelvin"};
                break;

            case "Time":
                units = new String[]{"Seconds", "Minutes", "Hours"};
                break;

            case "Area":
                if (system.equals("SI") || system.equals("MKS")) {
                    units = new String[]{"sq meter", "sq kilometer"};
                } else if (system.equals("CGS")) {
                    units = new String[]{"sq cm", "sq mm"};
                } else if (system.equals("FPS")) {
                    units = new String[]{"sq foot", "sq inch"};
                }
                break;
        }

       comboFrom.setModel(new DefaultComboBoxModel<>(units));
       comboTo.setModel(new DefaultComboBoxModel<>(units));
    }
    // You can later complete this function to do actual unit conversion
    

  

    private double convert(String type, String from, String to, double value) {
        switch (type) {
            case "Weight":
                if (from.equals("kg") && to.equals("g")) return value * 1000;
                if (from.equals("g") && to.equals("kg")) return value / 1000;
                if (from.equals("g") && to.equals("mg")) return value * 1000;
                if (from.equals("mg") && to.equals("g")) return value / 1000;
                if (from.equals("pound") && to.equals("ounce")) return value * 16;
                if (from.equals("ounce") && to.equals("pound")) return value / 16;
                break;

            case "Pressure":
                if (from.equals("Pascal") && to.equals("atm")) return value / 101325;
                if (from.equals("atm") && to.equals("Pascal")) return value * 101325;
                if (from.equals("atm") && to.equals("bar")) return value * 1.01325;
                if (from.equals("bar") && to.equals("atm")) return value / 1.01325;
                if (from.equals("barye") && to.equals("dyne/cm²")) return value;
                if (from.equals("psi") && to.equals("psf")) return value * 144;
                if (from.equals("psf") && to.equals("psi")) return value / 144;
                break;

            case "Volume":
                if (from.equals("Liter") && to.equals("Milliliter")) return value * 1000;
                if (from.equals("Milliliter") && to.equals("Liter")) return value / 1000;
                if (from.equals("cm³") && to.equals("mL")) return value;
                if (from.equals("gallon") && to.equals("fluid ounce")) return value * 128;
                if (from.equals("fluid ounce") && to.equals("gallon")) return value / 128;
                break;

            case "Temperature":
                if (from.equals("Celsius") && to.equals("Fahrenheit")) return value * 9/5 + 32;
                if (from.equals("Fahrenheit") && to.equals("Celsius")) return (value - 32) * 5/9;
                if (from.equals("Celsius") && to.equals("Kelvin")) return value + 273.15;
                if (from.equals("Kelvin") && to.equals("Celsius")) return value - 273.15;
                break;

            case "Time":
                if (from.equals("Seconds") && to.equals("Minutes")) return value / 60;
                if (from.equals("Minutes") && to.equals("Seconds")) return value * 60;
                if (from.equals("Minutes") && to.equals("Hours")) return value / 60;
                if (from.equals("Hours") && to.equals("Minutes")) return value * 60;
                break;

            case "Area":
                if (from.equals("sq meter") && to.equals("sq kilometer")) return value / 1_000_000;
                if (from.equals("sq kilometer") && to.equals("sq meter")) return value * 1_000_000;
                if (from.equals("sq cm") && to.equals("sq mm")) return value * 100;
                if (from.equals("sq mm") && to.equals("sq cm")) return value / 100;
                if (from.equals("sq foot") && to.equals("sq inch")) return value * 144;
                if (from.equals("sq inch") && to.equals("sq foot")) return value / 144;
                break;
        }
        return value; // return unchanged if no conversion rule
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboFrom = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboTo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 153, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Convert Unit");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 18, 215, 58));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText(" Enter the value :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 94, 146, 37));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 95, 155, 37));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("From Unit :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 151, 102, 44));

        comboFrom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "g", "pound", "Liter", "Milliliter", "km/h", "m/s", "Seconds", "Minutes", "Hours", "sq meter", "sq kilometer", "sq foot", "Pascal", "atm", "bar" }));
        comboFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromActionPerformed(evt);
            }
        });
        jPanel1.add(comboFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 157, 180, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("To Unit :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 30));

        comboTo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "g", "pound", "Liter", "Milliliter", "km/h", "m/s", "Seconds", "Minutes", "Hours", "sq meter", "sq kilometer", "sq foot", "Pascal", "atm", "bar" }));
        jPanel1.add(comboTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Result :");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Convert Button Action
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            double input = Double.parseDouble(jTextField1.getText());
            String fromUnit = (String) comboFrom.getSelectedItem();
            String toUnit = (String) comboTo.getSelectedItem();
            double result = convert(unitType, fromUnit, toUnit, input);
            jTextField2.setText(String.format("%.4f", result));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input!");
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFromActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFrom;
    private javax.swing.JComboBox<String> comboTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
