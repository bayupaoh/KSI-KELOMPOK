package id.ac.unikom.ksi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FormEnkrip extends javax.swing.JFrame {
    private JFileChooser dialog = new JFileChooser();
    
    public FormEnkrip() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btBuka = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDecryptText = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPlaintext = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btEnkrip = new javax.swing.JButton();
        btDekrip = new javax.swing.JButton();
        txtKey = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtChiperText = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("===>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Enkripsi");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        setModalExclusionType(null);
        setResizable(false);

        btBuka.setText("Buka File");
        btBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBukaActionPerformed(evt);
            }
        });

        btSimpan.setText("Simpan Chipper Text");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        txtDecryptText.setColumns(20);
        txtDecryptText.setRows(5);
        jScrollPane3.setViewportView(txtDecryptText);

        txtPlaintext.setColumns(20);
        txtPlaintext.setRows(5);
        jScrollPane4.setViewportView(txtPlaintext);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("TUGAS KSI - 5 ");

        jLabel3.setText("Plaintext");

        jLabel4.setText("Chipertext");

        btEnkrip.setText("Enkripsi");
        btEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnkripActionPerformed(evt);
            }
        });

        btDekrip.setText("Dekripsi");
        btDekrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDekripActionPerformed(evt);
            }
        });

        txtKey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyKeyPressed(evt);
            }
        });

        jLabel6.setText("Masukan Key");

        txtChiperText.setColumns(20);
        txtChiperText.setRows(5);
        jScrollPane5.setViewportView(txtChiperText);

        jLabel5.setText("Hasil Decrypt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(btDekrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3)
                                .addComponent(txtKey)
                                .addComponent(btBuka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btEnkrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4)
                                .addComponent(btSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))))
                .addGap(0, 110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuka)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDekrip)
                .addGap(18, 18, 18)
                .addComponent(btSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //BUTTON OPEN
    private void btBukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBukaActionPerformed
        txtDecryptText.setText(null);
        int isi = dialog.showOpenDialog(this);

        if (isi == JFileChooser.APPROVE_OPTION) {   //jika file dipilih open
            File file = dialog.getSelectedFile();
            try{
                FileInputStream fstream = new FileInputStream(file);
                DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));                
                String strLine;
                while ((strLine = br.readLine()) != null){
                    StringTokenizer st = new StringTokenizer(strLine, ",");
                    txtPlaintext.setText(txtDecryptText.getText() + st.nextToken() +"\n");
                }
                in.close();
            }catch (Exception e){
                System.err.println("Error: " + e.getMessage());
            }
        } 
    }//GEN-LAST:event_btBukaActionPerformed
    //BUTTON SIMPAN
    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        int isi = dialog.showSaveDialog(this);
        if (isi == JFileChooser.APPROVE_OPTION) {    // jika file di pilih untuk di simpan
            File file = dialog.getSelectedFile();
            try {
                file.createNewFile();
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));                
                out.print(txtChiperText.getText());
                out.flush();   
            } 
            catch (IOException ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btSimpanActionPerformed

   // BUTTON ENKRIPSI
    private void btEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnkripActionPerformed
       String key = txtKey.getText();
       String isitext = (key.length())+key+txtPlaintext.getText();
       String out= "" ;
        for (int i = 0; i < isitext.length(); i++) {
           int index = isitext.charAt(i);
           char s = (char)(index+2) ;
           out = out+ String.valueOf(s);
        }  
       txtChiperText.setText(out);
    }//GEN-LAST:event_btEnkripActionPerformed
    // BUTTON DEKRIP
    private void btDekripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDekripActionPerformed
       String isitext = txtChiperText.getText();
       char k = (char)(isitext.charAt(0));
       String key = "",out = "";
       int   jumKey = Integer.parseInt(String.valueOf(k))-2;
       // buka password
       for (int i = 1 ; i <= jumKey; i++) {
           int index = isitext.charAt(i);
           char s = (char)(index-2) ;
           key = key + String.valueOf(s);
        }  
       
       if (key.equals(txtKey.getText())){
            for (int i = (jumKey+1) ; i < isitext.length(); i++) {
                int index = isitext.charAt(i);
                char s = (char)(index-2) ;
                out = out + String.valueOf(s);
            }  
            txtDecryptText.setText(out);    
       }
       
       else{
         JOptionPane.showMessageDialog(null,"Key tidak cocok! coba lagi");
       }
    }//GEN-LAST:event_btDekripActionPerformed

    private void txtKeyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyKeyPressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override 
            public void run() {
                new FormEnkrip().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuka;
    private javax.swing.JButton btDekrip;
    private javax.swing.JButton btEnkrip;
    private javax.swing.JButton btSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtChiperText;
    private javax.swing.JTextArea txtDecryptText;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtPlaintext;
    // End of variables declaration//GEN-END:variables
}
