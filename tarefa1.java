package br.org.generation.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefa1")
public class tarefa1 {

	@GetMapping
	public String tarefa1 () {
		return "Persistencia";
	}
}
