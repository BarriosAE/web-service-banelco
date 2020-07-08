package com.bpservice.webservicebanelco.repository;
import org.springframework.stereotype.Component;

@Component
public class EchoRepository {

    public String findMensaje(String name) {
        return name;
    }

}

