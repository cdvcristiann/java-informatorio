package Ejercicios;

import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args){
        Scanner EntradaDeNumero = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 7 para ver que dia de la semana pertenece: ");
        int numero = EntradaDeNumero.nextInt();
        switch (numero) {
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("martes");
                break;
            case 4:
                System.out.println("miercoles");
                break;
            case 5:
                System.out.println("jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("el numero ingresado no esta en el rango de los dias de la semana");
                break;
        } EntradaDeNumero.close();
    } 
    
}
