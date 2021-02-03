package com.matheusor99.enviodeemail.entyties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

	private String assunto;
	private String mensagemEmail;
	private String destinatario;
	private String remetente;
}
