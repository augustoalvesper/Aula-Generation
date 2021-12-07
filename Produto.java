package br.org.generation.lojadegames.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O atributo nome é Obrigatório")
	@Size(min = 3, max = 100, message = "O atributo nome deve ter no mínimo 3 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo descricao é Obrigatório")
	@Size(min = 3, max = 100, message = "O atributo descricao deve ter no mínimo 3 e no máximo 100 caracteres")
	private String descricao;
	
	@NotBlank(message = "O atributo console é Obrigatório")
	@Size(min = 3, max = 100, message = "O atributo console deve ter no mínimo 3 e no máximo 100 caracteres")
	private String console;

	
	
}
