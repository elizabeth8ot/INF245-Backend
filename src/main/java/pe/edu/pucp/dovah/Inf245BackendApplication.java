package pe.edu.pucp.dovah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Inf245BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(Inf245BackendApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
