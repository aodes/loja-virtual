package br.com.aodes.lojavirtual.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aodes.lojavirtual.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>  {

	@Transactional
	public List<Estado> findAllByOrderByNome();
}
