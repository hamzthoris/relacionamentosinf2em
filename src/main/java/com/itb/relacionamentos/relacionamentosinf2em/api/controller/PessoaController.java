package com.itb.relacionamentos.relacionamentosinf2em.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.relacionamentos.relacionamentosinf2em.model.entity.Pessoa;

// @Controller -> Exclusivo sistema web
// @RestController -> Desenvolvimento de API

@RestController
@RequestMapping("/relacionamentos/api/v1")
public class PessoaController {

	@GetMapping("/pessoas")
	public Pessoa getAll() {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Fernanda Moraes");
		p1.setEmail("fernanda@gmail.com");
		
		Pessoa p2 = new Pessoa("Henrique Santos", "henrique@gmail.com");
		
	    pessoas.add(p1);
		
		return p1;
	}
}
