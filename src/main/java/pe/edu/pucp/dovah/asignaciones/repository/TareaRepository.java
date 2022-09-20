package pe.edu.pucp.dovah.asignaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pucp.dovah.asignaciones.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
