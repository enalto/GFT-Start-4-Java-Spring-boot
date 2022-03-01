package br.com.enalto.livraria;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Livro getLivro() {
		return new Livro();
	}
	
	@Bean
	public Autor getAutor() {
		return new Autor();
	}
}
