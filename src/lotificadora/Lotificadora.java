/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;
import java.util.Scanner;

/**
 *
 * @author Juan Zepeda
 */import java.util.Scanner;
public class Lotificadora {

  public static ProyectoNotificacion f=new ProyectoNotificacion();
   
    public static void main(String[] args) {

      Scanner leer = new Scanner(System.in);
      
      int option = 0;
      
      while(option!=3){
          System.out.println("---------------- Menu Lotificadora -----------------");
          System.out.print("1.Venta de Terrenos \n 2.Opciones \n 3.Salir");
          System.out.println("Ingrese una opciÛn del menu :");
          option= leer.nextInt();
          switch(option) {
              
              case 1:
                 f.venta();
                 
                  break;
              case 2:
                   
      int op = 0;
      
      while(op!=3){
          System.out.println("---------------- Menu Lotificadora -----------------");
          System.out.print("1.Consulta \n 2.Reportes \n 3.Atras");
          System.out.print("Ingrese una opcion del menu :");
          op= leer.nextInt();
          switch(op) {
              
              case 1:
                 f.mostrar();
              case 2:
                  f.terrenosTotal();
         
          }
      }
           
                  break;
              case 3:
                  System.exit(0);
                  break;
          }
      }

    }
    
}
