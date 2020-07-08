package com.bpservice.webservicebanelco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity // This tells Hibernate to make a table out of this class
public class MovimientoTipo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idTipo;

    private String nombreMovimiento;

    private Date fechaAlta;

    public Integer getIdTipo() {
        return idTipo;
    }

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}


