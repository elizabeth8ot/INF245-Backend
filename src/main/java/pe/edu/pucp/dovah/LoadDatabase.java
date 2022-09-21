package pe.edu.pucp.dovah;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.pucp.dovah.RRHH.model.Administrador;
import pe.edu.pucp.dovah.RRHH.repository.AdministradorRepository;
import pe.edu.pucp.dovah.asignaciones.model.Tarea;
import pe.edu.pucp.dovah.asignaciones.repository.TareaRepository;

@Configuration
public class LoadDatabase {
    private final static Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner loadAdministrador(AdministradorRepository repository){
        return (args) -> {
            if(repository.findAll().isEmpty()){
                log.info("Creando administrador"+repository.save(new Administrador("Juan","Veliz",
                        'M',"20193345","jveliz@gmail.com")));
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
