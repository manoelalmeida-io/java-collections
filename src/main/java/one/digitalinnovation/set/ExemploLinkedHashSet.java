package one.digitalinnovation.set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

  public static void main(String[] args) {
    
    var sequenciaNumerica = new LinkedHashSet<Integer>();

    // adicionando números ao set

    sequenciaNumerica.add(1);
    sequenciaNumerica.add(2);
    sequenciaNumerica.add(4);
    sequenciaNumerica.add(16);
    sequenciaNumerica.add(8);

    System.out.println(sequenciaNumerica);

    sequenciaNumerica.remove(4);

    System.out.println(sequenciaNumerica);

    System.out.println(sequenciaNumerica.size());

    var iterator = sequenciaNumerica.iterator();

    while (iterator.hasNext()) {
      System.out.println("-->" + iterator.next());
    }

    for (var numero : sequenciaNumerica) {
      System.out.println("---->" + numero);
    }

    sequenciaNumerica.clear();

    System.out.println(sequenciaNumerica.isEmpty());
  }
}