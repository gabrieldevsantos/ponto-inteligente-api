package com.kazales.pontointeligente.api.repository;

import com.kazales.pontointeligente.api.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by gabrielsantos on 17/09/17.
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

//    List<Empresa> findAllByCnpj();

}
