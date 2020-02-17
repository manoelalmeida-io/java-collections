package one.digitalinnovation.set;

import java.util.HashSet;

public class ExemploHashSet {

  public static void main(String[] args) {
    
    var notasAlunos = new HashSet<Double>();

    // adiciona as notas no set
    notasAlunos.add(5.8);
    notasAlunos.add(9.3);
    notasAlunos.add(6.5);
    notasAlunos.add(10.0);
    notasAlunos.add(5.4);
    notasAlunos.add(7.3);
    notasAlunos.add(3.8);
    notasAlunos.add(4.0);

    System.out.println(notasAlunos);

    notasAlunos.remove(3.8);

    System.out.println(notasAlunos);

    var iterator = notasAlunos.iterator();

    while (iterator.hasNext()) {
      System.out.println("-->" + iterator.next());
    }

    for (var nota : notasAlunos) {
      System.out.println("---->" + nota);
    }

    notasAlunos.clear();

    System.out.println(notasAlunos.isEmpty());
  }
}