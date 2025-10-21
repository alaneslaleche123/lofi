package interfaces;

import javax.swing.table.DefaultTableModel;

public class agregarUsuarios extends javax.swing.JFrame {

    public agregarUsuarios() {
        initComponents();
        mostrarUsuarios();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        tipo_usuario = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        guardarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        guardarTabla = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "cajero", "almacen" }));
        tipo_usuario.setToolTipText("");
        tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_usuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de usuario");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");

        guardarUsuario.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        guardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/subir.png"))); // NOI18N
        guardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUsuarioActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        guardarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        guardarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTablaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipo_usuario, 0, 158, Short.MAX_VALUE)
                    .addComponent(usuario)
                    .addComponent(contraseña)
                    .addComponent(nombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(guardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(137, 137, 137))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_usuarioActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void guardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUsuarioActionPerformed
        String user = usuario.getText().trim();
    String pass = contraseña.getText().trim();
    String name = nombre.getText().trim();
    String tipo = tipo_usuario.getSelectedItem().toString().trim();

    // Validación: si todos los campos están vacíos
    if(user.isEmpty() && pass.isEmpty() && name.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debes llenar todos los campos antes de guardar");
        return;
    }

    // Validación: si falta alguno
    if(user.isEmpty() || pass.isEmpty() || name.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
        return;
    }

    // Si el tipo de usuario no es válido, se asigna "cajero" por defecto
    if(!(tipo.equals("admin") || tipo.equals("cajero") || tipo.equals("almacen"))) {
        tipo = "cajero";
    }

    // Conexión con tu clase conectar
    conecxiones.conectar con = new conecxiones.conectar();
    java.sql.Connection cn = con.getConnection();

    try {
        // Verificar si el usuario o contraseña ya existen
        String checkSql = "SELECT COUNT(*) FROM usuarios WHERE usuario = ? OR contraseña = ?";
        java.sql.PreparedStatement checkPst = cn.prepareStatement(checkSql);
        checkPst.setString(1, user);
        checkPst.setString(2, pass);
        java.sql.ResultSet rs = checkPst.executeQuery();
        rs.next();
        if(rs.getInt(1) > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "El usuario o la contraseña ya están registrados. Intenta con otros.");
            return;
        }

        // Insertar el nuevo usuario
        String sql = "INSERT INTO usuarios (usuario, contraseña, nombre, tipo_usuario) VALUES (?,?,?,?)";
        java.sql.PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, user);
        pst.setString(2, pass);
        pst.setString(3, name);
        pst.setString(4, tipo);

        pst.executeUpdate();
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario agregado correctamente");
        mostrarUsuarios(); // Actualiza la tabla automáticamente

        // Limpiar campos
        usuario.setText("");
        contraseña.setText("");
        nombre.setText("");
        tipo_usuario.setSelectedIndex(0);
        

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
    } finally {
        con.desconectar();
    }
    mostrarUsuarios(); // Actualiza la tabla automáticamente

    }//GEN-LAST:event_guardarUsuarioActionPerformed

    private void guardarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTablaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        conecxiones.conectar con = new conecxiones.conectar();
        java.sql.Connection cn = con.getConnection();

        try {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                int id = Integer.parseInt(modelo.getValueAt(i, 0).toString());
                String user = modelo.getValueAt(i, 1).toString().trim();
                String pass = modelo.getValueAt(i, 2).toString().trim();
                String name = modelo.getValueAt(i, 3).toString().trim();
                String tipo = modelo.getValueAt(i, 4).toString().trim();

                // Validar que tipo_usuario sea válido
                if (!(tipo.equals("admin") || tipo.equals("cajero") || tipo.equals("almacen"))) {
                    tipo = "cajero";
                }

                // Actualizar en la base de datos
                String sql = "UPDATE usuarios SET usuario=?, contraseña=?, nombre=?, tipo_usuario=? WHERE id_usuario=?";
                java.sql.PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, user);
                pst.setString(2, pass);
                pst.setString(3, name);
                pst.setString(4, tipo);
                pst.setInt(5, id);
                pst.executeUpdate();
            }

            javax.swing.JOptionPane.showMessageDialog(this, "Cambios guardados correctamente");
            mostrarUsuarios(); // refrescar tabla por seguridad

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar cambios: " + e.getMessage());
        } finally {
            con.desconectar();
        }
    }//GEN-LAST:event_guardarTablaActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      int fila = tabla.getSelectedRow();
      if(fila >= 0) {
          int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
          int resp = javax.swing.JOptionPane.showConfirmDialog(this, "¿Deseas eliminar este usuario?");
          if(resp == javax.swing.JOptionPane.YES_OPTION) {
              conecxiones.conectar con = new conecxiones.conectar();
              java.sql.Connection cn = con.getConnection();
              try {
                  String sql = "DELETE FROM usuarios WHERE id_usuario=?";
                  java.sql.PreparedStatement pst = cn.prepareStatement(sql);
                  pst.setInt(1, id);
                  pst.executeUpdate();
                  javax.swing.JOptionPane.showMessageDialog(this, "Usuario eliminado");
                  mostrarUsuarios();
              } catch(Exception e) {
                  javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar: " + e.getMessage());
              } finally {
                  con.desconectar();
              }
          }
      } else {
          javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar");
      }
    }//GEN-LAST:event_eliminarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        login login = new login();
        login.setVisible(true);
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed
    private void mostrarUsuarios() {
      String[] columnas = {"ID", "Usuario", "Contraseña", "Nombre", "Tipo Usuario"};
    javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(null, columnas) {
        boolean[] canEdit = new boolean [] {false, true, true, true, true}; 
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    conecxiones.conectar con = new conecxiones.conectar();
    java.sql.Connection cn = con.getConnection();

    try {
        String sql = "SELECT id_usuario, usuario, contraseña, nombre, tipo_usuario FROM usuarios";
        java.sql.Statement st = cn.createStatement();
        java.sql.ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id_usuario"),
                rs.getString("usuario"),
                rs.getString("contraseña"),
                rs.getString("nombre"),
                rs.getString("tipo_usuario")
            };
            modelo.addRow(fila);
        }

        tabla.setModel(modelo);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al mostrar usuarios: " + e.getMessage());
    } finally {
        con.desconectar();
    }
}

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
            java.util.logging.Logger.getLogger(agregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contraseña;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardarTabla;
    private javax.swing.JButton guardarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox tipo_usuario;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}
