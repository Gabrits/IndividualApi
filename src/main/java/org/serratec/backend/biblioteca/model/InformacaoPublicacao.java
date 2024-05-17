package org.serratec.backend.biblioteca.model;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;

@Embeddable
public class InformacaoPublicacao {

	private String editora;
	private LocalDate dataPublicacao;
	private String autor;

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
