package org.example.MODELOS;

import java.time.LocalDate;

public class Apartamento {
    private Long id;
    private Arrendatario arrendatario;  // se pone una clase dentro de otra clase, es llave foranea, y se declara con el nombre de la clase
    private Propietario propietario;
    private Integer costoArriendo;
    private LocalDate fechaVencimiento;

    public Apartamento() {
    }

    public Apartamento(Long id, Arrendatario arrendatario, Propietario propietario, Integer costoArriendo, LocalDate fechaVencimiento) {
        this.id = id;
        this.arrendatario = arrendatario;
        this.propietario = propietario;
        this.costoArriendo = costoArriendo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Arrendatario getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario() {
        this.arrendatario = arrendatario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Integer getCostoArriendo() {
        return costoArriendo;
    }

    public void setCostoArriendo(Integer costoArriendo) {
        this.costoArriendo = costoArriendo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setArrendatario(String s) {
    }
}
