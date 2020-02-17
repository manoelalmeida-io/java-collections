package one.digitalinnovation.map;

import java.util.HashMap;

public class ExemploHashMap {

  public static void main(String[] args) {
    
    var campeoesMundialFifa = new HashMap<String, Integer>();

    // adiciona os campeões mundiais fifa 
    campeoesMundialFifa.put("Brasil", 5);
    campeoesMundialFifa.put("Alemanha", 4);
    campeoesMundialFifa.put("Itália", 4);
    campeoesMundialFifa.put("Uruguai", 2);
    campeoesMundialFifa.put("Argentina", 2);
    campeoesMundialFifa.put("França", 2);
    campeoesMundialFifa.put("Inglaterra", 1);
    campeoesMundialFifa.put("Espanha", 1);

    System.out.println(campeoesMundialFifa);

    // atualiza o valor para a chave Brasil
    campeoesMundialFifa.put("Brasil", 6);
    System.out.println(campeoesMundialFifa);

    // retorna a Argentina
    System.out.println(campeoesMundialFifa.get("Argentina"));

    // retorna se existe o não um campeão França
    System.out.println(campeoesMundialFifa.containsKey("França"));

    // remove o campeão França
    campeoesMundialFifa.remove("França");

    // retorna se existe o não um campeão França
    System.out.println(campeoesMundialFifa.containsKey("França"));

    // retorna se existe ou não alguma seleção hexa campeã
    System.out.println(campeoesMundialFifa.containsValue(6));

    // retorna o tamanho do mapa
    System.out.println(campeoesMundialFifa.size());

    System.out.println(campeoesMundialFifa);

    for (var entry : campeoesMundialFifa.entrySet()) {
      System.out.println(entry.getKey() + " -- " + entry.getValue());
    }

    System.out.println("=========================");

    for (var key : campeoesMundialFifa.keySet()) {
      System.out.println(key + " -- " + campeoesMundialFifa.get(key));
    }

    // verifica se o mapa contém a chave Estados Unidos
    System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

    // verifica se o mapa contém o valor 5
    System.out.println(campeoesMundialFifa.containsValue(5));

    // verifica o tamanho antes e depois de limpar o mapa
    System.out.println(campeoesMundialFifa.size());

    campeoesMundialFifa.clear();

    System.out.println(campeoesMundialFifa.size());
  }
}