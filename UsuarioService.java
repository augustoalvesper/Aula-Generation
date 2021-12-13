package br.org.generation.blogpessoal.service;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.org.generation.blogpessoal.model.Usuario;
import br.org.generation.blogpessoal.model.UsuarioLogin;
import br.org.generation.blogpessoal.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> cadastrarUsuario(Usuario usuario){
		
		if (usuarioRepository.fingByUsuario(usuario.getUsuario()).isPresent())
				return Optional.empty();
		
		usuario.setSenha(criptografarSenha(usuario.getSenha()));
		return Optional.of(usuarioRepository.save(usuario));
	}
	
	public Optional<Usuario> atualizarUsuario(Usuario usuario){
		if (usuarioRepository.fingByUsuario(usuario.getUsuario()).isPresent()) {
			usuario.setSenha(criptografarSenha(usuario.getSenha()));
			return Optional.of(usuarioRepository.save(usuario));
		}
		return Optional.empty();
	}
	public Optional<UsuarioLogin> autenticarUsuario(Optional<UsuarioLogin> usuarioLogin) {

		Optional<Usuario> usuario = usuarioRepository.findByUsuario(usuarioLogin.get().getUsuario());

		if (usuario.isPresent()) {
			if (compararSenhas(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {

				usuarioLogin.get().setId(usuario.get().getId());
				usuarioLogin.get().setNome(usuario.get().getNome());
				usuarioLogin.get().setFoto(usuario.get().getFoto());
				usuarioLogin.get().setToken(gerarBasicToken(usuarioLogin.get().getUsuario(), usuarioLogin.get().getSenha()));
				usuarioLogin.get().setSenha(usuario.get().getSenha());

				return usuarioLogin;
			}
		}
		
		
		return Optional.empty();
	}
	private String criptografarSenha(String senha) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(senha);
	}
			private String gerarBasicToken(String usuario, String senha) {

				String token = usuario + ":" + senha;
				byte[] tokenBase64 = Base64.encodeBase64(token.getBytes(Charset.forName("US-ASCII")));
				return "Basic " + new String(tokenBase64);
		}
}


