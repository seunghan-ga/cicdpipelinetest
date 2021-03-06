package com.test.app;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {
    @RequestMapping("/hello")
    String home() {
        return "Hello World! test_app! 9999";
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
