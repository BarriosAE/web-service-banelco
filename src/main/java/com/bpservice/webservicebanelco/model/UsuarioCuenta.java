package com.bpservice.webservicebanelco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity // This tells Hibernate to make a table out of this class
public class UsuarioCuenta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idCuenta;
    private Integer idUsuario;
    private Integer idBanco;
    private Integer CBU;
    private Float saldo;
    private Date fechaAlta;
    private String codigoComercio;

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getCBU() {
        return CBU;
    }

    public void setCBU(Integer CBU) {
        this.CBU = CBU;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCodigoComercio() {
        return codigoComercio;
    }

    public void setCodigoComercio(String codigoComercio) {
        this.codigoComercio = codigoComercio;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
}
