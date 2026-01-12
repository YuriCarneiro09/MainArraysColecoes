package com.yuri.aulasjava.apibackend.fundamentos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

public class MainArraysColecoes {

    public static void main(String[] args) {

        System.out.println("=== TIPOS DE ARRAYS E COLEÇÕES EM JAVA ===\n");

        // -------------------------------
        // 1️⃣ ARRAYS
        // -------------------------------
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);
        System.out.println("Tamanho do array: " + numeros.length);

        System.out.print("Percorrendo array: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // -------------------------------
        // 2️⃣ ARRAYLIST
        // -------------------------------
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Manga");

        System.out.println("ArrayList de frutas: " + frutas);
        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("Tamanho da lista: " + frutas.size());

        frutas.remove("Banana");
        frutas.add("Abacaxi");
        System.out.println("Após alterações: " + frutas + "\n");

        // -------------------------------
        // 3️⃣ HASHSET
        // -------------------------------
        HashSet<Integer> numerosUnicos = new HashSet<>();
        numerosUnicos.add(10);
        numerosUnicos.add(20);
        numerosUnicos.add(20); // repetido (ignorado)
        numerosUnicos.add(30);

        System.out.println("HashSet (sem repetição): " + numerosUnicos);
        System.out.println("Contém 20? " + numerosUnicos.contains(20));
        System.out.println("Tamanho do conjunto: " + numerosUnicos.size() + "\n");

        // -------------------------------
        // 4️⃣ HASHMAP
        // -------------------------------
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Ana", 25);
        idades.put("Bruno", 30);
        idades.put("Carlos", 28);

        System.out.println("HashMap (chave → valor): " + idades);
        System.out.println("Idade de Bruno: " + idades.get("Bruno"));

        idades.put("Ana", 26); // atualiza valor
        System.out.println("Após atualização: " + idades);

        System.out.println("Percorrendo HashMap:");
        for (Map.Entry<String, Integer> entrada : idades.entrySet()) {
            System.out.println(
                    "Nome: " + entrada.getKey() + " | Idade: " + entrada.getValue()
            );
        }
        System.out.println();

        // -------------------------------
        // 5️⃣ LINKEDLIST
        // -------------------------------
        LinkedList<String> fila = new LinkedList<>();
        fila.add("João");
        fila.add("Maria");
        fila.add("Pedro");

        System.out.println("LinkedList (fila): " + fila);
        System.out.println("Primeiro da fila: " + fila.getFirst());
        fila.removeFirst();
        System.out.println("Após remover primeiro: " + fila + "\n");

        // -------------------------------
        // 6️⃣ PRIORITYQUEUE
        // -------------------------------
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
        filaPrioridade.add(50);
        filaPrioridade.add(10);
        filaPrioridade.add(30);

        System.out.println("PriorityQueue (menor valor primeiro): " + filaPrioridade);
        System.out.println("Removendo menor: " + filaPrioridade.poll());
        System.out.println("Após remoção: " + filaPrioridade + "\n");

        // -------------------------------
        // DICAS FINAIS
        // -------------------------------
        System.out.println("✅ DICAS:");
        System.out.println("- Arrays têm tamanho fixo.");
        System.out.println("- ArrayList é dinâmico e aceita repetição.");
        System.out.println("- HashSet não aceita repetição.");
        System.out.println("- HashMap trabalha com chave e valor.");
        System.out.println("- LinkedList é boa para filas.");
        System.out.println("- PriorityQueue organiza por prioridade.");
    }
}
