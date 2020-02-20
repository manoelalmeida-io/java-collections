package one.digitalinnovation.optionals;

import java.util.Optional;

public class Exercicio {

  public static void main(String[] args) {
    
    Optional<String> optional = Optional.ofNullable("a");

    optional.ifPresent(System.out::println);
    optional.orElseThrow(IllegalStateException::new);
    
    if (optional.isEmpty()) {
      System.out.println("Optional vazio");
    }

    optional.map((valor) -> valor + "b").ifPresent(System.out::println);

    if (optional.isPresent()) {
      var valor = optional.get();
      System.out.println(valor);
    }

    optional.filter((valor) -> valor != "a").orElseThrow(NullPointerException::new);
  }
}