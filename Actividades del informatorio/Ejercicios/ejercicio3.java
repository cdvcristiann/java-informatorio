package Ejercicios;

import java.util.Scanner;

public class ejercicio3{
public static void main(String[] args){
    Scanner entradasdenotas = new Scanner(System.in);
    System.out.println("Ingrese la nota del alumno: ");
    int notas = entradasdenotas.nextInt();
    
    if(notas>=93 && notas<=100){
        System.out.println("Excelente");
    }else{
        if(notas>=85 && notas < 93){
            System.out.println("Sobresaliente");
        }else{
            if(notas>=75 && notas < 85){
                System.out.println("Distingido");
            }else{
                if(notas>=60 && notas < 75){
                    System.out.println("bueno");
                }else{
                    if(notas>0 && notas< 60){
                        System.out.println("Desaprobado");
                    }else{
                        System.out.println("el dato ingresado no es valido");
                    }
                } 
            }
        }
    }entradasdenotas.close();
}
}