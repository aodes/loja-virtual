package br.com.aodes.lojavirtual.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aodes.lojavirtual.domain.Pedido;
import br.com.aodes.lojavirtual.repositories.PedidoRepository;
import br.com.aodes.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);
			
		if(obj.isEmpty()) {
			
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id + " Tipo: " + Pedido.class.getName());
		}
		return obj.get();
	}
	
}
