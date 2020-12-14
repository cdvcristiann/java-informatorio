package Ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
    Scanner entradadeDatos = new Scanner(System.in);
    System.out.println("ingrese un numero entero : ");
    int entero = entradadeDatos.nextInt();
    int i;
    int n = 10;
    entradadeDatos.close();
    for (i=0; i<=n; i++) 
    {
        System.out.println((entero)+" "+"*"+ " "+ i + " "+ "=" + " " + (entero*i));
        
    }
    
    
}}
