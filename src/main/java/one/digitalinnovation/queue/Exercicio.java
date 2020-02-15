package one.digitalinnovation.queue;

import java.util.LinkedList;

public class Exercicio {

  public static void main(String[] args) {
    
    var fila = new LinkedList<String>();

    fila.add("Juliana");
    fila.add("Pedro");
    fila.add("Carlos");
    fila.add("Larissa");
    fila.add("João");

    for (var cliente : fila) {
      System.out.println("-->" + cliente);
    }

    System.out.println(fila.peek());
    System.out.println(fila);

    System.out.println(fila.poll());
    System.out.println(fila);

    fila.add("Daniel");
    System.out.println(fila);

    System.out.println("tamanho: " + fila.size());

    System.out.println("tem carlos: " + fila.contains("Carlos"));
  }  
}