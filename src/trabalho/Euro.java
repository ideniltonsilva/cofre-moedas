package trabalho;

//Classe que representa a moeda Euro, herda de Moeda
public class Euro extends Moeda {
 // Construtor que chama o construtor da classe mãe
 public Euro(double valor) {
     super(valor);
 }

 // Converte o valor do euro para Real usando uma cotação fictícia
 @Override
 public double converterParaReal() {
     return valor * 6.00; // Cotação fictícia
 }

 // Retorna uma string com informações da moeda
 @Override
 public String info() {
     return "Euro - € " + valor;
 }
}