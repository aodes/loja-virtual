package br.com.aodes.lojavirtual.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.aodes.lojavirtual.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
