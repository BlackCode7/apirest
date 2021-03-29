package com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.model.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
public class ProdutoResource {
	@Autowired
	ProdutoRepository produtoRepository;
	
	
	// Aqui listamos todos os objetos salvos no banco
	@GetMapping("/produtos")
	@ApiOperation(value="Retorna uma lista de produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	
	// Aqui listamos os objetos salvos no banco através do id
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um produto único")
	public Produto listaProdutoUnico(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}

	// Método de envio @PostMapping()
	@PostMapping("/produto")
	@ApiOperation(value="Salva os produtos da Api")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	// Método de delete @DeleteMapping()
	// a notação @RequestBody é para retorno de objeto json
	@DeleteMapping("/produto/{id}")
	@ApiOperation(value="Deleta um produto")
	public void deletaProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	// Método Put para atualizar um produto
	@PutMapping("/produto")
	@ApiOperation(value="Atualiza um produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		System.out.println("Produto atualizado com sucesso!");
		return produtoRepository.save(produto);
	}
		
}














