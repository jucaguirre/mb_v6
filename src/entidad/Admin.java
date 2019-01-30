/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Admin {

    String nombre;
    String contraseña;

    public Admin(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void inicializar ()
    {
        ArrayList<Admin> admins = new ArrayList();
        
    Admin a = new Admin("diego", "1234");
    Admin b = new Admin("julio", "5678");
    Admin c = new Admin("brian", "9012");
    Admin d = new Admin("lorraine", "3456");
    Admin e = new Admin("javier", "7890");

    
    admins.add(a);
    admins.add(b);
    admins.add(c);
    admins.add(d);
    admins.add(e);
    }
}
