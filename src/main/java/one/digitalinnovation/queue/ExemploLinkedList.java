package one.digitalinnovation.queue;

import java.util.LinkedList;

public class ExemploLinkedList {

  public static void main(String[] args) {
    
    var filaBanco = new LinkedList<String>();

    filaBanco.add("Pamela");
    filaBanco.add("Patricia");
    filaBanco.add("Roberto");
    filaBanco.add("Flávio");
    filaBanco.add("Anderson");

    System.out.println(filaBanco);

    var clieteASerAtendido = filaBanco.poll();

    System.out.println(clieteASerAtendido);
    System.out.println(filaBanco);
    
    //filaBanco.clear();

    var primeroCliente = filaBanco.peek(); // retorna null se a lista estiver vazia

    System.out.println(primeroCliente);
    System.out.println(filaBanco);

    var primeiroClienteOuErro = filaBanco.element(); // lança uma exessão se a lista estiver vazia

    System.out.println(primeiroClienteOuErro);
    System.out.println(filaBanco);

    for (var cliente : filaBanco) {
      System.out.println("-->" + cliente);
    }

    var iteratorFilaBanco = filaBanco.iterator();

    while (iteratorFilaBanco.hasNext()) {
      System.out.println("---->" + iteratorFilaBanco.next());
    }

    System.out.println(filaBanco.size());

    filaBanco.clear();

    System.out.println(filaBanco.isEmpty());
  }
}