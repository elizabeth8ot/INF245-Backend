package pe.edu.pucp.dovah.RRHH.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
/*
 * Nombre del archivo: Administrador
 * Fecha de creación: 20/09/2022 , 18:00
 * Autor: Lloyd Castillo Ramos
 * Descripción: Clase admnistrador
 */
@Entity
@PrimaryKeyJoinColumn(name = "idAdmnistrador")
public class Administrador extends Usuario{

    //@GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDateTime lastLogin;
    private boolean activo;

    protected Administrador() {};


    public Administrador(String nombre, String apellido, char genero, String codigoPUCP, String correo) {

        super(nombre, apellido, genero, codigoPUCP, correo);
        this.lastLogin = LocalDateTime.now();
        this.activo = true;

    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
