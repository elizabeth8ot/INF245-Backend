package pe.edu.pucp.dovah.RRHH.exceptions;

public class UsuarioNotFoundException extends RuntimeException {
    public UsuarioNotFoundException(int id){
        super("No se pudo encontrar al usuario con id " + id);
    }
}
