package br.com.aodes.lojavirtual.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.aodes.lojavirtual.domain.Cliente;
import br.com.aodes.lojavirtual.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes" )
public class ClienteResource {

	@Autowired
	ClienteService service;
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public ResponseEntity<Cliente> findById(@PathVariable Integer id){
		Cliente obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
