package com.yuri.aulasjava.apibackend.fundamentos;

public class TiposDeDados {  public static void main(String[] args) {

    // --- TIPOS PRIMITIVOS NUMÉRICOS INTEIROS ---
    byte b = 10;              // 1 byte (-128 a 127)
    short s = 2000;           // 2 bytes (-32.768 a 32.767)
    int i = 50000;            // 4 bytes
    long l = 10000000000L;    // 8 bytes (note o 'L' no final)

    // --- TIPOS PRIMITIVOS NUMÉRICOS REAIS (com ponto flutuante) ---
    float f = 5.75f;          // 4 bytes (note o 'f' no final)
    double d = 19.99;         // 8 bytes

    // --- TIPOS PRIMITIVOS DE CARACTERE E BOOLEANO ---
    char letra = 'A';         // um único caractere (aspas simples)
    boolean ligado = true;    // verdadeiro ou falso

    // --- STRINGS (não é tipo primitivo, mas muito usada) ---
    String nome = "Rômulo";   // tipo referência (objeto)

    // --- EXIBINDO OS VALORES ---
    System.out.println("=== EXEMPLOS DE TIPOS PRIMITIVOS ===");
    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("int: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
    System.out.println("char: " + letra);
    System.out.println("boolean: " + ligado);
    System.out.println("String: " + nome);

    // --- CONSTANTE (valor que não muda) ---
    final double PI = 3.14159;
    System.out.println("\nConstante PI: " + PI);

    // --- CASTING IMPLÍCITO (conversão automática) ---
    int numInt = 100;
    double numDouble = numInt; // o Java converte automaticamente int → double
    System.out.println("\nCasting implícito (int -> double): " + numDouble);

    // --- CASTING EXPLÍCITO (conversão forçada) ---
    double valorDouble = 9.78;
    int valorInt = (int) valorDouble; // força a conversão double → int
    System.out.println("Casting explícito (double -> int): " + valorInt);

    // --- EXEMPLO EXTRA: CONCATENAÇÃO E OPERAÇÕES ---
    int idade = 25;
    double salario = 3500.50;
    String texto = "Idade: " + idade + " | Salário: R$" + salario;
    System.out.println("\n" + texto);

    // --- EXEMPLO DE VARIÁVEL TEMPORÁRIA E SOMA ---
    int a = 10;
    int b2 = 20;
    int soma = a + b2;
    System.out.println("Soma de " + a + " + " + b2 + " = " +soma);
}

}
