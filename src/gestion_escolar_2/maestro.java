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
public void  correo(){
    
}
 public void nombre(){
     
 }   
 public void telefono(){
     
 }
      public void mostrar(){
        System.out.println("Mi nombre es:"+Nombre+" Mi correo es:"+Correo+" y el telefono es "+Tel);
    }
}
