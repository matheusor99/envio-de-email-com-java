package com.matheusor99.enviodeemail.entyties;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Email {

	private String assunto;
	private String mensagemEmail;
	private String destinatario;
	private String remetente;
}
