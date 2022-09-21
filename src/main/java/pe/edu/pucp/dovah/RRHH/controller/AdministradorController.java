package pe.edu.pucp.dovah.RRHH.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.*;
import pe.edu.pucp.dovah.RRHH.exceptions.UsuarioNotFoundException;
import pe.edu.pucp.dovah.RRHH.model.Administrador;
import pe.edu.pucp.dovah.RRHH.repository.AdministradorRepository;
import pe.edu.pucp.dovah.asignaciones.controller.TareaController;

import java.util.List;

@BasePathAwareController
@RestController
public class AdministradorController {
    private final AdministradorRepository repository;
    private final static Logger log = LoggerFactory.getLogger(AdministradorController.class);

    public AdministradorController(AdministradorRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/administrador")
    List<Administrador> all(){
        return repository.findAll();
    }

    @GetMapping("/administrador/{id}")
    Administrador obtenerAdministradorPorId(@PathVariable int id){
        return repository.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
    }

    @DeleteMapping("/administrador/{id}")
    void eliminarAdministrador(@PathVariable int id){
        repository.deleteById(id);
    }

    @PostMapping("/administrador")
    Administrador nuevoAdministrador(@RequestBody Administrador nuevoAdministrador){
        return repository.save(nuevoAdministrador);
    }
}
