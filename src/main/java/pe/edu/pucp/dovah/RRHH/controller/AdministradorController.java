package pe.edu.pucp.dovah.RRHH.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.*;
import pe.edu.pucp.dovah.RRHH.exceptions.UsuarioNotFoundException;
import pe.edu.pucp.dovah.RRHH.model.Administrador;
import pe.edu.pucp.dovah.RRHH.model.Profesor;
import pe.edu.pucp.dovah.RRHH.repository.AdministradorRepository;
import pe.edu.pucp.dovah.asignaciones.controller.TareaController;

import java.util.List;
import java.util.Map;

/*
 * Nombre del archivo: AdmnistradorController
 * Fecha de creación: 20/09/2022 , 18:00
 * Autor: Lloyd Castillo Ramos
 * Descripción: Clase que maneja el controlador de la clase administrador
 */
@BasePathAwareController
@RestController
public class AdministradorController {
    private final AdministradorRepository repository;
    private final static Logger log = LoggerFactory.getLogger(AdministradorController.class);

    public AdministradorController(AdministradorRepository repository) {

        this.repository = repository;

    }
     /*

        Listar todos los administradores

    */
    @GetMapping("/administrador")
    List<Administrador> all(){

        return repository.findAll();

    }

     /*

        Listar un administrador en especifico

    */
    @GetMapping("/administrador/{id}")
    Administrador obtenerAdministradorPorId(@PathVariable int id){

        return repository.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));

    }

     /*

        Eliminar un administrador

    */
    @DeleteMapping("/administrador/{id}")
    void eliminarAdministrador(@PathVariable int id){

        repository.deleteById(id);

    }

     /*

       Agregar un administrador

    */
    @PostMapping("/administrador")
    Administrador nuevoAdministrador(@RequestBody Map<String,Object> nuevoAdministrador){

        log.info("Agregando administrador");
        var json = new JSONObject(nuevoAdministrador);
        var administrador = new Administrador(json.getString("nombre"),json.getString("apellido"),
                                              json.getString("genero").charAt(0), json.getString("codigoPUCP"),
                                              json.getString("correo"));


        return repository.save(administrador);

    }

}
