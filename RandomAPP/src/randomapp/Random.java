/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomapp;
/**
 *
 * @author gabriele.urban
 */
public class Random extends javax.swing.JPanel {

    /**
     * Creates new form Random
     */
    public Random() {
        initComponents();
        path.setVisible(false);
        open.setVisible(false);
        cancel.setVisible(false);
        CheckM.setVisible(false);
        CheckF.setVisible(false);
        CheckE.setVisible(false);
        CheckN.setVisible(false);
        testo1.setVisible(false);
    }
    private javax.swing.DefaultListModel<String> m = new javax.swing.DefaultListModel<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        Load = new javax.swing.JButton();
        Mescola = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        open = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        CheckE = new javax.swing.JCheckBox();
        CheckN = new javax.swing.JCheckBox();
        CheckM = new javax.swing.JCheckBox();
        CheckF = new javax.swing.JCheckBox();
        testo1 = new javax.swing.JLabel();

        scrollpane.setViewportView(lista);

        Load.setText("Load");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        Mescola.setText("Mescola");
        Mescola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MescolaActionPerformed(evt);
            }
        });

        path.setEnabled(false);

        open.setText("open");
        open.setEnabled(false);
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        cancel.setText("cancel");
        cancel.setEnabled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        CheckE.setText("Estratto");
        CheckE.setEnabled(false);

        CheckN.setText("Non estratto");
        CheckN.setEnabled(false);

        CheckM.setText("Maschio");
        CheckM.setEnabled(false);

        CheckF.setText("Femmina");
        CheckF.setEnabled(false);

        testo1.setText("Filtri");
        testo1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(path)
                    .addComponent(scrollpane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(260, 260, 260)
                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckE, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(CheckM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Mescola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(testo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testo1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mescola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        path.setVisible(true);
        open.setVisible(true);
        cancel.setVisible(true);
        path.setEnabled(true);
        open.setEnabled(true);
        cancel.setEnabled(true);
        CheckM.setVisible(true);
        CheckM.setEnabled(true);
        CheckF.setVisible(true);
        CheckF.setEnabled(true);
        CheckE.setVisible(true);
        CheckE.setEnabled(true);
        CheckN.setVisible(true);
        CheckN.setEnabled(true);
        testo1.setVisible(true);
        testo1.setEnabled(true);
        Load.setEnabled(false);
    }//GEN-LAST:event_LoadActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        path.setVisible(false);
        path.setText("");
        open.setVisible(false);
        cancel.setVisible(false);
        path.setEnabled(false);
        open.setEnabled(false);
        cancel.setEnabled(false);
        CheckM.setVisible(false);
        CheckM.setEnabled(false);
        CheckF.setVisible(false);
        CheckF.setEnabled(false);
        CheckE.setVisible(false);
        CheckE.setEnabled(false);
        CheckN.setVisible(false);
        CheckN.setEnabled(false);
        testo1.setVisible(false);
        testo1.setEnabled(false);
        Load.setEnabled(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        GestoreFiles f = new GestoreFiles(path.getText().replaceAll("\\\\", "/"));
        m = new javax.swing.DefaultListModel<>();
        if (!f.getFile().isDirectory()){
            f.open();
            for(int i = 0; i<26; i++){
                if (f.readerReady()){
                    String[] l = f.readln().split(",");
                    if (l.length != 4) break;
                    if (check(l)) m.addElement(l[0] + "," + l[1] + "," + l[2] + "," + l[3]);
                }else break;
            }
            lista.setModel(m);
            f.close();
        }else System.out.println("File not valid");
        cancelActionPerformed(null);
    }//GEN-LAST:event_openActionPerformed
    private boolean check(String[] l){
        boolean isCheckedM = CheckM.isSelected();
        boolean isCheckedF = CheckF.isSelected();
        boolean isCheckedE = CheckE.isSelected();
        boolean isCheckedN = CheckN.isSelected();
        boolean isM = l[2].equals("M");
        boolean isF = l[2].equals("F");
        boolean isE = l[3].equals("E");
        boolean isN = l[3].equals("N");
        
        return ((isCheckedM && isM) || (isCheckedF && isF)) && ((isCheckedE && isE) || (isCheckedN && isN));
    }
    private void MescolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MescolaActionPerformed
        java.util.Random r = new java.util.Random();
        java.util.ArrayList<Integer> l = new java.util.ArrayList<>();
        for(int i = 0; i < 26; i++){
            int n = r.nextInt(26);
            while(l.contains(n)) n = r.nextInt(26);
            try{
                String nome = lista.getModel().getElementAt(n).split(",")[0];
                // connessione ad estrazione
            }catch(Exception ignored){}
            l.add(n);
        }
    }//GEN-LAST:event_MescolaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckE;
    private javax.swing.JCheckBox CheckF;
    private javax.swing.JCheckBox CheckM;
    private javax.swing.JCheckBox CheckN;
    private javax.swing.JButton Load;
    private javax.swing.JButton Mescola;
    private javax.swing.JButton cancel;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton open;
    private javax.swing.JTextField path;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JLabel testo1;
    // End of variables declaration//GEN-END:variables
}
