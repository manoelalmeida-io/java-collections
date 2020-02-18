package one.digitalinnovation.comparators.exercicio;

public class Carro implements Comparable<Carro> {

  private final String modelo;
  private final Double valor;
  
  public Carro(String modelo, Double valor) {
    this.modelo = modelo;
    this.valor = valor;
  }

  public String getModelo() {
    return modelo;
  }

  public Double getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return String.format("%s:R$%.2f", modelo, valor);
  }

  @Override
  public int compareTo(Carro o) {
    return this.getValor() > o.getValor() ? 1 : this.getValor() == o.getValor() ? 0 : -1;
  }
}