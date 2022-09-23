/*
 * Nombre del archivo: EspecialidadRepository.java
 * Fecha de creacion: 20-09-2022
 * Autor: Victor Avalos
 * Descripción: Interfaz de repositorio para la clase Especialidad
 */
package pe.edu.pucp.dovah.Gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pucp.dovah.Gestion.model.Especialidad;

public interface EspecialidadRepository extends JpaRepository<Especialidad,Integer> {
}
