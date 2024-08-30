package tech.java.flux;

import java.util.List;

import reactor.core.publisher.Flux;

public class FluxWithFlatMap {

  public static void main (String[] args) {
    new FluxWithFlatMap ().getNameFlux ().subscribe (System.out::println).dispose ();
  }

  public Flux<String> getNameFlux () {
    return Flux.fromIterable (List.of ("robin", "xavier", "docker", "muller"))
        .map (String::toUpperCase)
        .flatMap (name -> Flux.fromArray (name.split ("")))
        .log ();
  }

  private Flux<String> splitString (String name) {
    var charArray = name.split ("");
    return Flux.fromArray (charArray);
  }
}
