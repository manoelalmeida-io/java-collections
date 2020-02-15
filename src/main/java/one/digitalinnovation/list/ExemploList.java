package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploList {

  public static void main(String[] args) {
    
    var nomes = new ArrayList<String>();

    nomes.add("Carlos");
    nomes.add("Pedro");
    nomes.add("Juliana");
    nomes.add("Anderson");
    nomes.add("Maria");
    nomes.add("João");

    System.out.println(nomes);

    nomes.set(2, "Larissa");
    System.out.println(nomes);

    Collections.sort(nomes);

    nomes.set(2, "Wesley");
    System.out.println(nomes);

    nomes.remove(4);
    System.out.println(nomes);

    nomes.remove("Wesley");
    System.out.println(nomes);

    var nome = nomes.get(3);
    System.out.println(nome);

    var posicao = nomes.indexOf("Carlos"); // retorna -1 caso não encontre
    System.out.println(posicao);

    var tamanho = nomes.size();
    System.out.println(tamanho);

    nomes.remove("Larissa");
    tamanho = nomes.size();
    System.out.println(tamanho);

    var temAnderson = nomes.contains("Anderson");
    System.out.println(temAnderson);

    var temFernando = nomes.contains("Fernando");
    System.out.println(temFernando);

    var listaEstaVazia = nomes.isEmpty();
    System.out.println(listaEstaVazia);

    for (var nomeItem : nomes) {
      System.out.println("-->" + nomeItem);
    }

    var iterator = nomes.iterator();

    while (iterator.hasNext()) {
      System.out.println("---->" + iterator.next());
    }

    nomes.clear();
    listaEstaVazia = nomes.isEmpty();
    System.out.println(listaEstaVazia);
  }
}