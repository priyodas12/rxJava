package tech.java.flux;

import java.util.List;
import java.util.stream.IntStream;

import reactor.core.publisher.Flux;

public class FluxWithMap {

  public static void main (String[] args) {
    //new FluxWithMap ().getPrimeNumberFlux ().subscribe (System.out::println).dispose ();

    new FluxWithMap ().getNameFlux ().subscribe (System.out::println).dispose ();
  }

  public Flux<String> getNameFlux () {
    return Flux.fromIterable (List.of ("abcd", "ba", "dcb", "uiw")).map (String::toUpperCase).log ()
        .filter (name -> name.length () == 3)
        .log ();
  }

  public Flux<Integer> getPrimeNumberFlux () {
    return Flux.range (102, 200).name ("Prime_Number_Publisher")
        .filter (this::isPrime).log ();
  }

  public boolean isPrime (int n) {
    return IntStream.rangeClosed (2, n / 2).noneMatch (i -> n % i == 0);
  }
}
