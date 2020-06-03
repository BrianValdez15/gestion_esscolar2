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
public class maestro extends escuela{
    private  String Correo;
  private  String Nombre;
 private   String Contraseña;
  private  int Tel;
  private int IdProfe;

    public maestro(String Correo,String Nombre, String Contraseña, int Tel ) {
        this.Correo = Correo;
        this.Nombre = Nombre;
        
        this.Contraseña = Contraseña;
        this.Tel = Tel;
    }
public maestro (int IdProfe){
    this.IdProfe= IdProfe;
}
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
}
    
}
