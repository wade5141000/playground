package com.wade.reactor;

import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Example {

  @Test
  public void manyDataUseFlux() {
    Flux<String> flux = Flux.just("Hello", "World", "My", "Name", "Is", "Wade");
    flux.subscribe(System.out::println);

    System.out.println("---------------------");

    Flux<String> flux2 = Flux.fromIterable(List.of("Hello", "World", "My", "Name", "Is", "Wade"));
    flux2.subscribe(System.out::println);
  }

  @Test
  public void oneDataUseMono() {
    Mono<String> mono = Mono.just("YO~");
    mono.subscribe(System.out::println);

    System.out.println("---------------------");

    Mono<String> mono2 = Mono.empty();
    mono2.subscribe(System.out::println);
  }
}
