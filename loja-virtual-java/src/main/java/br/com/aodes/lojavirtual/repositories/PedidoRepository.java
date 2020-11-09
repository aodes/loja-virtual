package br.com.aodes.lojavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aodes.lojavirtual.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>  {

}