package pe.edu.pucp.dovah.asignaciones.exception;

public class TareaNotFoundException extends RuntimeException {
    public TareaNotFoundException(Long id) {
        super("No se pudo encontrar la tarea con id " + id);
    }
}
