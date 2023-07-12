package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author valen
 */
public class Insertar extends javax.swing.JPanel implements InterfazVistas {

    /**
     * Creates new form Insertar
     */
    public Insertar() {
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

        tituloLbl = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        paisLbl = new javax.swing.JLabel();
        paisTxt = new javax.swing.JTextField();
        materialLbl = new javax.swing.JLabel();
        materialCbo = new javax.swing.JComboBox<>();
        precioLbl = new javax.swing.JLabel();
        precioSpn = new javax.swing.JSpinner();
        insertarBtn = new javax.swing.JButton();

        tituloLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tituloLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLbl.setText("Insertar");

        nombreLbl.setText("Nombre:");

        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        paisLbl.setText("País de manufactura:");

        materialLbl.setText("Material:");

        materialCbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algodon", "Lana", "Franela", "Lino" }));
        materialCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCboActionPerformed(evt);
            }
        });

        precioLbl.setText("Precio:");

        insertarBtn.setText("Insertar");
        insertarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paisLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paisTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(materialLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(materialCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(precioLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(insertarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisLbl)
                    .addComponent(paisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materialLbl)
                    .addComponent(materialCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLbl)
                    .addComponent(precioSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(insertarBtn)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void insertarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertarBtnActionPerformed

    private void materialCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialCboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertarBtn;
    private javax.swing.JComboBox<String> materialCbo;
    private javax.swing.JLabel materialLbl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel paisLbl;
    private javax.swing.JTextField paisTxt;
    private javax.swing.JLabel precioLbl;
    private javax.swing.JSpinner precioSpn;
    private javax.swing.JLabel tituloLbl;
    // End of variables declaration//GEN-END:variables
    @Override
    public int updateIdTraje(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateIdTraje'");
    }

    @Override
    public String updateNameTraje(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateNameTraje'");
    }

    @Override
    public String updateMatTraje(String material) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMatTraje'");
    }

    @Override
    public double updatePriceTraje(double price) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePriceTraje'");
    }

    @Override
    public int deleteTraje(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTraje'");
    }

    @Override
    public String searchTraje(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchTraje'");
    }

    @Override
    public void printTrajes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printTrajes'");
    }

    @Override
    public int buyTrajes(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buyTrajes'");
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'init'");
    }

    @Override
    public int insertIdTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertIdTraje'");
    }

    @Override
    public String insertNameTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertNameTraje'");
    }

    @Override
    public String insertOriginTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertOriginTraje'");
    }

    @Override
    public String insertMatTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMatTraje'");
    }

    @Override
    public double insertPriceTraje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPriceTraje'");
    }
}
