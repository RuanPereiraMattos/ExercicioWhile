package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Exercício sobre While
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite algum número: ");
        int x = s.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            System.out.print("Digite algum número: ");
            x = s.nextInt();
        }
        s.close();
        System.out.println("A soma de todos os números é = " + soma);
    }
}
