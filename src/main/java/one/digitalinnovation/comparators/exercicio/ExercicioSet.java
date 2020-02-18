package one.digitalinnovation.comparators.exercicio;

import java.util.TreeSet;

public class ExercicioSet {

  public static void main(String[] args) {
    
    var carros = new TreeSet<Carro>((carro1, carro2) -> {
      return carro1.getModelo().compareTo(carro2.getModelo());
    });

    carros.add(new Carro("Camaro", 250000.00));
    carros.add(new Carro("Gol", 10000.00));
    carros.add(new Carro("Uno", 25000.00));
    carros.add(new Carro("Celta", 12500.00));
    carros.add(new Carro("Fusca", 8000.00));
    carros.add(new Carro("Opala", 20000.00));

    System.out.println("======== Ordem de inserção =========");
    System.out.println(carros);
  }
}