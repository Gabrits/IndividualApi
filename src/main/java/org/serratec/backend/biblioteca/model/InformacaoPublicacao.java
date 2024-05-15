package org.serratec.backend.biblioteca.model;

import java.sql.Date;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Size;

@Embeddable
public class InformacaoPublicacao {

	@Size(max = 50, message = "A editora pode ter apenas {max} digitos.")
	private String editora;
	private Date dataPublicacao;

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
}
