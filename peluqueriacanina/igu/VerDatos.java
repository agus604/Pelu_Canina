
package peluqueriacanina.igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import peluqueriacanina.logica.Controladora;
import peluqueriacanina.logica.Mascota;


public class VerDatos extends javax.swing.JFrame {
        //Siempre debemos inicializar
    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            tablaMascotas = new javax.swing.JTable();
            jLabel2 = new javax.swing.JLabel();
            btnEliminar = new javax.swing.JButton();
            btnEditar = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowOpened(java.awt.event.WindowEvent evt) {
                        formWindowOpened(evt);
                  }
            });

            jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            jLabel1.setText("Visualización de Datos");

            jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {},
                        {},
                        {},
                        {}
                  },
                  new String [] {

                  }
            ));
            jScrollPane1.setViewportView(tablaMascotas);

            jLabel2.setText("Dato de Mascotas");

            btnEliminar.setText("Eliminar");
            btnEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnEliminarActionPerformed(evt);
                  }
            });

            btnEditar.setText("Editar");
            btnEditar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnEditarActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(btnEliminar)
                                    .addGap(114, 114, 114)
                                    .addComponent(btnEditar)))
                        .addContainerGap(64, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents
    /*//Boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed
*/
    
            
            
            
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();    
    }//GEN-LAST:event_formWindowOpened
/*
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       
    }//GEN-LAST:event_btnEditarActionPerformed
*/
    //Boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //controlo que la tabla no este vacia
        if (tablaMascotas.getRowCount()> 0){
            if (tablaMascotas.getSelectedRow()!=-1){
                //Integer para convertir de int a string
                int  num_cliente = Integer.parseInt (String.valueOf(tablaMascotas.getValueAt (tablaMascotas.getSelectedRow(),0)));
                
                control.borrarMascota(num_cliente);
                
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
                cargarTabla();  
            }
            else {
            mostrarMensaje("No selecciono ninguna mascota","Error","Error al Eliminar");
            }
            }
            else{
             mostrarMensaje("No hay nada para eliminar en esta tabla","Error","Error al Eliminar");                      
            }
    }                                           
        
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
    
    JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
   }
        
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
        if (tablaMascotas.getRowCount()> 0){
            if (tablaMascotas.getSelectedRow()!=-1){
              int  num_cliente = Integer.parseInt (String.valueOf(tablaMascotas.getValueAt (tablaMascotas.getSelectedRow(),0)));  
             ModificarDatos1 pantallaModif = new ModificarDatos1(num_cliente);
             pantallaModif.setVisible(true);
             pantallaModif.setLocationRelativeTo(null);
             this.dispose();
             
            }
            else {
            mostrarMensaje("No selecciono ninguna mascota","Error","Error al Editar");
            }
        }
            else{
             mostrarMensaje("No hay nada para editar en esta tabla","Error","Error al Editar");                      
            }
            
   } 
    
            
 
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnEditar;
      private javax.swing.JButton btnEliminar;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTable tablaMascotas;
      // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
       //defino el modelo de la tabla
        DefaultTableModel modeloTabla =  new DefaultTableModel(){
        //Hago q las filas y columnas no puedan ser editabes
            @Override
        //Iscell es un metodo es de crear tablas, siempre se usa el override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        
        };
        //Establecemos los nombres de la columnas
        String titulos[] = {"Num","Nombre","Color","Raza","At. Esp.","Alergico","Dueño"};
       
       modeloTabla.setColumnIdentifiers(titulos);
        
        //Carga de datos desde la base de datos
        List<Mascota> listaMascotas = control.traerMascotas();
        
        //Recorro la lista y muestra los elementos
        if (listaMascotas != null) {
           for (Mascota masco : listaMascotas){
              Object[] objeto ={masco.getNum_cliente(), masco.getNombre(),masco.getColor(), masco.getRaza(),
               masco.getAlergico(),masco.getAttEsp(),masco.getUnDuenio().getNombre(),masco.getUnDuenio().getCelDuenio()};
                
            modeloTabla.addRow(objeto);
            }
 
        }
        
        tablaMascotas.setModel(modeloTabla);
    }
}    



