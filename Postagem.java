package br.org.generation.blogpessoal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity // create table
@Table(name = "tb_postagens") // informando nome da tb 
public class Postagem {

	
	@Id // Equivalente a informar que este atributo vai ser a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Equivalente ao autoincrement
	private Long id;
	
	
	@NotBlank(message = "O atributo titulo é Obrigatório") // Dizendo que atrib titulo nao pode ser nulo e nem espaço branco
	@Size(min = 5, max = 100, message = "O atributo titulo deve ter no mínimo 5 e no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "O atributo titulo é Obrigatório") 
	@Size(min = 10, max = 1000, message = "O atributo texto deve ter no mínimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDate data;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
}
