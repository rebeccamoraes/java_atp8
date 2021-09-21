package modulo2;

import java.util.Scanner;

/**
 * Atividade Prática 8 - Métodos
 * _ Leia dois valores do tipo double, digitados pelo usuário.
 * _ Realize a chamada para um método que faz a soma entre os dois números e retorna o resultado.
 * _ Realize a chamada para um método que faz a subtração entre os dois números e retorna o resultado.
 * _ Realize a chamada para um método que faz a multiplicação entre os dois números e retorna o resultado.
 * _ Realize a chamada para um método que faz a divisão entre os dois números e retorna o resultado.
 */
public class atp8_metodos {
    public static void main(String[] args) {
        double n1 = 0, n2 = 0;

        cabecalho();

        n1 = lerValor("Primeiro número: ");
        n2 = lerValor("Segundo número: ");

        System.out.printf("A soma de %.2f e %.2f é %.2f.\n", n1, n2, soma(n1, n2));
        System.out.printf("A subtração de %.2f e %.2f é %.2f.\n", n1, n2, subtracao(n1, n2));
        System.out.printf("A divisão de %.2f e %.2f é %.2f.\n", n1, n2, divisao(n1, n2));
        System.out.printf("A multiplicação de %.2f e %.2f é %.2f.\n", n1, n2, multiplicacao(n1, n2));
    }

    static void cabecalho() {
        System.out.println("======= Calculadora ==========");
    }

    static double lerValor(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(mensagem);
        double valor = scanner.nextDouble();

        return valor;
    }

    static double soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }

    static double subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    static double divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        return resultado;
    }

    static double multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }
}
