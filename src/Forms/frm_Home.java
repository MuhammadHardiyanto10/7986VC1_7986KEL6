/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;


/**
 *
 * @author acer
 */
public class frm_Home extends javax.swing.JFrame {

    /**
     * Creates new form HomePanel
     */
    public frm_Home() {
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

        layoutStyle1 = new org.jdesktop.layout.LayoutStyle();
        panel2 = new usu.widget.Panel();
        pnlDataKamar = new usu.widget.Panel();
        pnlLaporan = new usu.widget.Panel();
        pnlDataTransaksi = new usu.widget.Panel();
        pnlTentang = new usu.widget.Panel();
        pnlDataPenghuni = new usu.widget.Panel();
        pnlDataFasilitas = new usu.widget.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/bgHome.png"))); // NOI18N

        pnlDataKamar.setBackground(new java.awt.Color(255, 229, 136));
        pnlDataKamar.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/DataKamar.png"))); // NOI18N
        pnlDataKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDataKamarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDataKamarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDataKamarLayout = new javax.swing.GroupLayout(pnlDataKamar);
        pnlDataKamar.setLayout(pnlDataKamarLayout);
        pnlDataKamarLayout.setHorizontalGroup(
            pnlDataKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        pnlDataKamarLayout.setVerticalGroup(
            pnlDataKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        pnlLaporan.setBackground(new java.awt.Color(255, 229, 136));
        pnlLaporan.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/Laporan.png"))); // NOI18N
        pnlLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlLaporanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlLaporanMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlLaporanLayout = new javax.swing.GroupLayout(pnlLaporan);
        pnlLaporan.setLayout(pnlLaporanLayout);
        pnlLaporanLayout.setHorizontalGroup(
            pnlLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        pnlLaporanLayout.setVerticalGroup(
            pnlLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        pnlDataTransaksi.setBackground(new java.awt.Color(255, 229, 136));
        pnlDataTransaksi.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/DataTransaksi.png"))); // NOI18N
        pnlDataTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDataTransaksiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDataTransaksiMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDataTransaksiLayout = new javax.swing.GroupLayout(pnlDataTransaksi);
        pnlDataTransaksi.setLayout(pnlDataTransaksiLayout);
        pnlDataTransaksiLayout.setHorizontalGroup(
            pnlDataTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        pnlDataTransaksiLayout.setVerticalGroup(
            pnlDataTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        pnlTentang.setBackground(new java.awt.Color(255, 229, 136));
        pnlTentang.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/Tentang.png"))); // NOI18N
        pnlTentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTentangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlTentangMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlTentangLayout = new javax.swing.GroupLayout(pnlTentang);
        pnlTentang.setLayout(pnlTentangLayout);
        pnlTentangLayout.setHorizontalGroup(
            pnlTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        pnlTentangLayout.setVerticalGroup(
            pnlTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        pnlDataPenghuni.setBackground(new java.awt.Color(255, 229, 136));
        pnlDataPenghuni.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/DataPenghuni.png"))); // NOI18N
        pnlDataPenghuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDataPenghuniMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDataPenghuniMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDataPenghuniLayout = new javax.swing.GroupLayout(pnlDataPenghuni);
        pnlDataPenghuni.setLayout(pnlDataPenghuniLayout);
        pnlDataPenghuniLayout.setHorizontalGroup(
            pnlDataPenghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        pnlDataPenghuniLayout.setVerticalGroup(
            pnlDataPenghuniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        pnlDataFasilitas.setBackground(new java.awt.Color(255, 229, 136));
        pnlDataFasilitas.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/DataFasilitas.png"))); // NOI18N
        pnlDataFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDataFasilitasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDataFasilitasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDataFasilitasLayout = new javax.swing.GroupLayout(pnlDataFasilitas);
        pnlDataFasilitas.setLayout(pnlDataFasilitasLayout);
        pnlDataFasilitasLayout.setHorizontalGroup(
            pnlDataFasilitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        pnlDataFasilitasLayout.setVerticalGroup(
            pnlDataFasilitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(pnlDataTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlTentang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(150, 209, Short.MAX_VALUE)
                .addComponent(pnlDataPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDataKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDataFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDataKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDataFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDataPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDataTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTentang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDataPenghuniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataPenghuniMousePressed
        // TODO add your handling code here:
        pnlDataPenghuni.setBackground(new Color(103,183,242));
    }//GEN-LAST:event_pnlDataPenghuniMousePressed

    private void pnlDataPenghuniMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataPenghuniMouseReleased
        // TODO add your handling code here:
        pnlDataPenghuni.setBackground(new Color(255, 229, 136));
    }//GEN-LAST:event_pnlDataPenghuniMouseReleased

    private void pnlDataKamarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataKamarMousePressed
        // TODO add your handling code here:
        pnlDataKamar.setBackground(new Color(103,183,242));
    }//GEN-LAST:event_pnlDataKamarMousePressed

    private void pnlDataKamarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataKamarMouseReleased
        // TODO add your handling code here:
        pnlDataKamar.setBackground(new Color(255, 229, 136));
    }//GEN-LAST:event_pnlDataKamarMouseReleased

    private void pnlDataFasilitasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataFasilitasMousePressed
        // TODO add your handling code here:
        pnlDataFasilitas.setBackground(new Color(103,183,242));
    }//GEN-LAST:event_pnlDataFasilitasMousePressed

    private void pnlDataFasilitasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataFasilitasMouseReleased
        // TODO add your handling code here:
        pnlDataFasilitas.setBackground(new Color(255, 229, 136));
    }//GEN-LAST:event_pnlDataFasilitasMouseReleased

    private void pnlDataTransaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataTransaksiMousePressed
        // TODO add your handling code here:
        pnlDataTransaksi.setBackground(new Color(103,183,242));
    }//GEN-LAST:event_pnlDataTransaksiMousePressed

    private void pnlDataTransaksiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDataTransaksiMouseReleased
        // TODO add your handling code here:
        pnlDataTransaksi.setBackground(new Color(255, 229, 136));
    }//GEN-LAST:event_pnlDataTransaksiMouseReleased

    private void pnlLaporanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLaporanMousePressed
        // TODO add your handling code here:
        pnlLaporan.setBackground(new Color(103,183,242));
    }//GEN-LAST:event_pnlLaporanMousePressed

    private void pnlLaporanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLaporanMouseReleased
        // TODO add your handling code here:
        pnlLaporan.setBackground(new Color(255, 229, 136));
    }//GEN-LAST:event_pnlLaporanMouseReleased

    private void pnlTentangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTentangMousePressed
        // TODO add your handling code here:
        pnlTentang.setBackground(new Color(103,183,242));
    }//GEN-LAST:event_pnlTentangMousePressed

    private void pnlTentangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTentangMouseReleased
        // TODO add your handling code here:
        pnlTentang.setBackground(new Color(255, 229, 136));
    }//GEN-LAST:event_pnlTentangMouseReleased

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
            java.util.logging.Logger.getLogger(frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.layout.LayoutStyle layoutStyle1;
    private usu.widget.Panel panel2;
    private usu.widget.Panel pnlDataFasilitas;
    private usu.widget.Panel pnlDataKamar;
    private usu.widget.Panel pnlDataPenghuni;
    private usu.widget.Panel pnlDataTransaksi;
    private usu.widget.Panel pnlLaporan;
    private usu.widget.Panel pnlTentang;
    // End of variables declaration//GEN-END:variables
}
