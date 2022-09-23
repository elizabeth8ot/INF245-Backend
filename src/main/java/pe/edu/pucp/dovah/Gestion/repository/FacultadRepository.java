/*
 * Nombre del archivo: FacultadRepository.java
 * Fecha de creacion: 20-09-2022
 * Autor: Victor Avalos
 * Descripción: Interfaz de repositorio para la clase Facultad
 */
package pe.edu.pucp.dovah.Gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pucp.dovah.Gestion.model.Facultad;

public interface FacultadRepository extends JpaRepository<Facultad,Integer>{
}
