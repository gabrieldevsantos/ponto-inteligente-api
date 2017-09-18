package com.kazales.pontointeligente.api.repository;

import com.kazales.pontointeligente.api.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by gabrielsantos on 17/09/17.
 */
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {



}
