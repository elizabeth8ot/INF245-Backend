package pe.edu.pucp.dovah.RRHH.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pucp.dovah.RRHH.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
