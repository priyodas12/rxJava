package tech.java.flux;

import java.time.Duration;
import java.util.List;

import reactor.core.publisher.Flux;

public class FluxWithConcatMap {

  public static void main (String[] args) {
    new FluxWithFlatMap ().getNameFlux ().subscribe (System.out::println).dispose ();
  }

  public Flux<String> getRandomStringFlux () {
    return Flux.fromIterable (List.of ("abc", "bca", "cab"))
        .concatMap (this::splitStringWithDelay)
        .log ();
  }

  private Flux<String> splitStringWithDelay (String name) {
    var charArray = name.split ("");
    return Flux.fromArray (charArray)
        .delayElements (Duration.ofMillis (1000));
  }
}
