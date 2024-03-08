package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Exercício sobre While
 *
 * 1. Imprimir os números de 1 a 10
 *
 * 2. Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 *
 * 3. Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
 * 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
 * código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
 *
 * 4. Imprimir a tabuada de um número
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioWhile {

    public static void main(String[] args) {
        System.out.println("Exercícios de WHILE");
        System.out.println("1 - Contar até 10");
        System.out.println("2 - Senha");
        System.out.println("3 - Combustível");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Sair");
        System.out.print("Digite a opção desejada: ");
        Scanner s = new Scanner(System.in);
        int opcao = s.nextInt();
        while (opcao != 5) {
            switch (opcao) {
                case 1 -> {
                    System.out.println("Bem vindo(a) ao programa 1. Imprimir os números de 1 a 10");
                    int contador = 1;
                    while (contador <= 10) {
                        System.out.println(contador);
                        contador++;
                    }
                }
                case 2 -> {
                    System.out.println("Bem vindo(a) ao programa 2. Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, "
                            + "escrever a mensagem \"Senha Invalida\". Quando a senha for informada corretamente deve ser impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere "
                            + "que a senha correta é o valor 2002.");
                    System.out.print("Digite a senha: ");
                    Scanner senha = new Scanner(System.in);
                    String senhaStr = senha.next();
                    while (!"2002".equals(senhaStr)) {
                        System.out.println("Senha Inválida");
                        System.out.print("Digite a senha: ");
                        senhaStr = senha.next();
                        if (senhaStr.equals("2002")) {
                            System.out.println("Acesso Permitido");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Bem vindo(a) ao programa 3. Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler"
                            + " o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)"
                            + " deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: \"MUITO "
                            + "OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.");
                    int alcool = 0;
                    int gasolina = 0;
                    int diesel = 0;
                    Scanner combustivel = new Scanner(System.in);
                    System.out.println("1 - Álcool");
                    System.out.println("2 - Gasolina");
                    System.out.println("3 - Diesel");
                    System.out.println("4 - Fim");
                    System.out.print("Digite o número de acordo com o combustível que você abasteceu: ");
                    int escolhaCombustivel = combustivel.nextInt();
                    while (escolhaCombustivel != 4 && 0 < escolhaCombustivel && escolhaCombustivel < 5) {
                        switch (escolhaCombustivel) {
                            case 1 ->
                                alcool++;
                            case 2 ->
                                gasolina++;
                            case 3 ->
                                diesel++;
                        }
                        System.out.println("1 - Álcool");
                        System.out.println("2 - Gasolina");
                        System.out.println("3 - Diesel");
                        System.out.println("4 - Fim");
                        System.out.print("Digite o número de acordo com o combustível que você abasteceu: ");
                        escolhaCombustivel = combustivel.nextInt();
                    }
                    System.out.println("Quantidade de clientes que abasteceram com Álcool: " + alcool);
                    System.out.println("Quantidade de clientes que abasteceram com Gasolina: " + gasolina);
                    System.out.println("Quantidade de clientes que abasteceram com Diesel: " + diesel);
                }
                case 4 -> {
                    System.out.println("Bem vindo(a) ao programa 4. Imprimir a tabuada de um número");
                    System.out.print("Digite algum número: ");
                    Scanner tabuada = new Scanner(System.in);
                    double escolhaTabuada = tabuada.nextDouble();
                    double contador = 1;
                    //while (contador <= escolhaTabuada) {
                    while (contador <= 10) {
                        System.out.println(contador + " x " + escolhaTabuada + ": " + contador * escolhaTabuada);
                        contador++;
                    }
                    break;
                }
                default -> {
                    System.out.println("Essa opção não existe, tente novamente!");
                }
            }
            System.out.println("Exercícios de WHILE");
            System.out.println("1 - Contar até 10");
            System.out.println("2 - Senha");
            System.out.println("3 - Combustível");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = s.nextInt();
        }
        /*
        System.out.print("Digite algum número: ");
        int x = s.nextInt();
        int soma = 0;
        
        while (x != 0) {
        soma += x;
        System.out.print("Digite algum número: ");
        x = s.nextInt();
        }
        s.close();
        System.out.println("A soma de todos os números é = " + soma);*/
    }
}
