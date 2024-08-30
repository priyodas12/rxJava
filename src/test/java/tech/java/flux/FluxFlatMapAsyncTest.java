package tech.java.flux;

import org.junit.jupiter.api.Test;

import reactor.test.StepVerifier;

public class FluxFlatMapAsyncTest {

  FluxFlatMapAsync fluxFlatMapAsync = new FluxFlatMapAsync ();

  @Test
  void getNameFluxAsyncTest () {
    //given

    //when
    var names = fluxFlatMapAsync.getNameFluxAsync ();
    //then
    StepVerifier.create (names).expectNextCount (23).verifyComplete ();
  }
}