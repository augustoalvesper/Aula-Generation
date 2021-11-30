package br.org.generation.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefa2")
public class tarefa2 {

	@GetMapping
	public String tarefa2 () {
		return "Disciplina";
	}
}
