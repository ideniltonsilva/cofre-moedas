package trabalho;

//Classe abstrata que representa uma moeda genérica
public abstract class Moeda {
 // Atributo protegido que armazena o valor da moeda
 protected double valor;

 // Construtor que inicializa o valor da moeda
 public Moeda(double valor) {
     this.valor = valor;
 }

 // Método abstrato que será implementado pelas subclasses para converter para Real
 public abstract double converterParaReal();

 // Método abstrato que retorna informações sobre a moeda (tipo e valor)
 public abstract String info();
}