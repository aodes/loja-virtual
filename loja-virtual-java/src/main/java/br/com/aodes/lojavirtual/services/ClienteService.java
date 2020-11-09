package br.com.aodes.lojavirtual.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aodes.lojavirtual.domain.Cliente;
import br.com.aodes.lojavirtual.repositories.ClienteRepository;
import br.com.aodes.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		if (obj.isEmpty()) {
			throw new ObjectNotFoundException("Cliente não encontrado! id: " + id + " Tipo: " + Cliente.class.getName());
		}
		return obj.get();
	}
}
