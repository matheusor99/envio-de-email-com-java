package com.matheusor99.enviodeemail.onstartup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

@Service
@PropertySource("classpath:env/email.properties")
public class EnviarEmail {
	
	@Autowired
	private Environment env;
	
	@EventListener(ApplicationReadyEvent.class)
	public void enviarEmail() {
		
	}

}
