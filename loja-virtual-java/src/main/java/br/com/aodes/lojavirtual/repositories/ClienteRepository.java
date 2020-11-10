package br.com.aodes.lojavirtual.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aodes.lojavirtual.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>  {

	//CRIANDO UMA CONSULTA PERSONALIZADA PARA EMAIL
	@Transactional()
	Cliente findByEmail(String email);
}
