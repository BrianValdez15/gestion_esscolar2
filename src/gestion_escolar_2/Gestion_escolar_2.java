/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_escolar_2;

/**
 *
 * @author User
 */
public class Gestion_escolar_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       administrador admi = new administrador();
       admi.contraseñaAdmi();
       admi.correoAdmi();
       admi.pedirDatos();
       maestro maes = new maestro("bianvaldez@gmail.com", "panfilo  IV","1234",6276575);
      maes.nombre();
      maes.correo();
      maes.telefono();
     //Info maestro   
     maestro info= new maestro(123);
     info.maestro("Brian", "Briian123@gmail.com", "123", 551650);
     info.mostrar();
    }
    
}
