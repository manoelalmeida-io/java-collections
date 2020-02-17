package one.digitalinnovation.map;

import java.util.HashMap;

public class Exercicio {

  public static void main(String[] args) {
    
    var estados = new HashMap<String, String>();

    estados.put("AC", "Acre");
    estados.put("AL", "Alagoas");
    estados.put("AP", "Amapá");
    estados.put("AM", "Amazonas");
    estados.put("BA", "Bahia");
    estados.put("CE", "Ceará");
    estados.put("ES", "Espírito Santo");
    estados.put("GO", "Goiás");
    estados.put("MA", "Maranhão");
    estados.put("MT", "Mato Grosso");
    estados.put("MS", "Mato Grosso do Sul");
    estados.put("MG", "Minas Gerais");
    estados.put("PA", "Pará");
    estados.put("PB", "Paraíba");
    estados.put("PR", "Paraná");
    estados.put("PE", "Pernambuco");
    estados.put("PI", "Piauí");
    estados.put("RJ", "Rio de Janeiro");
    estados.put("RN", "Rio Grande do Norte");
    estados.put("RS", "Rio Grande do Sul");
    estados.put("RO", "Rondônia");
    estados.put("RR", "Roraima");
    estados.put("SC", "Santa Catarina");
    estados.put("SP", "São Paulo");
    estados.put("SE", "Sergipe");
    estados.put("TO", "Tocantins");

    System.out.println(estados);

    estados.remove("MG");

    estados.put("DF", "Distrito Federal");

    System.out.println(estados.size());

    var iterator = estados.entrySet().iterator();

    while (iterator.hasNext()) {
      var estado = iterator.next();

      if (estado.getValue() == "Mato Grosso do Sul") {
        iterator.remove();
      }
    }

    System.out.println(estados);

    System.out.println("================================");

    for (var estado : estados.entrySet()) {
      System.out.println(String.format("%s (%s)", estado.getValue(), estado.getKey()));
    }

    System.out.println("================================");

    System.out.println(estados.containsKey("SC"));
    System.out.println(estados.containsValue("Maranhão"));
  }
}