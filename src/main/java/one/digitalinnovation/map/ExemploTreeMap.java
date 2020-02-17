package one.digitalinnovation.map;

import java.util.TreeMap;

public class ExemploTreeMap {

  public static void main(String[] args) {
    
    var treeCapitals = new TreeMap<String, String>();

    treeCapitals.put("RS", "Porto Alegre");
    treeCapitals.put("SC", "Florianópolis");
    treeCapitals.put("PR", "Curitiba");
    treeCapitals.put("SP", "São Paulo");
    treeCapitals.put("RJ", "Rio de Janeiro");
    treeCapitals.put("MG", "Belo Horizonte");

    System.out.println(treeCapitals);

    System.out.println(treeCapitals.firstKey());
    System.out.println(treeCapitals.lastKey());

    System.out.println(treeCapitals.lowerKey("SC"));
    System.out.println(treeCapitals.higherKey("SC"));

    System.out.println(treeCapitals);

    System.out.println(treeCapitals.firstEntry().getKey() + " - " + treeCapitals.firstEntry().getValue());
    System.out.println(treeCapitals.lastEntry().getKey() + " - " + treeCapitals.lastEntry().getValue());

    System.out.println(treeCapitals.lowerEntry("SC").getKey() + " - " + treeCapitals.lowerEntry("SC").getValue());
    System.out.println(treeCapitals.higherEntry("SC").getKey() + " - " + treeCapitals.higherEntry("SC").getValue());

    System.out.println(treeCapitals);

    var firstEntry = treeCapitals.pollFirstEntry();
    var lastEntry = treeCapitals.pollLastEntry();

    System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
    System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

    System.out.println(treeCapitals);

    var iterator = treeCapitals.keySet().iterator();

    while (iterator.hasNext()) {
      var key = iterator.next();
      System.out.println(key + " - " + treeCapitals.get(key));
    }

    for (var capital : treeCapitals.keySet()) {
      System.out.println(capital + " -- " + treeCapitals.get(capital));
    }

    for (var capital : treeCapitals.entrySet()) {
      System.out.println(capital.getKey() + " --- " + capital.getValue());
    }
  }
}