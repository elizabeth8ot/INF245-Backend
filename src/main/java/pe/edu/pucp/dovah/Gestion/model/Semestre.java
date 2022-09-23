/*
 * Nombre del archivo: Semestre.java
 * Fecha de creacion: 20-09-2022
 * Autor: Victor Avalos
 * Descripción: Definición de la clase Semestre
 */
package pe.edu.pucp.dovah.Gestion.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Semestre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /* Año academico y Periodo falta */
    private int idSemestre;
    private String codigo;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaCierreNotasParcial;
    private Date fechaCierreNotasFinal;
    private boolean activo;

    @OneToMany(mappedBy = "semestre")
    private List<Curso> cursos;

    protected Semestre() {}

    public Semestre(String codigo, Date fechaInicio,Date fechaFin,Date fechaCierreNotasParcial,
                    Date fechaCierreNotasFinal){
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaCierreNotasParcial = fechaCierreNotasParcial;
        this.activo = true;
    }

    @Override
    public String toString() {
        return String.format("Semestre(codigo='%s')", this.getCodigo());
    }

    public int getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaCierreNotasParcial() {
        return fechaCierreNotasParcial;
    }

    public void setFechaCierreNotasParcial(Date fechaCierreNotasParcial) {
        this.fechaCierreNotasParcial = fechaCierreNotasParcial;
    }

    public Date getFechaCierreNotasFinal() {
        return fechaCierreNotasFinal;
    }

    public void setFechaCierreNotasFinal(Date fechaCierreNotasFinal) {
        this.fechaCierreNotasFinal = fechaCierreNotasFinal;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
