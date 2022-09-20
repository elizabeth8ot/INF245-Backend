package pe.edu.pucp.dovah;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.pucp.dovah.RRHH.repository.UsuarioRepository;
import pe.edu.pucp.dovah.asignaciones.model.Tarea;
import pe.edu.pucp.dovah.asignaciones.repository.TareaRepository;

@Configuration
public class LoadDatabase {
    private final static Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner loadUsuarios(UsuarioRepository repository) {
        return (args) -> {
            if (repository.findAll().isEmpty()) {
                // guardar usuarios
            /*
            repository.save(new Usuario("Carlos", "Toro", "toro.carlos@pucp.edu.pe"));
            repository.save(new Usuario("Llyod", "", "a20000000@pucp.edu.pe"));
            repository.save(new Usuario("Victor", "", "a2000000@pucp.edu.pe"));*/
            }
        };
    }

    @Bean
    public CommandLineRunner loadTareas(TareaRepository repository) {
        return (args) -> {
            if (repository.findAll().isEmpty()) {
                log.info("Preloading " + repository.save(new Tarea("descripcion1")));
                log.info("Preloading " + repository.save(new Tarea("descripcion2")));
                log.info("Preloading " + repository.save(new Tarea("descripcion3")));
                log.info("Preloading " + repository.save(new Tarea("descripcion4")));
                log.info("Preloading " + repository.save(new Tarea("descripcion5")));
            }
        };
    }
}
