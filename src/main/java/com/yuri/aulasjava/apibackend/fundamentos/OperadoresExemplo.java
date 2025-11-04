package com.yuri.aulasjava.apibackend.fundamentos;

public class OperadoresExemplo {

    public static void main(String[] args) {
        // --- Operadores Aritméticos ---
        int a = 10;
        int b = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));   // soma
        System.out.println("a - b = " + (a - b));   // subtração
        System.out.println("a * b = " + (a * b));   // multiplicação
        System.out.println("a / b = " + (a / b));   // divisão inteira
        System.out.println("a % b = " + (a % b));   // resto da divisão

        // --- Operadores Relacionais ---
        System.out.println("\n=== Operadores Relacionais ===");
        System.out.println("a == b ? " + (a == b)); // igualdade
        System.out.println("a != b ? " + (a != b)); // diferença
        System.out.println("a > b ? " + (a > b));   // maior que
        System.out.println("a < b ? " + (a < b));   // menor que
        System.out.println("a >= b ? " + (a >= b)); // maior ou igual
        System.out.println("a <= b ? " + (a <= b)); // menor ou igual

        // --- Operadores Lógicos ---
        boolean x = true;
        boolean y = false;

        System.out.println("\n=== Operadores Lógicos ===");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y = " + (x && y)); // E lógico
        System.out.println("x || y = " + (x || y)); // OU lógico
        System.out.println("!x = " + (!x));         // Negação
        System.out.println("!y = " + (!y));
    }
}