package tech.java.flux;

import java.util.List;

import reactor.core.publisher.Flux;
public class FluxGeneration01 {

  public Flux<Number> getNames(){
    return Flux.fromIterable (List.of(99,12,100,92));
  }

  public static void main (String[] args) {
   new FluxGeneration01().getNames ().subscribe (name-> System.out.println (name.longValue ()));
  }

}
