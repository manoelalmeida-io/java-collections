package one.digitalinnovation.comparators.exercicio;

import java.util.TreeMap;

public class ExercicioMap {

  public static void main(String[] args) {
    
    var carros = new TreeMap<Carro, Integer>((carro1, carro2) -> {
      return carro1.getModelo().compareTo(carro2.getModelo());
    });

    carros.put(new Carro("Camaro", 250000.00), 1);
    carros.put(new Carro("Gol", 10000.00), 2);
    carros.put(new Carro("Uno", 25000.00), 3);
    carros.put(new Carro("Celta", 12500.00), 4);
    carros.put(new Carro("Fusca", 8000.00), 5);
    carros.put(new Carro("Opala", 20000.00), 6);

    System.out.println("======== Ordem de inserção =========");
    System.out.println(carros);
  }
}