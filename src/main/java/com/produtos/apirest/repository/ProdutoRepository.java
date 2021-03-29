package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.produtos.apirest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	// metodo procura produto atraves do id
	Produto findById(long id);
	
}
