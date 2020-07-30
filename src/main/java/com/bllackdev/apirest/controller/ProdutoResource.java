package com.bllackdev.apirest.controller;


import com.bllackdev.apirest.model.Produto;
import com.bllackdev.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produto") // Lista todos os Produtos
    public List<Produto> listaProduto(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}") // Lista apenas um Produto pelo ID
    public Produto listaProdutoUnico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }
}
