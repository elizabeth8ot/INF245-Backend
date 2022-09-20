package pe.edu.pucp.dovah;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.edu.pucp.dovah.RRHH.repository.UsuarioRepository;

@SpringBootApplication
public class Inf245BackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(Inf245BackendApplication.class, args);
    }
}
