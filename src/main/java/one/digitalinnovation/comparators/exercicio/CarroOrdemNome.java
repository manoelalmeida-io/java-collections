package one.digitalinnovation.comparators.exercicio;

import java.util.Comparator;

public class CarroOrdemNome implements Comparator<Carro> {

  @Override
  public int compare(Carro o1, Carro o2) {
    
    return o1.getModelo().compareTo(o2.getModelo());
  }
}