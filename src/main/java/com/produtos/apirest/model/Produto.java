package com.produtos.apirest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Parei aqui https://www.youtube.com/watch?v=e0ItyfvbhMw&list=PL8iIphQOyG-D2FP9wkg12AavzmVRWEcnJ&index=3
// minuto 9:46

@Entity
@Table(name="TB_PRODUTOS")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private BigDecimal quantidade;
	private BigDecimal valor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}		
	
}
