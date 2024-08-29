package tech.java.flux;

import java.util.List;

import reactor.core.publisher.Flux;

public class FluxGeneration01 {

  List<Integer> nums = List.of (1, 2, 4, 5);

  public static void main (String[] args) {
    new FluxGeneration01 ().getNumbers ()
        .subscribe (name -> System.out.println ("Received Number:: " + name.longValue ()));
  }

  public Flux<Integer> getNumbers () {
    return Flux.fromIterable (nums).log ();
  }

}
