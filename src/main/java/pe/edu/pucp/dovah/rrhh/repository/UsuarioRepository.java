package pe.edu.pucp.dovah.rrhh.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pe.edu.pucp.dovah.rrhh.model.Usuario;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
    List<Usuario> findByCorreo(@Param("correo") String correo);
}
