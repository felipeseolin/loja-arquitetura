package com.loja.loja.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoDAO extends JpaRepository<Produto, Long> { }
