package tech.java.flux;

import org.junit.jupiter.api.Test;

import reactor.test.StepVerifier;

public class FluxWithConcatMapTest {

  FluxWithConcatMap fluxWithConcatMap = new FluxWithConcatMap ();

  @Test
  public void getRandomStringFluxTest () {

    var names = fluxWithConcatMap.getRandomStringFlux ();
    //then
    StepVerifier.create (names).expectNext ("a", "b", "c", "b", "c", "a", "c", "a", "b")
        .verifyComplete ();
  }
}