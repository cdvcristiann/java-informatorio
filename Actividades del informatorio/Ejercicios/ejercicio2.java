package Ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    

	public static void main(String[] args){
       /* Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int numeroEntero = entradaDatos.nextInt();
        
        System.out.println("ingrese el segundo numero");
        int numeroEntero2 = entradaDatos.nextInt();
        
        System.out.println("ingrese el tercer numero");
        int numeroEntero3 = entradaDatos.nextInt();

    System.out.println("El primer nro ingresado es: " + numeroEntero);
    System.out.println("El segundo nro ingresado es: " + numeroEntero2);
    System.out.println("El tercer nro ingresado es: " + numeroEntero3);
    entradaDatos.close();*/
    boolean iniciar = true;
    do{
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numeroEntero = entradaDatos.nextInt();
        System.out.println("¿desea seguir ingresando numeros?|1-si|2-no|: ");
        int numero = entradaDatos.nextInt();
        switch (numero) {
            case 1:
            System.out.println("El numero ingresado es: " + numeroEntero);                
                break;
        
            default:
            System.out.println("El numero ingresado es: " + numeroEntero);
            iniciar = false;
            break;
        }}
    while (iniciar);
    
        
    
       
}}
