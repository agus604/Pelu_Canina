package peluqueriacanina.igu;
import peluqueriacanina.logica.Controladora;
import peluqueriacanina.logica.Mascota;

//import peluqueriacanina.persistencia.ControladoraPersistencia;

public class ModificarDatos1 extends javax.swing.JFrame {
   //Importo la controladora
    Controladora control = null;
    int num_cliente;
    Mascota masco;
    
    public ModificarDatos1(int num_cliente) {
        control = new Controladora();
        this.num_cliente =  num_cliente;       
        initComponents();
        cargarDatos(num_cliente);
    }

    @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            txtNombre = new javax.swing.JTextField();
            txtRaza = new javax.swing.JTextField();
            txtColor = new javax.swing.JTextField();
            txtNomDuenio = new javax.swing.JTextField();
            txtCelular = new javax.swing.JTextField();
            jScrollPane1 = new javax.swing.JScrollPane();
            txtObservacion = new javax.swing.JTextArea();
            cmbAlergico = new javax.swing.JComboBox<>();
            cmbAttEsp = new javax.swing.JComboBox<>();
            jLabel2 = new javax.swing.JLabel();
            txtBotguadar = new javax.swing.JButton();
            txBotLimpiar = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel3.setText("Raza:");

            jLabel4.setText("Nombre:");

            jLabel5.setText("Color:");

            jLabel6.setText("Alergico:");

            jLabel8.setText("Nombre dueño:");

            jLabel9.setText("Celular: ");

            jLabel10.setText("Observaciones: ");

            jLabel7.setText("Atencion especial:");

            txtObservacion.setColumns(20);
            txtObservacion.setRows(5);
            jScrollPane1.setViewportView(txtObservacion);

            cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

            cmbAttEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(cmbAttEsp, 0, 154, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                          .addComponent(jLabel6)
                                          .addGap(18, 18, 18)
                                          .addComponent(cmbAlergico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(txtNombre))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                          .addGap(25, 25, 25)
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(txtColor))))
                              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                          .addComponent(jLabel10)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                .addComponent(txtNomDuenio)))))
                        .addContainerGap(140, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel5)
                              .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel6)
                              .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel7)
                              .addComponent(cmbAttEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel8)
                              .addComponent(txtNomDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel9)
                              .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(0, 55, Short.MAX_VALUE))
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
            );

            txtBotguadar.setText("Guardar Cambios");
            txtBotguadar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txtBotguadarActionPerformed(evt);
                  }
            });

            txBotLimpiar.setText("Limpiar");
            txBotLimpiar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txBotLimpiarActionPerformed(evt);
                  }
            });

            jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
            jLabel1.setText("Modificación de Datos");

            jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\PeluqueriaCanina\\src\\descarga.png")); // NOI18N

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(txBotLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(156, 156, 156)
                                    .addComponent(txtBotguadar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(354, 354, 354))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(txtBotguadar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txBotLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

//Doble click sobre el boton liampiar y generamos el metodo
    
    private void txBotLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBotLimpiarActionPerformed
        // si tenemos texto los quitamos, son las q  estan en variable declaracion abajo
        txtNombre.setText("");
        txtRaza.setText("");
        txtNomDuenio.setText("");
        txtColor.setText("");
        txtObservacion.setText("");
        txtCelular.setText("");
        //Para los combos
        cmbAlergico.setSelectedIndex(0);//en 0 para que vuelva al -
        cmbAttEsp.setSelectedIndex(0);
    }//GEN-LAST:event_txBotLimpiarActionPerformed

    private void txtBotguadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBotguadarActionPerformed
       // TODO add your handling code here:
        String nombreMasco = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String observacion = txtObservacion.getText();
        String alergico = (String) cmbAlergico.getSelectedItem();
        String attEsp = (String) cmbAttEsp.getSelectedItem();
        String nombreDuenio = txtNomDuenio.getText();
        String celular = txtCelular.getText();
        
        control.modificarMascota(masco,nombreMasco,raza,color,observacion,alergico,attEsp,nombreDuenio,celular);

        //Mensaje
        mostrarMensaje("Edicion realizada", "Info","Edicion Correcta");
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
       
    }//GEN-LAST:event_txtBotguadarActionPerformed



      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JComboBox<String> cmbAlergico;
      private javax.swing.JComboBox<String> cmbAttEsp;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JButton txBotLimpiar;
      private javax.swing.JButton txtBotguadar;
      private javax.swing.JTextField txtCelular;
      private javax.swing.JTextField txtColor;
      private javax.swing.JTextField txtNomDuenio;
      private javax.swing.JTextField txtNombre;
      private javax.swing.JTextArea txtObservacion;
      private javax.swing.JTextField txtRaza;
      // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {
        
        this.masco = control.traerMascota(num_cliente);
        
        txtNombre.setText(masco.getNombre());
        txtRaza.setText(masco.getRaza());
        txtNomDuenio.setText(masco.getUnDuenio().getNombre());
        txtColor.setText(masco.getColor());
        txtObservacion.setText(masco.getObservaciones());
        txtCelular.setText(masco.getUnDuenio().getNombre());
        //Para los combos
        
        if(masco.getAlergico().equals("SI")){
        cmbAlergico.setSelectedIndex(1);
        } 
        else{
            if(masco.getAlergico().equals("NO")){
            cmbAlergico.setSelectedIndex(2); 
            }
        }
        
        if(masco.getAttEsp().equals("SI")){
        cmbAttEsp.setSelectedIndex(1);
        } 
        else{
            if(masco.getAttEsp().equals("NO")){
            cmbAttEsp.setSelectedIndex(2); 
            }
        }
                
    }

    private void mostrarMensaje(String edicion_realizada, String info, String edicion_Correcta) {
        
    }

    }

  

 

