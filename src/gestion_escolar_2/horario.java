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
public class horario extends clase{
      String Dia;
   double Inicio,Termino;

    public Horario(int Salon, int grado) { //Curso
        super(Salon, grado);
    }
   
    public void Dia() { 
    String D;
          System.out.println("Lunes");

    }
    public void Inicio() { 
    double Inicia;
      double I = 8.50;
         System.out.println(I);

    }
    public void Termino() { 
      double Terino =9.45 ; 
         System.out.println(Termino);
   }
  public void MostrarHorario(){
  System.out.println(Dia);
    System.out.println(Inicio);
    System.out.println(Termino);
  }
}
