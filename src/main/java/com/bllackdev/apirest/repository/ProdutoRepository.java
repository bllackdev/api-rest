package com.bllackdev.apirest.repository;

import com.bllackdev.apirest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id); // Para selecionar UM produto apenas
}
