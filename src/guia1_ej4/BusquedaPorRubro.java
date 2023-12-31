/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1_ej4;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pmora
 */
public class BusquedaPorRubro extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        
        public boolean isCellEditable(int f, int c){
        return false;
    }
        
    };
    /**
     * Creates new form BusquedaPorRubro
     */
    public BusquedaPorRubro() {
        initComponents();
        armarCabecera();
        cargarCombo();
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
        jcRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProcdutosRubro = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Productos por Rubro");

        jcRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcRubroItemStateChanged(evt);
            }
        });
        jcRubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcRubroMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcRubroMousePressed(evt);
            }
        });
        jcRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRubroActionPerformed(evt);
            }
        });
        jcRubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcRubroKeyPressed(evt);
            }
        });

        jtProcdutosRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProcdutosRubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRubroActionPerformed
       
       borrarFilas();
        
        for(Producto prod: Menu.listaProductos){
            
            if (prod.getRubro().equals(jcRubro.getSelectedItem())) {
                modelo.addRow(new Object[]{
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getPrecio(),
                    prod.getStock()
                });
                
            }
            
        }
        
        
       
        
    }//GEN-LAST:event_jcRubroActionPerformed

    private void jcRubroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcRubroKeyPressed
              
        
    }//GEN-LAST:event_jcRubroKeyPressed

    private void jcRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcRubroItemStateChanged
          
    }//GEN-LAST:event_jcRubroItemStateChanged

    private void jcRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcRubroMouseClicked
            
        
        
    }//GEN-LAST:event_jcRubroMouseClicked

    private void jcRubroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcRubroMousePressed
      
    }//GEN-LAST:event_jcRubroMousePressed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Categoria> jcRubro;
    private javax.swing.JTable jtProcdutosRubro;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtProcdutosRubro.setModel(modelo);
    }

    private void borrarFilas(){
       
        int filas= jtProcdutosRubro.getRowCount()-1;
        
        for(int f = filas;f>=0;f--){
            modelo.removeRow(f);
        }
    }

    private void cargarCombo(){
        jcRubro.addItem(Categoria.Comestible);
        jcRubro.addItem(Categoria.Limpieza);        
        jcRubro.addItem(Categoria.Perfumeria);
        
    }
    

}
