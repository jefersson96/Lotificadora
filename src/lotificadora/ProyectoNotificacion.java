/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;

import java.util.Scanner;

/**
 *
 * @author jefersson
 */
public class ProyectoNotificacion {
   Terreno [][] terrenos;
  Scanner leer=new Scanner(System.in); 
   
   public ProyectoNotificacion(){
this.terrenos=new Terreno[5][5];

}
   
   public boolean Ocupado(int x,int y){
   if(terrenos[x][y]==null){
return true;   
   }else{
   return false;
   }
   
   
   }
   
   public boolean venta(){
 int x;
       int y;
       System.out.print("Ingrese las cordenadas de su terreno x :");
   x=leer.nextInt();
   System.out.println("Ingrese las coordenadas de su terreno y :");
   y=leer.nextInt();
   System.out.print("Ingrese el largo del terreno :");
   double largo=leer.nextInt();
   System.out.print("Ingrese el hancho del terreno :");
   double hancho=leer.nextDouble();
   System.out.print("Ingrese el precio del terreno :");
   double precio=leer.nextDouble();
  terrenos[x][y]=new Terreno(largo,hancho,precio);
       return true;
   }
   
   public void imp(int x,int y){
  
       
       
       System.out.println(terrenos[x][y]+" ");
   
   
   }
 
   public void terrenosTotal(){
  int contador=0;
  int contador2=0;
       for(int x=0;x<terrenos.length;x++){
   for(int i=0;i<terrenos.length;i++){
   
   if(terrenos[x][i]==null){
   contador++;
   
   }else{
   contador2++;
   
   }
   
   }
   
   }
       System.out.println("Terrenos ocupados total "+contador2);
   System.out.println("Terrenos vacios total "+contador);
   }
   
   public void mostrar(){
    System.out.println("Ingrese fila :");
                  int fila=leer.nextInt();
                  System.out.print("Ingrese columna :");
                  int columa=leer.nextInt();
                  terrenos[fila][columa].printTerreno();
   
   
   
   }
   }
