package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio9 {
    public static void resolucao(){
 
        /*Fazer um algoritmo para ler a distância percorrida em km e 
        o total gasto de combustível, no final deverá
        ser exibido o consumo médio do carro. */

        double distancia_percorrida_em_km, total_gasto;

        System.out.print("Distancia percorrida (km): ");
        Scanner scanner = new Scanner(System.in);
        distancia_percorrida_em_km = scanner.nextDouble();


        System.out.print("Total gasto de combustivel: ");
        total_gasto = scanner.nextDouble();

        double consumo_medio = (distancia_percorrida_em_km / total_gasto);


        System.out.println("O consumo médio é: " + consumo_medio);  





    }

}
