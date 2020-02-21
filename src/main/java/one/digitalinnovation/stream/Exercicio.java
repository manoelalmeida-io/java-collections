package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Exercicio {

  public static void main(String[] args) {
    
    var estudantes = new ArrayList<Estudante>();

    estudantes.add(new Estudante("Carlos", 24));
    estudantes.add(new Estudante("Cesar", 19));
    estudantes.add(new Estudante("Ricardo", 22));
    estudantes.add(new Estudante("João", 18));
    estudantes.add(new Estudante("Michael", 17));
    estudantes.add(new Estudante("Vanderley", 34));
    estudantes.add(new Estudante("Bianca", 19));
    estudantes.add(new Estudante("Robson", 16));

    var estudantesString = estudantes.stream()
      .map(estudante -> estudante.getNome() + " - " + estudante.getIdade())
      .collect(Collectors.toList());
    
    System.out.println(estudantesString);

    var quantidade = estudantes.stream().count();
    System.out.println("Quantidade: " + quantidade);

    var estudantesMaior18 = estudantes.stream()
      .filter(estudante -> estudante.getIdade() >= 18)
      .collect(Collectors.toList());

    System.out.println(estudantesMaior18);

    estudantes.forEach(System.out::println);

    var estudantesLetraB = estudantes.stream()
      .filter(estudante -> estudante.getNome().contains("B"))
      .collect(Collectors.toList());

    System.out.println("Estudantes com 'B': " + estudantesLetraB);

    var temEstudanteLetraD = estudantes.stream()
      .anyMatch(estudante -> estudante.getNome().contains("D"));

    System.out.println("Tem estudante com 'D': " + temEstudanteLetraD);

    var maisVelho = estudantes.stream()
      .max(Comparator.comparingInt(Estudante::getIdade));

    var maisNovo = estudantes.stream()
      .min(Comparator.comparingInt(Estudante::getIdade));

    System.out.println("Mais velho: " + maisVelho);
    System.out.println("Mais novo: " + maisNovo);
  }
}