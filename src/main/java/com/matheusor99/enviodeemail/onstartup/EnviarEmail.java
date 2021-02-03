package com.matheusor99.enviodeemail.onstartup;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class EnviarEmail {
	
	@EventListener(ApplicationReadyEvent.class)
	public void enviarEmail() {
		
	}

}
