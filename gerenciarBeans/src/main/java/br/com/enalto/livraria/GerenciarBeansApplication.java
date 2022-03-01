package br.com.enalto.livraria;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class GerenciarBeansApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GerenciarBeansApplication.class, args);
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		
		livro.setNome("Arquitetura de computadores");
		livro.setCodigo("00001");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Autor1");
		
		livro.setAutor(autor);
		
		System.out.println(livro);
		
		((AbstractApplicationContext) factory).close();
	}

}
