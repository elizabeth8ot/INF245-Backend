package pe.edu.pucp.dovah.RRHH.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pucp.dovah.RRHH.model.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer>{
}
