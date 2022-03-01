package br.com.enalto.livraria;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {
	
	private String nome;
	private String codigo;
	
	@Autowired
	private Autor autor;
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", codigo=" + codigo + ", autor=" + autor + "]";
	}
	
	
	
	

}
