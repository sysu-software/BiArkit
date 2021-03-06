/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * sirnaJFrame.java
 *
 * Created on 2012-10-20, 20:13:23
 */
package org.sysu.igem.siRNA;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import org.sysu.igem.utils.OpenFastaFile;

/**
 *
 * @author Administrator
 */
public class sirnaJFrame extends javax.swing.JFrame {

    private String FilePath;
    JTextArea t1;// = new JTextField();
    JTextArea t2;// = new JTextField();

    /** Creates new form sirnaJFrame */
    public sirnaJFrame() {
        initComponents();
        this.initSiRNA();
    }
    JLabel s1 = new JLabel("Tom Tuschl's Method:");
    JLabel s2 = new JLabel("Rational Design:");
    Box vertical = Box.createVerticalBox();
    /**
     *
     */
    public void initSiRNA() {

        siRNA s = new siRNA("p53.fasta");
        List list = s.siRNA();
        vertical.setBackground(new java.awt.Color(255, 215, 0));
        vertical.setSize(this.scrollPane1.getWidth(), this.scrollPane1.getHeight());

        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //
        //Modify the text color
        s1.setForeground(Color.black);
        s2.setForeground(Color.black);
        s1.setFont(new java.awt.Font("Arial Black", 0, 18));
        s2.setFont(new java.awt.Font("Arial Black", 0, 18));
        //Modify the background color
        //s1.setBackground(new Color(255, 192, 16));    
        //s2.setBackground(new Color(255, 192, 16));
        //

        t1 = new JTextArea();
        t2 = new JTextArea();
//        t1.setLineWrap(true);
//        t2.setLineWrap(true);
        t1.setText(list.get(0).toString());
        t2.setText(list.get(1).toString());

        vertical.add(s1);
        vertical.add(t1);
        vertical.add(s2);
        vertical.add(t2);

        scrollPane1.add(vertical);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jLabel46 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        siRnaInputArea = new javax.swing.JTextArea();
        siRnaGoBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SiRna Frame");

        jPanel12.setBackground(java.awt.Color.white);
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel12.setName("jPanel12"); // NOI18N
        jPanel12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel12ComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel12ComponentShown(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane1.setBackground(new java.awt.Color(255, 255, 0));
        scrollPane1.setName("scrollPane1"); // NOI18N
        jPanel12.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 610));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/igem/browser/rnai.png"))); // NOI18N
        jLabel46.setName("jLabel46"); // NOI18N
        jPanel12.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 390, -1));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setName("jLabel45"); // NOI18N
        jLabel45.setOpaque(true);
        jPanel12.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 300, 110));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setName("jLabel47"); // NOI18N
        jLabel47.setOpaque(true);
        jPanel12.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 300, 140));

        jPanel8.setBackground(new java.awt.Color(241, 241, 242));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel8.setForeground(new java.awt.Color(241, 241, 242));
        jPanel8.setName("jPanel8"); // NOI18N

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14));
        jButton1.setText("Open Fasta");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(java.awt.Color.white);
        jScrollPane3.setName("jScrollPane3"); // NOI18N

        siRnaInputArea.setColumns(20);
        siRnaInputArea.setFont(new java.awt.Font("Arial Black", 0, 13));
        siRnaInputArea.setLineWrap(true);
        siRnaInputArea.setRows(5);
        siRnaInputArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        siRnaInputArea.setName("siRnaInputArea"); // NOI18N
        jScrollPane3.setViewportView(siRnaInputArea);

        siRnaGoBtn.setBackground(java.awt.Color.white);
        siRnaGoBtn.setFont(new java.awt.Font("Arial Black", 0, 14));
        siRnaGoBtn.setText("Go");
        siRnaGoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        siRnaGoBtn.setName("siRnaGoBtn"); // NOI18N
        siRnaGoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siRnaGoBtnMouseClicked(evt);
            }
        });
        siRnaGoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siRnaGoBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14));
        jButton2.setText("Clear");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setName("jPanel17"); // NOI18N

        jLabel41.setBackground(java.awt.Color.white);
        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 16));
        jLabel41.setForeground(new java.awt.Color(246, 146, 30));
        jLabel41.setText("Direct Input");
        jLabel41.setName("jLabel41"); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(siRnaGoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siRnaGoBtn)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel12ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel12ComponentHidden
		}//GEN-LAST:event_jPanel12ComponentHidden

    private void jPanel12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel12ComponentShown
		}//GEN-LAST:event_jPanel12ComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        OpenFastaFile f = new OpenFastaFile("", "");
        try {             //f.showSaveDataDialog();             
            FilePath = f.showOpenDataDialog();
        } catch (IOException ex) {
//            Logger.getLogger(Browser.class.getName()).log(Level.SEVERE, null, ex);
        }


        if (FilePath.isEmpty()) {
            return;
        }
        Box vertical = Box.createVerticalBox();
        vertical.setSize(this.scrollPane1.getWidth(), this.scrollPane1.getHeight());
        siRNA s = new siRNA(new File(FilePath));

        siRnaInputArea.setText(s.getGene());


        if (s.isValid()) {
            List list = s.siRNA();
            t1.setText(list.get(0).toString());
            t2.setText(list.get(1).toString());
            s1.setForeground(Color.black);
            s2.setForeground(Color.black);
        }
		}//GEN-LAST:event_jButton1ActionPerformed
        private void siRnaGoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siRnaGoBtnMouseClicked

            if (siRnaInputArea.getText().isEmpty()) {
                return;
            }
            String input = siRnaInputArea.getText().toUpperCase();
            siRNA s = new siRNA(input);
            if (s.isValid()) {
                List list = s.siRNA();
                t1.setText(list.get(0).toString());
                t2.setText(list.get(1).toString());
            }
		}//GEN-LAST:event_siRnaGoBtnMouseClicked

    private void siRnaGoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siRnaGoBtnActionPerformed
    }//GEN-LAST:event_siRnaGoBtnActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        siRnaInputArea.setText("");
        t1.setText("");
        t2.setText("");
		}//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(sirnaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sirnaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sirnaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sirnaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new sirnaJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JButton siRnaGoBtn;
    private javax.swing.JTextArea siRnaInputArea;
    // End of variables declaration//GEN-END:variables
}
