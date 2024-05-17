package org.serratec.backend.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Preencha o titulo do livro.")
	@Size(min = 0, max = 50, message = "O titulo deve ter entre {min} e {max} digitos.")
	@Column(nullable = false, length = 50)
	private String titulo;

	@Embedded
	private InformacaoPublicacao informacaoPublicacao;

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

	public InformacaoPublicacao getInformacaoPublicacao() {
		return informacaoPublicacao;
	}

	public void setInformacaoPublicacao(InformacaoPublicacao informacaoPublicacao) {
		this.informacaoPublicacao = informacaoPublicacao;
	}
}
