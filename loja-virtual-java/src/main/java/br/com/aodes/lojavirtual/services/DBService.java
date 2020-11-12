package br.com.aodes.lojavirtual.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aodes.lojavirtual.domain.Categoria;
import br.com.aodes.lojavirtual.domain.Cidade;
import br.com.aodes.lojavirtual.domain.Cliente;
import br.com.aodes.lojavirtual.domain.Endereco;
import br.com.aodes.lojavirtual.domain.Estado;
import br.com.aodes.lojavirtual.domain.ItemPedido;
import br.com.aodes.lojavirtual.domain.Pagamento;
import br.com.aodes.lojavirtual.domain.PagamentoComBoleto;
import br.com.aodes.lojavirtual.domain.PagamentoComCartao;
import br.com.aodes.lojavirtual.domain.Pedido;
import br.com.aodes.lojavirtual.domain.Produto;
import br.com.aodes.lojavirtual.domain.enums.EstadoPagamento;
import br.com.aodes.lojavirtual.domain.enums.TipoCliente;
import br.com.aodes.lojavirtual.repositories.CategoriaRepository;
import br.com.aodes.lojavirtual.repositories.CidadeRepository;
import br.com.aodes.lojavirtual.repositories.ClienteRepository;
import br.com.aodes.lojavirtual.repositories.EnderecoRepository;
import br.com.aodes.lojavirtual.repositories.EstadoRepository;
import br.com.aodes.lojavirtual.repositories.ItemPedidoRepository;
import br.com.aodes.lojavirtual.repositories.PagamentoRepository;
import br.com.aodes.lojavirtual.repositories.PedidoRepository;
import br.com.aodes.lojavirtual.repositories.ProdutoRepository;

@Service
public class DBService {

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
	
	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	PagamentoRepository pagamentoRepository;
	
	@Autowired
	ItemPedidoRepository itemPedidoRepository;
	
