package com.bpservice.webservicebanelco.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Banco {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idBanco;

    private String bancoNombre;

    private String bancoCodigo;

    public Integer getIdBanco() {
        return idBanco;
    }

    public String getBancoNombre() {
        return bancoNombre;
    }

    public void setBancoNombre(String bancoNombre) {
        this.bancoNombre = bancoNombre;
    }

    public String getBancoCodigo() {
        return bancoCodigo;
    }

    public void setBancoCodigo(String bancoCodigo) {
        this.bancoCodigo = bancoCodigo;
    }
}