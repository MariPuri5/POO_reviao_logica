package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){

        //Leia dois valores pelo teclado e imprima a soma.

		int n1;
		int n2;

		System.out.print("Digite o primeiro número: "); // Aqui é o "escreva"
		Scanner scannerLeia = new Scanner(System.in);       //Aqui cria o scanner
		n1 = scannerLeia.nextInt();                        // Aqui é o "leia"
		
		System.out.print("O primeiro número é: "+n1+"\n");
		
		System.out.println("Digite o segundo número: ");
		n2 = scannerLeia.nextInt();

		System.out.println("O segundo número é: "+n2);

		System.out.println("A soma é: "+(n1+n2));

	}

}

    


