/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía5.ejerc6;

import java.util.Scanner;

/**
 *
 * @author Vanesa.-PC
 */
public class Guía5Ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
        del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales
        son idénticas. Crear un programa que permita introducir un cuadrado
        por teclado y determine si este cuadrado es mágico o no. El programa
        deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.*/
        Scanner read=new Scanner (System.in);
        int [][] magic = new int [3][3];
        
        System.out.println("Ingrese los números de la matriz para velidar si es un cuadrado mágico");
        
        //llenar matriz
        int num;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            
                 do{ 
                 num=read.nextInt();
                }while(num<1 || num>9);
            
             magic[i][j]=num;
            }  
        }
        
        //imprimir matriz
        for(int[]fila:magic){
            for(int elemento:fila){
                System.out.print(elemento);
            }
            System.out.println("");
        }
        
        //diagonal1
        int sumadiago=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    sumadiago=sumadiago+magic[i][j];
                }
            }
        }
        
        //diagonal2
       int sumadiago2=0;
       int contador=3;
        for(int i=0;i<3;i++){
            contador--;
            for(int j=0;j<3;j++){
                if (j==contador){
                 sumadiago2=sumadiago2+magic[i][contador];
                 j=3;
                }
            }
         }
       
        //filas y columnas
        int sumafila=0;
        int sumacolum=0;
        
        if(sumadiago==sumadiago2){
             //filas
            for(int i=0;i<3;i++){
                sumafila=0;
                for(int j=0;j<3;j++){
                    sumafila=sumafila+magic[i][j];
                }
                if(sumafila!=sumadiago){
                     i=3;
                }
            }

            if (sumafila==sumadiago){
                for(int k=0;k<3;k++){
                    sumacolum=0;
                    for(int l=0;l<3;l++){
                     sumacolum=sumacolum+magic[l][k];
                    }
                     if(sumacolum!=sumadiago){
                        k=3;
                      }
                }     
            }
        }   
        if(sumacolum==sumadiago){
            System.out.println("La matriz es un cuadrado mágico");
        }else{
            System.out.println("La matriz no es un cuadrado mágico");
          }

}
}