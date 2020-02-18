package one.digitalinnovation.comparators.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercicio {

  public static void main(String[] args) {
    
    var carros = new ArrayList<Carro>();

    carros.add(new Carro("Camaro", 250000.00));
    carros.add(new Carro("Gol", 10000.00));
    carros.add(new Carro("Uno", 25000.00));
    carros.add(new Carro("Celta", 12500.00));
    carros.add(new Carro("Fusca", 8000.00));
    carros.add(new Carro("Opala", 20000.00));

    System.out.println("======== Ordem de inserção =========");
    System.out.println(carros);

    Collections.sort(carros);

    System.out.println("======== Ordem (Comparable) =========");
    System.out.println(carros);

    Collections.sort(carros, new CarroOrdemNome());

    System.out.println("======== Ordem (Comparator) =========");
    System.out.println(carros);

    carros.sort((carro1, carro2) -> {
      return carro1.getValor() < carro2.getValor() ? 1 : carro1.getValor() == carro2.getValor() ? 0 : -1;
    });

    System.out.println("======== Ordem (Lambda) =========");
    System.out.println(carros);

    carros.sort(Comparator.comparingDouble(Carro::getValor));

    System.out.println("======== Ordem (method reference) =========");
    System.out.println(carros);
  }
}