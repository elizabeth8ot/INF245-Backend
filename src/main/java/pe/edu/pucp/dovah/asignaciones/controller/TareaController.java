package pe.edu.pucp.dovah.asignaciones.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.*;
import pe.edu.pucp.dovah.LoadDatabase;
import pe.edu.pucp.dovah.asignaciones.exception.TareaNotFoundException;
import pe.edu.pucp.dovah.asignaciones.model.Tarea;
import pe.edu.pucp.dovah.asignaciones.repository.TareaRepository;

import java.util.List;
import java.util.Map;

@BasePathAwareController
@RestController
public class TareaController {
    private final TareaRepository repository;
    private final static Logger log = LoggerFactory.getLogger(TareaController.class);

    public TareaController(TareaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tareas")
    List<Tarea> all() {
        return repository.findAll();
    }

    @PostMapping("/tareas")
    Tarea newTarea(@RequestBody Map<String, Object> newTarea) {
        log.info("Agregando tarea...");
        var json = new JSONObject(newTarea);
        var tarea = new Tarea(json.getString("descripcion"));
        return repository.save(tarea);
    }

    @GetMapping("/tareas/{id}")
    Tarea one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new TareaNotFoundException(id));
    }
}
