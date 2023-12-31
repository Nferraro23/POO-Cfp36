


package com.mycompany.calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.awt.Color; 


public class Calculadora extends javax.swing.JFrame {

   
      
   
    boolean decimal = false ; 
    ScriptEngineManager sem = new ScriptEngineManager(); 
    ScriptEngine se = sem.getEngineByName ("JavaScript");      
            
          
    
    
    public Calculadora() {
        initComponents();
        
        setLocationRelativeTo (null); 
        
       
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cuentas = new javax.swing.JLabel();
        textoResultado = new javax.swing.JLabel();
        c = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        coma = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuentas.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cuentas.setForeground(new java.awt.Color(255, 255, 255));
        cuentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(cuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 340, 53));

        textoResultado.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        textoResultado.setForeground(new java.awt.Color(255, 255, 255));
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(textoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 50, 340, 53));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        c.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        c.setText("C");
        c.setFocusPainted(false);
        c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c.setPreferredSize(new java.awt.Dimension(70, 70));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel4.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        porcentaje.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        porcentaje.setText("%");
        porcentaje.setFocusPainted(false);
        porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        porcentaje.setPreferredSize(new java.awt.Dimension(70, 70));
        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });
        jPanel4.add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 50, 50));

        dividir.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        dividir.setText("/");
        dividir.setFocusPainted(false);
        dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dividir.setPreferredSize(new java.awt.Dimension(70, 70));
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        jPanel4.add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 50, 50));

        num8.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num8.setText("8");
        num8.setFocusPainted(false);
        num8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num8.setPreferredSize(new java.awt.Dimension(70, 70));
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        jPanel4.add(num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, 50));

        igual.setBackground(new java.awt.Color(0, 153, 255));
        igual.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        igual.setText("=");
        igual.setToolTipText("");
        igual.setBorderPainted(false);
        igual.setFocusPainted(false);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.setPreferredSize(new java.awt.Dimension(70, 70));
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel4.add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 110, 50));

        ac.setBackground(new java.awt.Color(255, 153, 0));
        ac.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ac.setText("AC");
        ac.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ac.setBorderPainted(false);
        ac.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ac.setFocusPainted(false);
        ac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ac.setPreferredSize(new java.awt.Dimension(70, 70));
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        jPanel4.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 50));

        num7.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num7.setText("7");
        num7.setFocusPainted(false);
        num7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num7.setPreferredSize(new java.awt.Dimension(70, 70));
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        jPanel4.add(num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 50));

        num4.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num4.setText("4");
        num4.setFocusPainted(false);
        num4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num4.setPreferredSize(new java.awt.Dimension(70, 70));
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        jPanel4.add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 50));

        num9.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num9.setText("9");
        num9.setAlignmentY(0.0F);
        num9.setFocusPainted(false);
        num9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num9.setPreferredSize(new java.awt.Dimension(70, 70));
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        jPanel4.add(num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 50, 50));

        multi.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        multi.setText("*");
        multi.setFocusPainted(false);
        multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multi.setPreferredSize(new java.awt.Dimension(70, 70));
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });
        jPanel4.add(multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, 50));

        num1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num1.setText("1");
        num1.setFocusPainted(false);
        num1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num1.setPreferredSize(new java.awt.Dimension(70, 70));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        jPanel4.add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 50));

        num6.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num6.setText("6");
        num6.setFocusPainted(false);
        num6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num6.setPreferredSize(new java.awt.Dimension(70, 70));
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        jPanel4.add(num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 50, 50));

        num5.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num5.setText("5");
        num5.setFocusPainted(false);
        num5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num5.setPreferredSize(new java.awt.Dimension(70, 70));
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        jPanel4.add(num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 50, 50));

        resta.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        resta.setText("-");
        resta.setFocusPainted(false);
        resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resta.setPreferredSize(new java.awt.Dimension(70, 70));
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        jPanel4.add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 50, 50));

        suma.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        suma.setText("+");
        suma.setFocusPainted(false);
        suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        suma.setPreferredSize(new java.awt.Dimension(70, 70));
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        jPanel4.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 50, 50));

        cero.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        cero.setText("0");
        cero.setFocusPainted(false);
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.setPreferredSize(new java.awt.Dimension(70, 70));
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel4.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 50));

        num2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num2.setText("2");
        num2.setFocusPainted(false);
        num2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num2.setPreferredSize(new java.awt.Dimension(70, 70));
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        jPanel4.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 50, 50));

        num3.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        num3.setText("3");
        num3.setFocusPainted(false);
        num3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        num3.setPreferredSize(new java.awt.Dimension(70, 70));
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        jPanel4.add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 50, 50));

        coma.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        coma.setText(",");
        coma.setFocusPainted(false);
        coma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        coma.setPreferredSize(new java.awt.Dimension(70, 70));
        coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaActionPerformed(evt);
            }
        });
        jPanel4.add(coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 50, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        String texto = cuentas.getText ().substring (0,cuentas.getText().length() - 1 ) ; 
        cuentas.setText ( texto );
        
        
    }//GEN-LAST:event_cActionPerformed

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
       addNumber ("%");         
    }//GEN-LAST:event_porcentajeActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
       addNumber ("/");    
    }//GEN-LAST:event_dividirActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        addNumber ("8"); 
    }//GEN-LAST:event_num8ActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed


                try {
                String resultado = se.eval (cuentas.getText ()).toString () ; 
                textoResultado.setText ( resultado);
                } catch ( Exception e ){ 
                 }  
       
    }//GEN-LAST:event_igualActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        
        ac.setBackground( Color.BLUE );  
       
        
        textoResultado.setText (""); 
        cuentas.setText (""); 
        
        decimal = false; 
        
        
        
    }//GEN-LAST:event_acActionPerformed

    
    
    
    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
       addNumber ("7"); 
    }//GEN-LAST:event_num7ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        addNumber ("4"); 
    }//GEN-LAST:event_num4ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        addNumber ("9"); 
    }//GEN-LAST:event_num9ActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        addNumber ("*");    
    }//GEN-LAST:event_multiActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        addNumber ("1");        
    }//GEN-LAST:event_num1ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        addNumber ("6"); 
    }//GEN-LAST:event_num6ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        addNumber ("5"); 
    }//GEN-LAST:event_num5ActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        addNumber ("-");    
        
    }//GEN-LAST:event_restaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        addNumber ("+");    
   
    }//GEN-LAST:event_sumaActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        addNumber ("0"); 
     
    }//GEN-LAST:event_ceroActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        addNumber ("2"); 
        
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        addNumber ("3"); 
         
         
    }//GEN-LAST:event_num3ActionPerformed

    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        
          
   
        
       if (decimal == false ) {
            
            addNumber (",") ;
            decimal = true; 
        }

    }//GEN-LAST:event_comaActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
        
        
        //cambiar boton de color 
        
        Calculadora micalculadora = new Calculadora (); 
        micalculadora.setVisible (true); 
         
        
    }
    
    
    public void addNumber (String digito){
        cuentas.setText ( cuentas.getText ()+ digito); 
                
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton c;
    private javax.swing.JButton cero;
    private javax.swing.JButton coma;
    private javax.swing.JLabel cuentas;
    private javax.swing.JButton dividir;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton multi;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton porcentaje;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    private javax.swing.JLabel textoResultado;
    // End of variables declaration//GEN-END:variables
}
