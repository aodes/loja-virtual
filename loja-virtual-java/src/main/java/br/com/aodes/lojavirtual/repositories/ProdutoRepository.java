package br.com.aodes.lojavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aodes.lojavirtual.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>  {

}
