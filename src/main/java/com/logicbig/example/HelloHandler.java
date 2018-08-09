package com.logicbig.example;

import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class HelloHandler {
    public  Mono<ServerResponse> handleRequest(ServerRequest serverRequest) {
        return ServerResponse.ok().body(Mono.just("Hello World!"), String.class);
    }
}