/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Timer;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.Polygon;
import java.util.TimerTask;

/**
 *
 * @author ali zikry
 */

public class NewJFrame extends javax.swing.JFrame{     
    public NewJFrame() {
        initComponents();
        jPanel1.setFocusable(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jTFSpeed = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFScale = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFRotate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonRotate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jButton1.setText("Draw Figure");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setFocusable(false);
        jSpinner1.setValue(3);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel1.setText("Number of Control Points :");
        jLabel1.setFocusable(false);

        jTFSpeed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFSpeed.setText("9");
        jTFSpeed.setFocusTraversalPolicyProvider(true);

        jLabel2.setText("Movement Pixels :");
        jLabel2.setFocusable(false);

        jTFScale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFScale.setText("3");

        jLabel3.setText("Scaling :");
        jLabel3.setFocusable(false);

        jTFRotate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRotate.setText("180");

        jLabel4.setText("Rotate angle degree :");
        jLabel4.setFocusable(false);

        jButtonRotate.setText("Rotate");
        jButtonRotate.setFocusable(false);
        jButtonRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFScale, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(jTFRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFRotate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRotate)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        jButton1.getAccessibleContext().setAccessibleName("Draw");
        jSpinner1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    double[] xn;
    double[] yn;
    
    int Cx = 0,  Cy = 0;
          
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        if ((int)jSpinner1.getValue() < 3) {
            jSpinner1.setValue(3);
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    public void drawObject() {
        Graphics g = jPanel1.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, jPanel1.getWidth() + 1000, jPanel1.getHeight() + 1000);
        g.setColor(Color.blue);
        Polygon p = new Polygon(ArrayInt(xn), ArrayInt(yn), (int)jSpinner1.getValue());
        g.drawPolygon(p);
        g.setColor(Color.white);
        g.drawRect(Cx, Cy, 1, 1);
    }
    
    public int[] ArrayInt(double[] a) {
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = (int)a[i];
        }
        return array;
    }
    
    public void Rotate(double n) {       
        for (int i = 0; i < xn.length; i++) {
            xn[i] -= Cx;
            yn[i] -= Cy;
        }
        for (int i = 0; i < xn.length; i++) {
            double x = xn[i];
            double y = yn[i];
           
            xn[i] = (x * Math.cos(Math.toRadians(n))) + (y * Math.sin(Math.toRadians(n)));
            yn[i] = (x * -Math.sin(Math.toRadians(n))) + (y * Math.cos(Math.toRadians(n)));
        }
        for (int i = 0; i < xn.length; i++) {
            xn[i] += Cx;
            yn[i] += Cy;
        }
        drawObject();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Random r = new Random();
        xn = new double[(int)jSpinner1.getValue()];
        yn = new double[(int)jSpinner1.getValue()];
        for (int i = 0; i < (int)jSpinner1.getValue(); i++) {
            xn[i] = r.nextInt(jPanel1.getWidth());
            yn[i] = r.nextInt(jPanel1.getHeight());
        }       
        drawObject();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            for (int i = 0; i < xn.length; i++) {
                yn[i] -= Integer.parseInt(jTFSpeed.getText());
            }
            drawObject();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            for (int i = 0; i < xn.length; i++) {
                yn[i] += Integer.parseInt(jTFSpeed.getText());
            }
        drawObject();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            for (int i = 0; i < xn.length; i++) {
                xn[i] += Integer.parseInt(jTFSpeed.getText());
            }
            drawObject();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            for (int i = 0; i < xn.length; i++) {
                xn[i] -= Integer.parseInt(jTFSpeed.getText());
            }
            drawObject();
        }
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            double tempx = xn[0];
            double tempy = yn[0];

            for (int i = 0; i < xn.length; i++) {
                xn[i] *= Double.parseDouble(jTFScale.getText());
                yn[i] *= Double.parseDouble(jTFScale.getText());
            }
            double dx = xn[0] - tempx;
            double dy = yn[0] - tempy;

            for (int i = 0; i < xn.length; i++) {
                xn[i] -= dx;
                yn[i] -= dy;
            }        
            drawObject();
        }
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            double tempx = xn[0];
            double tempy = yn[0];

            for (int i = 0; i < xn.length; i++) {
                xn[i] /= Double.parseDouble(jTFScale.getText());
                yn[i] /= Double.parseDouble(jTFScale.getText());
            }
            double dx = xn[0] - tempx;
            double dy = yn[0] - tempy;

            for (int i = 0; i < xn.length; i++) {
                xn[i] -= dx;
                yn[i] -= dy;
            }
            drawObject();
        }
    }//GEN-LAST:event_jPanel1KeyPressed
   
    int c;
    private void jButtonRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotateActionPerformed
        c = 0;
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {              
                if (Integer.parseInt(jTFRotate.getText()) > 0) {
                    c++;
                    System.out.println("Degrees rotated: " + c);
                    Rotate(1);
                } else if (Integer.parseInt(jTFRotate.getText()) < 0) {
                    c--;
                    System.out.println("Degrees rotated: " + Math.abs(c));
                    Rotate(-1);
                } 
                if (c == Integer.parseInt(jTFRotate.getText())){            
                    timer.cancel();
                }
            }
        };       
        
        timer.scheduleAtFixedRate(task, 0, 40);
        
        
    }//GEN-LAST:event_jButtonRotateActionPerformed
   
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        Graphics g = jPanel1.getGraphics();
        g.setColor(Color.blue);
        Cx = evt.getX();
        Cy = evt.getY();
        drawObject();
        jPanel1.requestFocus();
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        jPanel1.requestFocus();
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);  
                
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRotate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTFRotate;
    private javax.swing.JTextField jTFScale;
    private javax.swing.JTextField jTFSpeed;
    // End of variables declaration//GEN-END:variables

    


}
