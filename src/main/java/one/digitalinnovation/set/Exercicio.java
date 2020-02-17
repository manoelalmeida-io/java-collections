package one.digitalinnovation.set;

import java.util.LinkedHashSet;

public class Exercicio {

  public static void main(String[] args) {
    
    var numeros = new LinkedHashSet<Integer>();

    numeros.add(6);
    numeros.add(5);
    numeros.add(2);
    numeros.add(10);
    numeros.add(34);
    numeros.add(8);

    for (var numero : numeros) {
      System.out.println("-->" + numero);
    }

    numeros.remove(6);
    numeros.add(23);

    System.out.println(numeros);

    System.out.println(numeros.size());
    System.out.println(numeros.isEmpty());
  }
}