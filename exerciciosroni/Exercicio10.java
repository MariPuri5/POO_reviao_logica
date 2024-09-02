package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio10 {
     public static void resolucao(){

/*Criar um algoritmo para ler um tempo em segundos 
e fazer a impressão no console no seguinte formato:
hora:minuto:segundos */

int segundos, h, m, s, resto;

System.out.println("Digite o tempo em segundos: ");
Scanner scanner = new Scanner(System.in);
segundos = scanner.nextInt();

h = (segundos/3600);

resto = (segundos%3600);

m = (resto/60);

s = (resto % 60);

System.out.print(" h: "+h+" m: "+m+" s: "+s);

     }
}
