package tech.java.mono;

import reactor.core.publisher.Mono;
import tech.java.flux.FluxGeneration01;

public class MonoGeneration01 {

  public Mono<Number> getNumber(){
    return Mono.justOrEmpty (100);
  }

  public static void main (String[] args) {
    new MonoGeneration01 ().getNumber ().subscribe (name-> System.out.println (name.longValue ()));
  }
}
