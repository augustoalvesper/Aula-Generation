package br.org.generation.blogpessoal.model;

	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

	@Entity
	@Table(name = "tb_usuarios")
	public class Usuario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo é obrigatório")
		@Size(min = 2, max = 50)
		private String nome;
		
		@NotNull(message = "O atributo é obrigatório")
		@Email
		private String usuario;
		
		@NotBlank(message = "O atributo é obrigatório")
		@Size(min = 8)
		private String senha;
		
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

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getBiografia() {
			return biografia;
		}

		public void setBiografia(String biografia) {
			this.biografia = biografia;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		@Size(max = 500)
		private String biografia;
		
		private String foto;
		

}