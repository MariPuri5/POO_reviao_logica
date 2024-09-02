package com.poo.exerciciosroni;

import java.util.Scanner;


public class Exercicio8 {
    public static void resolucao(){

/*Calcule a área e o preço de um terreno
area = largura x comprimento
preco = área x preco do metro quadrado */

double largura, comprimento, preco_mt2;

System.out.print("Largura do seu Terreno: ");
Scanner scanner = new Scanner(System.in);
largura = scanner.nextDouble();

System.out.print("Comprimento do seu Terreno: ");
comprimento = scanner.nextDouble();

System.out.println("O Valor do metro quadrado: ");
preco_mt2= scanner.nextDouble();

double Area = (largura*comprimento);

double total = (Area * preco_mt2);

System.out.println("A area é: " +Area);
System.out.println("Total do terreno é: " +total);


    }
}
