package com.logicbig.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
@EnableWebFlux
public class ExampleApplication {

    @Bean
    HelloHandler helloHandler() {
        return new HelloHandler();
    }

    @Bean
    RouterFunction<ServerResponse> helloRouterFunction(HelloHandler helloHandler) {
        return RouterFunctions.route(RequestPredicates.path("/"),
                helloHandler::handleRequest);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleApplication.class);
    }
}