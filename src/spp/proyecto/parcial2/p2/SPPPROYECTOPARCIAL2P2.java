/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyecto.parcial2.p2;
import java.util.Scanner;
/**
 *
 * @author Catalina
 */
public class SPPPROYECTOPARCIAL2P2 {
//Mariela Ramones Balvoa
//Catalina Guadalupe Domínguez Garza
//Kevin Gerardo Hinojosa Castellanos
//Alejandro García Monroy
//Lisdy Ronhmann
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int matA[][];
    int numF1, numC1, datoCas;
        System.out.println("Bienvenido al comparador de matrices");
        System.out.println("Ingresa el número de filas de la matriz A");
        Scanner enternumF1=new Scanner (System.in);
        numF1=enternumF1.nextInt();
        System.out.println("Ingresa el número de columnas de la matriz A");
        Scanner enternumC1=new Scanner (System.in);
        numC1=enternumC1.nextInt();
        matA=new int[numF1][numC1];
        for(int i=0;i<matA.length;i++){
            for(int j=0;j<matA.length;j++){
                System.out.println("Ingrese el dato a utilizar");
                Scanner enterCas=new Scanner (System.in);
                datoCas=enterCas.nextInt();
                matA[i][j]=datoCas;
                }
            }
        int matB[][];
        int numF2, numC2, datosCas2;
        System.out.println("Ingresa el número de filas de la matriz B");
        Scanner enternumF2=new Scanner (System.in);
        numF2=enternumF2.nextInt();
        System.out.println("Ingresa el núemero de columnas de la matriz B");
        Scanner enternumC2=new Scanner (System.in);
        numC2=enternumC2.nextInt();
        matB=new int [numF2][numC2];
        for (int i=0;i<matB.length;i++){
            for (int j=0;j<matB[i].length;j++){
                System.out.println("Inserta el dato de la casilla");
                Scanner enterCas2=new Scanner (System.in);
                datosCas2=enterCas2.nextInt();
                matB[i][j]=datosCas2;
            }
        }
        
        if((numF1 ==numF2)||(numC1 ==numC2)){
            System.out.println("Las matrices son iguales");
            System.exit(0);
            }
        else{
            System.out.println("Las matrices son diferentes");
        }
        
        for(int i=0;i<matB.length;i++){
            for(int j=0;j<matB[i].length;j++){
                if(matA[i][j]==matB[i][j]){
                    System.out.println("Los valores son diferentes");
                    System.exit(0);
                }
                else{
                }
            }
        }
        
        System.out.println("Los valores son iguales");
    }
}