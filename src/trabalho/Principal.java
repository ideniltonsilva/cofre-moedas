package trabalho;

import java.util.Scanner;

//Classe principal que contém o método main e o menu interativo
public class Principal {
 public static void main(String[] args) {
     // Scanner para entrada de dados do usuário
     Scanner sc = new Scanner(System.in);
     // Instancia um cofrinho
     Cofrinho cofrinho = new Cofrinho();
     int opcao;

     // Loop do menu até o usuário escolher sair
     do {
         System.out.println("\n--- MENU ---");
         System.out.println("1 - Adicionar moeda");
         System.out.println("2 - Remover moeda");
         System.out.println("3 - Listar moedas");
         System.out.println("4 - Calcular total em Real");
         System.out.println("0 - Sair");
         System.out.print("Escolha: ");
         opcao = sc.nextInt();

         switch (opcao) {
             case 1:
                 // Adicionar moeda
                 System.out.println("Escolha a moeda: 1-Real | 2-Dólar | 3-Euro");
                 int tipo = sc.nextInt();
                 System.out.print("Valor: ");
                 double valor = sc.nextDouble();

                 Moeda moeda = null;
                 if (tipo == 1) moeda = new Real(valor);
                 else if (tipo == 2) moeda = new Dolar(valor);
                 else if (tipo == 3) moeda = new Euro(valor);

                 if (moeda != null) {
                     cofrinho.adicionar(moeda);
                     System.out.println("Moeda adicionada!");
                 }
                 break;

             case 2:
                 // Remover moeda
                 cofrinho.listar();
                 System.out.print("Informe o índice da moeda para remover: ");
                 int indice = sc.nextInt();
                 cofrinho.remover(indice);
                 break;

             case 3:
                 // Listar moedas
                 cofrinho.listar();
                 break;

             case 4:
                 // Calcular total
                 System.out.println("Total em Real: R$ " + cofrinho.calcularTotal());
                 break;

             case 0:
                 System.out.println("Saindo...");
                 break;

             default:
                 System.out.println("Opção inválida!");
         }
     } while (opcao != 0);

     sc.close();
 }
}