	public void instantiateTestDatabase() throws ParseException {
	
	Categoria cat1 = new Categoria(null, "Informática");
	Categoria cat2 = new Categoria(null, "Escritório");
	Categoria cat3 = new Categoria(null, "Cama mesa e banho");
	Categoria cat4 = new Categoria(null, "Eletrônicos");
	Categoria cat5 = new Categoria(null, "Jardinagem");
	Categoria cat6 = new Categoria(null, "Decoração");
	Categoria cat7 = new Categoria(null, "Perfumaria");

	Produto p1 = new Produto(null, "Computador", 2000.00);
	Produto p2 = new Produto(null, "Impressora", 800.00);
	Produto p3 = new Produto(null, "Mouse", 80.00);
	Produto p4 = new Produto(null, "Mesa de escritório", 300.00);
	Produto p5 = new Produto(null, "Toalha", 50.00);
	Produto p6 = new Produto(null, "Colcha", 200.00);
	Produto p7 = new Produto(null, "TV true color", 1200.00);
	Produto p8 = new Produto(null, "Roçadeira", 800.00);
	Produto p9 = new Produto(null, "Abajour", 100.00);
	Produto p10 = new Produto(null, "Pendente", 180.00);
	Produto p11 = new Produto(null, "Shampoo", 90.00);
	
	Produto p12 = new Produto(null, "Produto 12", 10.00);
	Produto p13 = new Produto(null, "Produto 13", 10.00);
	Produto p14 = new Produto(null, "Produto 14", 10.00);
	Produto p15 = new Produto(null, "Produto 15", 10.00);
	Produto p16 = new Produto(null, "Produto 16", 10.00);
	Produto p17 = new Produto(null, "Produto 17", 10.00);
	Produto p18 = new Produto(null, "Produto 18", 10.00);
	Produto p19 = new Produto(null, "Produto 19", 10.00);
	Produto p20 = new Produto(null, "Produto 20", 10.00);
	Produto p21 = new Produto(null, "Produto 21", 10.00);
	Produto p22 = new Produto(null, "Produto 22", 10.00);
	Produto p23 = new Produto(null, "Produto 23", 10.00);
	Produto p24 = new Produto(null, "Produto 24", 10.00);
	Produto p25 = new Produto(null, "Produto 25", 10.00);
	Produto p26 = new Produto(null, "Produto 26", 10.00);
	Produto p27 = new Produto(null, "Produto 27", 10.00);
	Produto p28 = new Produto(null, "Produto 28", 10.00);
	Produto p29 = new Produto(null, "Produto 29", 10.00);
	Produto p30 = new Produto(null, "Produto 30", 10.00);
	Produto p31 = new Produto(null, "Produto 31", 10.00);
	Produto p32 = new Produto(null, "Produto 32", 10.00);
	Produto p33 = new Produto(null, "Produto 33", 10.00);
	Produto p34 = new Produto(null, "Produto 34", 10.00);
	Produto p35 = new Produto(null, "Produto 35", 10.00);
	Produto p36 = new Produto(null, "Produto 36", 10.00);
	Produto p37 = new Produto(null, "Produto 37", 10.00);
	Produto p38 = new Produto(null, "Produto 38", 10.00);
	Produto p39 = new Produto(null, "Produto 39", 10.00);
	Produto p40 = new Produto(null, "Produto 40", 10.00);
	Produto p41 = new Produto(null, "Produto 41", 10.00);
	Produto p42 = new Produto(null, "Produto 42", 10.00);
	Produto p43 = new Produto(null, "Produto 43", 10.00);
	Produto p44 = new Produto(null, "Produto 44", 10.00);
	Produto p45 = new Produto(null, "Produto 45", 10.00);
	Produto p46 = new Produto(null, "Produto 46", 10.00);
	Produto p47 = new Produto(null, "Produto 47", 10.00);
	Produto p48 = new Produto(null, "Produto 48", 10.00);
	Produto p49 = new Produto(null, "Produto 49", 10.00);
	Produto p50 = new Produto(null, "Produto 50", 10.00);

	cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
	cat2.getProdutos().addAll(Arrays.asList(p2, p4));
	cat3.getProdutos().addAll(Arrays.asList(p5, p6));
	cat4.getProdutos().addAll(Arrays.asList(p1, p2, p3, p7));
	cat5.getProdutos().addAll(Arrays.asList(p8));
	cat6.getProdutos().addAll(Arrays.asList(p9, p10));
	cat7.getProdutos().addAll(Arrays.asList(p11));

	p1.getCategorias().addAll(Arrays.asList(cat1, cat4));
	p2.getCategorias().addAll(Arrays.asList(cat1, cat2, cat4));
	p3.getCategorias().addAll(Arrays.asList(cat1, cat4));
	p4.getCategorias().addAll(Arrays.asList(cat2));
	p5.getCategorias().addAll(Arrays.asList(cat3));
	p6.getCategorias().addAll(Arrays.asList(cat3));
	p7.getCategorias().addAll(Arrays.asList(cat4));
	p8.getCategorias().addAll(Arrays.asList(cat5));
	p9.getCategorias().addAll(Arrays.asList(cat6));
	p10.getCategorias().addAll(Arrays.asList(cat6));
	p11.getCategorias().addAll(Arrays.asList(cat7));

	categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
	produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
	
	produtoRepository.saveAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
			p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38,
			p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));

	Estado est1 = new Estado(null, "Minas Gerais");
	Estado est2 = new Estado(null, "São Paulo");

	Cidade c1 = new Cidade(null, "Uberlandia", est1);
	Cidade c2 = new Cidade(null, "São Paulo", est2);
	Cidade c3 = new Cidade(null, "Campinas", est2);

	est1.getCidades().addAll(Arrays.asList(c1));
	est2.getCidades().addAll(Arrays.asList(c2, c3));

	estadoRepository.saveAll(Arrays.asList(est1, est2));
	cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

	Cliente cli1 = new Cliente(null, "Anderson de Oliveira", "anderson.dev.java@gmail.com", "36378912377",TipoCliente.PESSOAFISICA);

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
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, e1);
	Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1, e2);
	
	Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
	ped1.setPagamento(pagto1);
	
	Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
	ped2.setPagamento(pagto2);
	
	cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
	
	pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
	pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));

	ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
	ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
	ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
	
	ped1.getItens().addAll(Arrays.asList(ip1, ip2));
	ped2.getItens().addAll(Arrays.asList(ip3));
	
	p1.getItens().addAll(Arrays.asList(ip1));
	p2.getItens().addAll(Arrays.asList(ip3));
	p3.getItens().addAll(Arrays.asList(ip2));
	
	itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
	}
}
