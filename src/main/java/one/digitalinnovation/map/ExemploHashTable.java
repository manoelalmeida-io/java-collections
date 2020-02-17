package one.digitalinnovation.map;

import java.util.Hashtable;

public class ExemploHashTable {

  public static void main(String[] args) {
    
    var estudantes = new Hashtable<String, Integer>();

    estudantes.put("Carlos", 21); //El Topo que gira
    estudantes.put("Mariana", 33);
    estudantes.put("Rafaela", 18);
    estudantes.put("Pedro", 44);

    System.out.println(estudantes);

    estudantes.put("Pedro", 55);

    System.out.println(estudantes);

    estudantes.remove("Pedro");

    System.out.println(estudantes);

    var idadeEstudante = estudantes.get("Mariana");
    System.out.println(idadeEstudante);

    System.out.println(estudantes.size());

    for (var entry : estudantes.entrySet()) {
      System.out.println(entry.getKey() + " -- " + entry.getValue());
    }

    for (var key : estudantes.keySet()) {
      System.out.println(key + " --- " + estudantes.get(key));
    }
  }
}