package com.matheusor99.enviodeemail.onstartup;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.matheusor99.enviodeemail.entyties.Email;

import org.springframework.core.env.Environment;

@Service
@PropertySource("classpath:env/email.properties")
public class EnviarEmail {
	
	@Autowired
	private Environment env;
	
	@EventListener(ApplicationReadyEvent.class)
	public void enviarEmail() {
		
		while(true) {
			try {
//				define de quanto em quanto tempo vai enviar o email, se quiser que envie só 1 vez remover o while(true) e p Thread.sleep
				Thread.sleep(30000);
				
				Email email = new Email();
				
				email.setAssunto(this.env.getProperty("email.smtp.useremail"));
				email.setRemetente(this.env.getProperty("email.smtp.useremail"));
				email.setDestinatario(this.env.getProperty("email.smtp.destinatario"));
				email.setMensagemEmail(this.env.getProperty("email.smtp.mensagem"));
				
				this.emailConfigAndSend(email);
				
				System.out.println("email enviado");
			} catch (Exception e) {
				System.out.println("erro1: "+ e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	public void emailConfigAndSend(Email emailInfos) {
//		configuração para enviar email
		SimpleEmail email = new SimpleEmail();
		email.setHostName(this.env.getProperty("email.smtp.hostname"));
		email.setSmtpPort(this.env.getProperty("email.smtp.port", Integer.class));
		email.setAuthenticator(
				new DefaultAuthenticator(
						this.env.getProperty("email.smtp.useremail"),
						this.env.getProperty("email.smtp.password")));
		email.setSSLOnConnect(true);
		
//		enviando o email
		try {
		
//			remetente do email
			email.setFrom(emailInfos.getRemetente());
//			destinatario do email
			email.addTo(emailInfos.getDestinatario());
//			assunto do email
			email.setSubject(emailInfos.getAssunto());
//			mensagem do email
			email.setMsg(emailInfos.getMensagemEmail());
			
			email.send();

		} catch (Exception e) {
			System.out.println("erro2: "+ e.getMessage());
			e.printStackTrace();
		}
	}

}
