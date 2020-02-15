package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio {

  public static void main(String[] args) {
    
    var nomes = new ArrayList<String>();

    nomes.add("Juliana");
    nomes.add("Pedro");
    nomes.add("Carlos");
    nomes.add("Larissa");
    nomes.add("João");

    for (var nome : nomes) {
      System.out.println("--->" + nome);
    }

    System.out.println(nomes);

    nomes.set(nomes.indexOf("Carlos"), "Roberto");
    System.out.println(nomes);

    var segundo = nomes.get(1);
    System.out.println("segundo: " + segundo);

    var quinto = nomes.get(4);
    System.out.println("quinto: " + quinto);

    nomes.remove("João");
    System.out.println(nomes);

    var quantidade = nomes.size();
    System.out.println("quantidade: " + quantidade);

    var temJuliano = nomes.contains("Juliano");
    System.out.println("tem Juliano? " + temJuliano);

    var novosNomes = new ArrayList<String>();

    novosNomes.add("Ismael");
    novosNomes.add("Rodrigo");

    nomes.addAll(novosNomes);
    System.out.println(nomes);

    Collections.sort(nomes);
    System.out.println(nomes);

    var vazia = nomes.isEmpty();
    System.out.println("vazia? " + vazia);
  }
}