package pe.edu.pucp.dovah.asignaciones.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.pucp.dovah.asignaciones.exception.TareaNotFoundException;
import pe.edu.pucp.dovah.asignaciones.model.Tarea;
import pe.edu.pucp.dovah.asignaciones.repository.TareaRepository;

import java.util.List;

@RestController
public class TareaController {
    private final TareaRepository repository;

    public TareaController(TareaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tareas")
    List<Tarea> all() {
        return repository.findAll();
    }

    @PostMapping("/tareas")
    Tarea newTarea(@RequestBody Tarea newTarea) {
        return repository.save(newTarea);
    }

    @GetMapping("/tareas/{id}")
    Tarea one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new TareaNotFoundException(id));
    }

    @DeleteMapping("/tareas/{id}")
    void eliminarTarea(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
