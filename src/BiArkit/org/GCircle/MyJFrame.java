/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MyJFrame.java
 *
 * Created on 2012-9-11, 7:39:18
 */
package org.GCircle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollPane;
import org.GCircle.GCircleJPanel.ImagePanel;

/**
 * A JFrame that can use netbeans's gui design
 * @author Guo Jiexin
 */
public class MyJFrame extends javax.swing.JFrame {//javax.swing.JFrame {

    GCircleJPanel jpanel = null;
    JScrollPane scrollpane = null;

    /** Creates new form MyJFrame */
    public MyJFrame() {
        initComponents();
        this.getContentPane().setBackground(new Color(125, 226, 255));
        this.setTitle("GCircle");
        jpanel = new GCircleJPanel(this);
        jpanel.setBackground(Color.white);
        this.setJMenuBar(jpanel.createFrameMenuBar());
        scrollpane = new JScrollPane(jpanel);
        //scrollpane.setBackground(Color.white);
        scrollpane.setSize(this.rightPanel.getHeight(), this.rightPanel.getHeight());
        scrollpane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e) {
                jpanel.thumbnailPane.repaint();
            }
        });
        scrollpane.getHorizontalScrollBar().addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e) {
                jpanel.thumbnailPane.repaint();
            }
        });
        jpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(105, 105, 105), 2, true));
        this.rightPanel.add(scrollpane, BorderLayout.CENTER);
        jpanel.setScrollpane(scrollpane);
        ImagePanel imagePanel = jpanel.new ImagePanel(jpanel);
        this.thumbOnPanel.setLayout(new BorderLayout());
        this.thumbOnPanel.add(imagePanel, BorderLayout.CENTER);
        imagePanel.setLayout(null);
        jpanel.setThumbnailPane(imagePanel);
        imagePanel.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        thumbOnPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        leftPanel.setBackground(java.awt.Color.white);
        leftPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        leftPanel.setName("leftPanel"); // NOI18N

        thumbOnPanel.setBackground(java.awt.Color.white);
        thumbOnPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        thumbOnPanel.setName("thumbOnPanel"); // NOI18N
        thumbOnPanel.setPreferredSize(new java.awt.Dimension(159, 165));

        javax.swing.GroupLayout thumbOnPanelLayout = new javax.swing.GroupLayout(thumbOnPanel);
        thumbOnPanel.setLayout(thumbOnPanelLayout);
        thumbOnPanelLayout.setHorizontalGroup(
            thumbOnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        thumbOnPanelLayout.setVerticalGroup(
            thumbOnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thumbOnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thumbOnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new Color(125, 226, 255));
        rightPanel.setName("rightPanel"); // NOI18N
        rightPanel.setPreferredSize(new java.awt.Dimension(525, 525));
        rightPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                rightPanelComponentResized(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addComponent(leftPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rightPanelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rightPanelComponentResized
        if (this.jpanel != null) {
            this.jpanel.setSize(this.rightPanel.getHeight(), this.rightPanel.getHeight());
            scrollpane.setSize(this.rightPanel.getHeight(), this.rightPanel.getHeight());            
        }
	}//GEN-LAST:event_rightPanelComponentResized

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

    }//GEN-LAST:event_formComponentResized

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
      
    }//GEN-LAST:event_formWindowDeiconified

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MyJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel thumbOnPanel;
    // End of variables declaration//GEN-END:variables
}
