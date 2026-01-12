package com.yuri.aulasjava.apibackend.fundamentos;

public class OperadoresTernarios {
    public static void main(String[] args) {

        System.out.println("=== EXEMPLOS DE OPERADOR TERNÁRIO ===");

        int idade = 18;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Idade: " + idade + " -> " + resultado);

        // Exemplo com duas condições
        int nota = 7;
        String desempenho = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Nota: " + nota + " -> " + desempenho);

        // Encadeando ternários
        int temperatura = 30;
        String clima = (temperatura < 15) ? "Frio"
                : (temperatura < 25) ? "Agradável"
                : "Quente";
        System.out.println("Temperatura: " + temperatura + "°C -> " + clima);

        System.out.println("\n=== EXEMPLOS DE PRECEDÊNCIA DE OPERADORES ===");

        int a = 10, b = 5, c = 2;

        // Sem parênteses: * tem precedência sobre +
        int resultado1 = a + b * c;  // 10 + (5 * 2) = 20
        System.out.println("a + b * c = " + resultado1);

        // Com parênteses: muda a ordem da avaliação
        int resultado2 = (a + b) * c;  // (10 + 5) * 2 = 30
        System.out.println("(a + b) * c = " + resultado2);

        // Exemplo com operadores lógicos
        boolean x = true, y = false, z = true;

        boolean expressao1 = x || y && z; // && tem precedência sobre ||
        // Resultado: true || (false && true) -> true || false -> true
        System.out.println("x || y && z = " + expressao1);

        // Usando parênteses para mudar a ordem
        boolean expressao2 = (x || y) && z; // (true || false) && true -> true && true -> true
        System.out.println("(x || y) && z = " + expressao2);
    }
}
