package com.david.demo.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InformacionAprendiz {
    private LocalDateTime FechaHoy;
    private String NombreAprendiz;
    private String ApellidoAprendiz;
    private String Fichaprendiz;
    private String CursoAprendiz;
    private String EvidenciaAprendiz;
    private String CiudadAprendiz;

    public InformacionAprendiz(LocalDateTime fechaHoy, String nombreAprendiz, String apellidoAprendiz, String fichaprendiz, String cursoAprendiz, String evidenciaAprendiz, String ciudadAprendiz) {
        FechaHoy = fechaHoy;
        NombreAprendiz = nombreAprendiz;
        ApellidoAprendiz = apellidoAprendiz;                 //Constructor
        Fichaprendiz = fichaprendiz;
        CursoAprendiz = cursoAprendiz;
        EvidenciaAprendiz = evidenciaAprendiz;
        CiudadAprendiz = ciudadAprendiz;
    }

    public InformacionAprendiz() {
    } //Constructor vacío

    public LocalDateTime getFechaHoy() {
        return FechaHoy;
    }

    public String getNombreAprendiz() {
        return NombreAprendiz;                                         //Getters
    }

    public String getApellidoAprendiz() {
        return ApellidoAprendiz;
    }

    public String getFichaprendiz() {
        return Fichaprendiz;
    }

    public String getCursoAprendiz() {
        return CursoAprendiz;
    }

    public String getEvidenciaAprendiz() {
        return EvidenciaAprendiz;
    }

    public String getCiudadAprendiz() {
        return CiudadAprendiz;
    }

    public void setFechaHoy(LocalDateTime fechaHoy) {
        FechaHoy = fechaHoy;
    }

    public void setNombreAprendiz(String nombreAprendiz) {
        NombreAprendiz = nombreAprendiz;
    }

    public void setApellidoAprendiz(String apellidoAprendiz) {
        ApellidoAprendiz = apellidoAprendiz;                               //Setters
    }

    public void setFichaprendiz(String fichaprendiz) {
        Fichaprendiz = fichaprendiz;
    }

    public void setCursoAprendiz(String cursoAprendiz) {
        CursoAprendiz = cursoAprendiz;
    }

    public void setEvidenciaAprendiz(String evidenciaAprendiz) {
        EvidenciaAprendiz = evidenciaAprendiz;
    }

    public void setCiudadAprendiz(String ciudadAprendiz) {
        CiudadAprendiz = ciudadAprendiz;
    }
}
