/*
 * Nombre del archivo: SemestreRepository.java
 * Fecha de creacion: 20-09-2022
 * Autor: Victor Avalos
 * Descripción: Interfaz de repositorio para la clase Semestre
 */
package pe.edu.pucp.dovah.Gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pucp.dovah.Gestion.model.Semestre;

public interface SemestreRepository extends JpaRepository<Semestre,Integer>{
}
