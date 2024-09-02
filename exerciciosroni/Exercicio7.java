package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){

/* Criar um algoritmo que leia dois números inteiros e imprima a 
seguinte saída: Dividendo, Divisor, Quociente e Resto*/

        int Dividendo;
        int Divisor;
        int Quociente;
        int Resto;

    System.out.print("Digite um dividendo: ");
    Scanner scanner = new Scanner(System.in);
    Dividendo = scanner.nextInt();

    System.out.print("Digite um divisor: ");
    Divisor = scanner.nextInt();

        Quociente = (Dividendo/Divisor);
        Resto = (Dividendo%Divisor);

    System.out.println("Dividendo: "+Dividendo+ "\nDivisor: " +Divisor+ "\nQuociente: " +Quociente+ "\nResto: "+Resto);





    }
}
