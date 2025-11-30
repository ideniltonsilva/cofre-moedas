package trabalho;

//Classe que representa a moeda Real, herda de Moeda
public class Real extends Moeda {
 // Construtor que chama o construtor da classe mãe
 public Real(double valor) {
     super(valor);
 }

 // Implementação do método para converter para Real (já está em Real)
 @Override
 public double converterParaReal() {
     return valor;
 }

 // Retorna uma string com informações da moeda
 @Override
 public String info() {
     return "Real - R$ " + valor;
 }
}