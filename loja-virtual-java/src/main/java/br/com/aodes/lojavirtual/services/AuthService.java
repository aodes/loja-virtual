package br.com.aodes.lojavirtual.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.aodes.lojavirtual.domain.Cliente;
import br.com.aodes.lojavirtual.repositories.ClienteRepository;
import br.com.aodes.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class AuthService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private EmailService emailService;
	
	private Random rand = new Random();
	
	public void sendNewPassword(String email) {
		
		Cliente cliente = clienteRepository.findByEmail(email);
		
		if ( cliente == null) {
			throw new ObjectNotFoundException("Email não encontrado");
		}
		
		String newPass = newPassword();
		System.out.println("################################################################################################################################################################################");
		System.out.println(newPass);
		cliente.setSenha(bCryptPasswordEncoder.encode(newPass));
		
		clienteRepository.save(cliente);
		emailService.sendNewPasswordEmail(cliente, newPass);
		
	}

	private String newPassword() {
		char [] vet = new char[10];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = randomchar();
			System.out.println(vet[i]);
		}
		System.out.println(vet);
		return new String(vet);
		
	}

	private char randomchar() {
		int opt = rand.nextInt(3);
		
		if (opt == 0) { //GERA DIGITO
			return (char) (rand.nextInt(10) + 48);
		}else if (opt == 1) { //GERA LETRA MAISCULA
			return (char) (rand.nextInt(26) + 65);
		}else { // GERA LETRA MINUSCULA
			return (char) (rand.nextInt(26) + 97);
		}
	}

}
