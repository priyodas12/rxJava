package tech.java.flux;

import org.junit.jupiter.api.Test;

import reactor.test.StepVerifier;

public class FluxGeneration01Test {

  FluxGeneration01 fluxGeneration01 = new FluxGeneration01 ();

  @Test
  void getNumbersTest () {
    //given
    //when (fluxGeneration01.getNumbers ()).thenReturn (Flux.fromIterable (List.of (1, 2, 4, 5)));
    //when
    var numbers = fluxGeneration01.getNumbers ();
    //then
    StepVerifier.create (numbers).expectNext (1, 2, 4, 5).verifyComplete ();
  }
}