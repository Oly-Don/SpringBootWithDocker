package com.south.oly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class Application {
    Logger logger= Logger.getLogger(Application.class.getName());

    /**
     * mvn clean package docker:build
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World."
                + "<br />Welcome to <a href='https://hub.docker.com/'>https://hub.docker.com/</a></li>";
    }

}
