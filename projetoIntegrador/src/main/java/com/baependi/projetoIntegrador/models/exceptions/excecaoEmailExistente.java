package com.baependi.projetoIntegrador.models.exceptions;

public class excecaoEmailExistente extends RuntimeException {

	/*
	 * 
	 * 
	 */
	private static final long serialVersionUid = 1L;

	public excecaoEmailExistente(String emailExistente) {
		super("E-mail " + emailExistente + " já existente!");

	}

}
