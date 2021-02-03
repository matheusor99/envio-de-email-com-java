package com.matheusor99.enviodeemail.entyties;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

	private String assunto;
	@Value("${MENSAGEM_EMAIL}")
	private String mensagemEmail;
	private String destinatario;
	private String remetente;
}
