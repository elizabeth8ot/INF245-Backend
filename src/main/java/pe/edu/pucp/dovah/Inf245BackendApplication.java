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
    private static final Logger log = LoggerFactory.getLogger(Inf245BackendApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(Inf245BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UsuarioRepository repository) {
        return (args) -> {
            // guardar usuarios
            /*
            repository.save(new Usuario("Carlos", "Toro", "toro.carlos@pucp.edu.pe"));
            repository.save(new Usuario("Llyod", "", "a20000000@pucp.edu.pe"));
            repository.save(new Usuario("Victor", "", "a2000000@pucp.edu.pe"));*/

            log.info("Usuarios encontrados por findAll():");
            log.info("===================================");
            for (var usuario: repository.findAll()) {
                log.info(usuario.toString());
            }

            log.info("");
        };
    }
}
