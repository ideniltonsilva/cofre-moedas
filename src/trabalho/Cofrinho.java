package trabalho;

import java.util.ArrayList;

//Classe que representa o cofrinho, responsável por armazenar moedas
public class Cofrinho {
 // Lista que armazena objetos do tipo Moeda (polimorfismo)
 private ArrayList<Moeda> moedas = new ArrayList<>();

 // Adiciona uma moeda ao cofrinho
 public void adicionar(Moeda moeda) {
     moedas.add(moeda);
 }

 // Remove uma moeda pelo índice informado
 public void remover(int indice) {
     if (indice >= 0 && indice < moedas.size()) {
         moedas.remove(indice);
         System.out.println("Moeda removida!");
     } else {
         System.out.println("Índice inválido!");
     }
 }

 // Lista todas as moedas do cofrinho com seus índices
 public void listar() {
     if (moedas.isEmpty()) {
         System.out.println("Cofrinho vazio!");
     } else {
         for (int i = 0; i < moedas.size(); i++) {
             System.out.println(i + " - " + moedas.get(i).info());
         }
     }
 }

 // Calcula o total em Real somando todas as moedas convertidas
 public double calcularTotal() {
     double total = 0;
     for (Moeda m : moedas) {
         total += m.converterParaReal();
     }
     return total;
 }
}