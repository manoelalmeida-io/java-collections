package one.digitalinnovation.list;

import java.util.Vector;

public class ExemploVector {

  public static void main(String[] args) {
    
    var esportes = new Vector<String>();

    // adiciona 4 esportes no vetor
    esportes.add("Futebol");
    esportes.add("Basquetebol");
    esportes.add("Tênis de mesa");
    esportes.add("Handebol");

    // altera o valor da posição 2 do vetor
    esportes.set(2, "Ping Pong");

    // remove o esporte da posição 2
    esportes.remove(2);

    // remove o esporte handball do vetor
    esportes.remove("Handball");

    // retorna o primeiro item do vetor
    System.out.println(esportes.get(0));

    // navega no esportes
    for (var esporte : esportes) {
      System.out.println(esporte);
    }
  }
}