package br.com.caelum.livraria.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testeLivro")
public class TesteRestController {

	private Integer id;
	private String livro = "ABC";

	@RequestMapping("/{id}")
	public String getLivro(@PathVariable("id") Integer id) {
		return "ID: " + id + " LIVRO: " + livro;
	}

}
