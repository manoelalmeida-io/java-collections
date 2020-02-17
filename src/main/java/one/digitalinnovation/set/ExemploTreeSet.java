package one.digitalinnovation.set;

import java.util.TreeSet;

public class ExemploTreeSet {

  public static void main(String[] args) {
    
    var treeCapitals = new TreeSet<String>();

    // Monta a árvore com as capitais
    treeCapitals.add("Porto Alegre");
    treeCapitals.add("Florianópolis");
    treeCapitals.add("Curitiba");
    treeCapitals.add("São Paulo");
    treeCapitals.add("Rio de Janeiro");
    treeCapitals.add("Belo Horizonte");
    
    System.out.println(treeCapitals);

    System.out.println(treeCapitals.first());
    System.out.println(treeCapitals.last());

    System.out.println(treeCapitals.lower("Florianópolis"));
    System.out.println(treeCapitals.higher("Florianópolis"));

    System.out.println(treeCapitals);

    System.out.println(treeCapitals.pollFirst());
    System.out.println(treeCapitals.pollLast());

    System.out.println(treeCapitals);

    var iterator = treeCapitals.iterator();

    while (iterator.hasNext()) {
      System.out.println("-->" + iterator.next());
    }

    for (var capital : treeCapitals) {
      System.out.println("---->" + capital);
    }
  }
}