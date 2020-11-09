package br.com.aodes.lojavirtual.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.aodes.lojavirtual.domain.Categoria;
import br.com.aodes.lojavirtual.repositories.CategoriaRepository;
import br.com.aodes.lojavirtual.services.exceptions.DataIntegrityException;
import br.com.aodes.lojavirtual.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);

		if (obj.isEmpty()) {

			throw new ObjectNotFoundException(
					"Objeto não encontrado! ID: " + id + " Tipo: " + Categoria.class.getName());
		}
		return obj.get();
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return categoriaRepository.save(obj);
	}

	public Categoria update(Categoria obj) {
		findById(obj.getId());
		return categoriaRepository.save(obj);
	}

	public void deleteById(Integer id) {
		findById(id);
		try {
			categoriaRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
		}
		

	}

}
