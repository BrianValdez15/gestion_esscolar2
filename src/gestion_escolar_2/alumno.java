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
public class alumno extends escuela{
    //esto fue agregado por yair
     private  String Correo;
  private  String Nombre;
  private   String Alergias;
 private   String Contraseña;
  private  int TelPadre;

    public alumno(String Correo,String Nombre,String Alergias, String Contraseña, int TelPadre  ) {
        this.Correo = Correo;
        this.Nombre = Nombre;
        this.Alergias = Alergias;
        this.Contraseña = Contraseña;
        this.TelPadre = TelPadre;
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

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getTelPadre() {
        return TelPadre;
    }

    public void setTelPadre(int TelPadre) {
        this.TelPadre = TelPadre;
    }
}

