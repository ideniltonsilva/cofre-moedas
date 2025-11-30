package trabalho;

//Classe que representa a moeda Dólar, herda de Moeda
public class Dolar extends Moeda {
 // Construtor que chama o construtor da classe mãe
 public Dolar(double valor) {
     super(valor);
 }

 // Converte o valor do dólar para Real usando uma cotação fictícia
 @Override
 public double converterParaReal() {
     return valor * 5.50; // Cotação fictícia
 }

 // Retorna uma string com informações da moeda
 @Override
 public String info() {
     return "Dólar - US$ " + valor;
 }
}