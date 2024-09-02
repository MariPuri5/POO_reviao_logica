package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){

/* Escreva um programa que leia a temperatura em Celsius e retorne o valor em Fahrenheit*/

double celsius;

System.out.println("Digite a temperatura em Celsius: ");
Scanner scanner = new Scanner(System.in); 
celsius = scanner.nextDouble();

double Fahrenheit = (celsius * 1.8) + 32;

System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);

};

    }

