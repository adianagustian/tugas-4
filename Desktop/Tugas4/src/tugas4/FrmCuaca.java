/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.coba;

import coba.coba.MainFrm.DlgHelp;
import javax.swing.JOptionPane;

/**
 *
 * @author adianagustia
 */
public class FrmCuaca extends javax.swing.JFrame {

    /**
     * Creates new form FrmCuaca
     */
    public FrmCuaca() {
        initComponents();
        angin.setText("");
        lembap.setText("");
        maks.setText("");
        min.setText("");
        tekanan.setText("");
        suhu.setText("");
        lblKota.setText("Cuaca di Kota"+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKota = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cbHari = new javax.swing.JComboBox<>();
        lblKota = new javax.swing.JLabel();
        suhu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        maks = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        angin = new javax.swing.JLabel();
        lembap = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tekanan = new javax.swing.JLabel();
        hari2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("kota");

        txtKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKotaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hari ini", "Besok" }));
        cbHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHariActionPerformed(evt);
            }
        });

        lblKota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblKota.setText("MONITOR CUACA");

        suhu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        suhu.setText("  ");

        jLabel4.setText("Suhu Maksimum");

        jLabel5.setText("Suhu Minimum");

        jLabel6.setText("Kecepatan Angin");

        jLabel7.setText("Kelembapan");

        maks.setText("  ");

        min.setText("  ");

        angin.setText("  ");

        lembap.setText("  ");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coba/coba/gambar/04n.png"))); // NOI18N

        jLabel16.setText("Tekanan Udara");

        tekanan.setText("  ");

        hari2.setText("  ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("Broken Clouds");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Kota yang terdaftar :\n1. bandung\n2. medan\n3. surabaya");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblKota)
                        .addGap(66, 66, 66)
                        .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hari2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel15)
                                    .addComponent(suhu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel16))))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(angin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(maks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lembap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tekanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKota)
                    .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hari2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suhu)
                    .addComponent(jLabel4)
                    .addComponent(maks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(angin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lembap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tekanan)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setText("Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKotaActionPerformed
        // TODO add your handling code here:
        String day = (String) cbHari.getSelectedItem();
            hari2.setText(day);
            
            if("Hari ini".equals(hari2.getText())&& "bandung".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("20.3"+(char)0x00B0+"C");
                maks.setText("30.0"+(char)0x00B0+"C");
                min.setText("10.0"+(char)0x00B0+"C");
                angin.setText("20.0"+"m/s");
                lembap.setText("200.2"+"%");
                tekanan.setText("200.2"+"hPa");
                
            }else if("Besok".equals(hari2.getText())&& "bandung".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("18.3"+(char)0x00B0+"C");
                maks.setText("40.0"+(char)0x00B0+"C");
                min.setText("20.0"+(char)0x00B0+"C");
                angin.setText("21.0"+"m/s");
                lembap.setText("210.2"+"%");
                tekanan.setText("210.2"+"hPa");
            }else if("Hari ini".equals(hari2.getText())&& "surabaya".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("35.3"+(char)0x00B0+"C");
                maks.setText("40.0"+(char)0x00B0+"C");
                min.setText("24.0"+(char)0x00B0+"C");
                angin.setText("25.0"+"m/s");
                lembap.setText("240.2"+"%");
                tekanan.setText("240.2"+"hPa");
                
            }else if("Besok".equals(hari2.getText())&& "surabaya".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("32.5"+(char)0x00B0+"C");
                maks.setText("36.7"+(char)0x00B0+"C");
                min.setText("27.0"+(char)0x00B0+"C");
                angin.setText("28.0"+"m/s");
                lembap.setText("226.2"+"%");
                tekanan.setText("226.2"+"hPa");
            }else if("Hari ini".equals(hari2.getText())&& "medan".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("26.7"+(char)0x00B0+"C");
                maks.setText("30.0"+(char)0x00B0+"C");
                min.setText("20.0"+(char)0x00B0+"C");
                angin.setText("30.0"+"m/s");
                lembap.setText("250.2"+"%");
                tekanan.setText("250.2"+"hPa");
                
            }else if("Besok".equals(hari2.getText())&& "medan".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("27.0"+(char)0x00B0+"C");
                maks.setText("300.0"+(char)0x00B0+"C");
                min.setText("22.0"+(char)0x00B0+"C");
                angin.setText("21.0"+"m/s");
                lembap.setText("210.2"+"%");
                tekanan.setText("210.2"+"hPa");
            }else{
                JOptionPane.showMessageDialog(null, "Data yang anda masukan belum tersedia", "Peringatan", JOptionPane.ERROR_MESSAGE);
            }
                
    }//GEN-LAST:event_txtKotaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Aplikasi Monitoring Cuaca" + "\n Trisno" + "\n 1641811");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DlgHelp help = new DlgHelp();
        help.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cbHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHariActionPerformed
        // TODO add your handling code here:
        String day = (String) cbHari.getSelectedItem();
            hari2.setText(day);
            
            if("Hari ini".equals(hari2.getText())&& "bandung".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("20.3"+(char)0x00B0+"C");
                maks.setText("30.0"+(char)0x00B0+"C");
                min.setText("10.0"+(char)0x00B0+"C");
                angin.setText("20.0"+"m/s");
                lembap.setText("200.2"+"%");
                tekanan.setText("200.2"+"hPa");
                
            }else if("Besok".equals(hari2.getText())&& "bandung".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("18.3"+(char)0x00B0+"C");
                maks.setText("40.0"+(char)0x00B0+"C");
                min.setText("20.0"+(char)0x00B0+"C");
                angin.setText("21.0"+"m/s");
                lembap.setText("210.2"+"%");
                tekanan.setText("210.2"+"hPa");
            }else if("Hari ini".equals(hari2.getText())&& "surabaya".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("35.3"+(char)0x00B0+"C");
                maks.setText("40.0"+(char)0x00B0+"C");
                min.setText("24.0"+(char)0x00B0+"C");
                angin.setText("25.0"+"m/s");
                lembap.setText("240.2"+"%");
                tekanan.setText("240.2"+"hPa");
                
            }else if("Besok".equals(hari2.getText())&& "surabaya".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("32.5"+(char)0x00B0+"C");
                maks.setText("36.7"+(char)0x00B0+"C");
                min.setText("27.0"+(char)0x00B0+"C");
                angin.setText("28.0"+"m/s");
                lembap.setText("226.2"+"%");
                tekanan.setText("226.2"+"hPa");
            }else if("Hari ini".equals(hari2.getText())&& "medan".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("26.7"+(char)0x00B0+"C");
                maks.setText("30.0"+(char)0x00B0+"C");
                min.setText("20.0"+(char)0x00B0+"C");
                angin.setText("30.0"+"m/s");
                lembap.setText("250.2"+"%");
                tekanan.setText("250.2"+"hPa");
                
            }else if("Besok".equals(hari2.getText())&& "medan".equals(txtKota.getText())){
                lblKota.setText(txtKota.getText());
                suhu.setText("27.0"+(char)0x00B0+"C");
                maks.setText("300.0"+(char)0x00B0+"C");
                min.setText("22.0"+(char)0x00B0+"C");
                angin.setText("21.0"+"m/s");
                lembap.setText("210.2"+"%");
                tekanan.setText("210.2"+"hPa");
            }else{
                JOptionPane.showMessageDialog(null, "Data yang anda masukan belum tersedia", "Peringatan", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_cbHariActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angin;
    private javax.swing.JComboBox<String> cbHari;
    private javax.swing.JLabel hari2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblKota;
    private javax.swing.JLabel lembap;
    private javax.swing.JLabel maks;
    private javax.swing.JLabel min;
    private javax.swing.JLabel suhu;
    private javax.swing.JLabel tekanan;
    private javax.swing.JTextField txtKota;
    // End of variables declaration//GEN-END:variables
}
