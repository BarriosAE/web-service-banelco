package com.bpservice.webservicebanelco.repository;
import org.springframework.data.repository.CrudRepository;
import com.bpservice.webservicebanelco.model.Banco;
public interface BancoRepository extends CrudRepository<Banco, Integer>  {
}
