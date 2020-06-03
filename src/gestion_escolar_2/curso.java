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
public class curso extends clase{
     int salon,grado;

    public curso(String Correo, String Nombre, String Contraseña, int Tel) {
        super(Correo, Nombre, Contraseña, Tel);
    }
    public void salon(){
        
    }
    public void grado(){
        
    }
      public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
  
}
