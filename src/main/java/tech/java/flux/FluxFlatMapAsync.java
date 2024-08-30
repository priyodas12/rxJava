package tech.java.flux;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import reactor.core.publisher.Flux;

public class FluxFlatMapAsync {

  public static void main (String[] args) {

    /** Ordering will not be maintained here*/
    new FluxFlatMapAsync ().getNameFluxAsync ().subscribe (System.out::println).dispose ();
  }

  public Flux<String> getNameFluxAsync () {
    return Flux.fromIterable (List.of ("robin", "xavier", "docker", "muller"))
        .map (String::toUpperCase)
        .flatMap (this::splitString)
        .log ();
  }

  private Flux<String> splitString (String name) {
    var charArray = name.split ("");
    return Flux.fromArray (charArray)
        .delayElements (Duration.ofMillis (new Random ().nextInt (100, 1000)));
  }
}
