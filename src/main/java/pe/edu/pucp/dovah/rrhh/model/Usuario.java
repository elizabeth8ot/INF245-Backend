package pe.edu.pucp.dovah.RRHH.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    private String nombre;
    private String apellido;
    private char genero;
    private String codigoPUCP;
    private String correo;
    private Date fechaCreacion;
    private Date fechaActivacion;
    private boolean activo;

    protected Usuario() {}

    public Usuario(int idUsuario, String nombre,
                   String apellido, char genero, String codigoPUCP,
                   String correo, Date fechaCreacion, Date fechaActivacion, boolean activo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.codigoPUCP = codigoPUCP;
        this.correo = correo;
        this.fechaCreacion = fechaCreacion;
        this.fechaActivacion = fechaActivacion;
        this.activo = activo;
    }

    @Override
    public String toString() {
        return String.format("Usuario[id=%d,nombre='%s',apellido='%s',codigo='%s'",
                             idUsuario, nombre, apellido,codigoPUCP);
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCodigoPUCP() {
        return codigoPUCP;
    }

    public void setCodigoPUCP(String codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
