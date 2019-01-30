
package mb_version_3;

import control.ValidarLogin;
import entidad.Admin;
import javax.swing.JOptionPane;


public class LoginPanel extends javax.swing.JPanel {

    
    String nombre;
    String contraseña;
    private IncludePanel include = new IncludePanel();
    private Admin admin = new Admin(nombre,contraseña);
    
    public LoginPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jpassClave = new javax.swing.JPasswordField();
        OK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        LoginPanel.setLayout(new java.awt.BorderLayout());

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        jLabel2.setText("Password:");

        jLabel1.setText("User:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OK)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jpassClave))))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpassClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(OK)
                .addGap(88, 88, 88))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
       
        
        char clave[]=jpassClave.getPassword();
        String clavedef=new String(clave);

        if ((txtUsuario.getText().equals("Administrador") && clavedef.equals("12345"))||
            (txtUsuario.getText().equals("Admin") && clavedef.equals("56789"))){

                    JOptionPane.showMessageDialog(null, "Bienvenido\n"
                    + "Has ingresado satisfactoriamente al sistema",   "Mensaje de bienvenida",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                    LoginPanel.setVisible(false);
                    LoginPanel.removeAll();
                    LoginPanel.add(include);
                    LoginPanel.setVisible(true);
                  
                    
            }else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                    JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_OKActionPerformed

    private javax.swing.JButton SalirAdmin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jpassClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
