package com.baependi.projetoIntegrador.models.exceptions;

public class excecaoErroEmailOuSenhaExistente extends RuntimeException {
	/*
	 * 
	 * a
	 */
	private static final long SerialVersionUid = 1L;

	public excecaoErroEmailOuSenhaExistente() {
		super("E-mail ou senha inválidos!");
	}
}
