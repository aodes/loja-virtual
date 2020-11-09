package br.com.aodes.lojavirtual;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.aodes.lojavirtual.domain.Categoria;
import br.com.aodes.lojavirtual.domain.Cidade;
import br.com.aodes.lojavirtual.domain.Cliente;
import br.com.aodes.lojavirtual.domain.Endereco;
import br.com.aodes.lojavirtual.domain.Estado;
import br.com.aodes.lojavirtual.domain.Produto;
import br.com.aodes.lojavirtual.domain.enums.TipoCliente;
import br.com.aodes.lojavirtual.repositories.CategoriaRepository;
import br.com.aodes.lojavirtual.repositories.CidadeRepository;
import br.com.aodes.lojavirtual.repositories.ClienteRepository;
import br.com.aodes.lojavirtual.repositories.EnderecoRepository;
import br.com.aodes.lojavirtual.repositories.EstadoRepository;
import br.com.aodes.lojavirtual.repositories.ProdutoRepository;

@SpringBootApplication
public class LojaVirtualApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
	ProdutoRepository produtoRepository;

	@Autowired
	CidadeRepository cidadeRepository;

	@Autowired
	EstadoRepository estadoRepository;

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

		Cliente cli1 = new Cliente(null, "Maria Silva", "nelio.cursos@gmail.com", "36378912377",
				TipoCliente.PESSOAFISICA);

		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));

		Cliente cli2 = new Cliente(null, "Ana Costa", "nelio.iftm@gmail.com", "31628382740", TipoCliente.PESSOAFISICA);

		cli2.getTelefones().addAll(Arrays.asList("93883321", "34252625"));

		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		Endereco e3 = new Endereco(null, "Avenida Floriano", "2106", null, "Centro", "281777012", cli2, c2);

		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		cli2.getEnderecos().addAll(Arrays.asList(e3));
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
		enderecoRepository.saveAll(Arrays.asList(e1,e2,e3));

	}

}
