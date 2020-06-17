package com.bpservice.webservicebanelco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity // This tells Hibernate to make a table out of this class
public class UsuarioMovimiento {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idMovimiento;
    private Integer idCuenta;
    private Integer idTipo;
    private Date fechaMovimiento;
    private Integer idCuentaDestino;
    private  Integer montoMov;

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public Integer getIdCuentaDestino() {
        return idCuentaDestino;
    }

    public void setIdCuentaDestino(Integer idCuentaDestino) {
        this.idCuentaDestino = idCuentaDestino;
    }

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public Integer getMontoMov() {
        return montoMov;
    }

    public void setMontoMov(Float montoMov) {
        this.montoMov = montoMov;
    }
}



