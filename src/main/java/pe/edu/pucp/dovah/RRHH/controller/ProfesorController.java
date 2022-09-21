package pe.edu.pucp.dovah.RRHH.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.*;
import pe.edu.pucp.dovah.RRHH.exceptions.UsuarioNotFoundException;
import pe.edu.pucp.dovah.RRHH.model.Administrador;
import pe.edu.pucp.dovah.RRHH.model.Profesor;
import pe.edu.pucp.dovah.RRHH.repository.AdministradorRepository;
import pe.edu.pucp.dovah.RRHH.repository.ProfesorRepository;

import java.util.List;

@BasePathAwareController
@RestController
public class ProfesorController {
    private final ProfesorRepository repository;
    private final static Logger log = LoggerFactory.getLogger(ProfesorController.class);

    public ProfesorController(ProfesorRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/profesor")
    List<Profesor> all(){
        return repository.findAll();
    }

    @GetMapping("/profesor/{id}")
    Profesor obtenerProfesorPorId(@PathVariable int id){
        return repository.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
    }

    @DeleteMapping("/profesor/{id}")
    void eliminarProfesor(@PathVariable int id){
        repository.deleteById(id);
    }

    @PostMapping("/profesor")
    Profesor nuevoProfesor(@RequestBody Profesor nuevoProfesor){
        return repository.save(nuevoProfesor);
    }
}
