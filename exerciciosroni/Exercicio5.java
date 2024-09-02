package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio5 {
public static void resolucao() {
    
/*Uma empresa paga R$10.00 por hora normal trabalhada e 
R$ 15.00 por hora extra. Escreva um
algoritmo que leia o total de horas normais trabalhadas e o 
total de horas extras trabalhadas por um
empregado em um ano e calcule o salário anual deste trabalhador. */

    int hora;
    int hora_extra;
    double salario_hora = 10.00;
    double salario_extra = 15.00;

    System.out.println("digite o N° de horas trabalhadas no ano: ");
    Scanner scanner = new Scanner(System.in);
    hora = scanner.nextInt(); 

    System.out.println("Digite o N° de horas extras no ano: ");
    hora_extra = scanner.nextInt();

    System.out.println("Seu salario anual é de: R$" + ((hora*salario_hora)+(hora_extra*salario_extra)));





}
}
