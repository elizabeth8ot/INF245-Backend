package pe.edu.pucp.dovah.asignaciones.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion;
    private int nota;
    private LocalDateTime fechaCreacion;

    protected Tarea() {}

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.nota = 0;
        this.fechaCreacion = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("Tarea(descripcion='%s' nota='%d')", this.getDescripcion(), this.getNota());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}