package controller;

import java.util.Scanner;
import model.Categoria;
import model.Cliente;
import model.Produto;
import model.Venda;
import model.Vendedor;
import view.UserInterfaces;

public class Select {

	private GerenciarVendedores gv = new GerenciarVendedores();
	private GerenciarClientes gclt = new GerenciarClientes(); // Instância única de GerenciarClientes
	private GerenciarProdutos gprod = new GerenciarProdutos ();
	private Events evt = new Events(gv, gclt, gprod); // gv e gclt para o novo construtor de Events (unicos)
	
    Scanner scan = new Scanner(System.in); //Instanciando o Scanner
	UserInterfaces ui = new UserInterfaces(); // Instanciando os Menus
	Produto prod = new Produto(); // Instanciando Produto
	Cliente clt = new Cliente(); // Instanciando Cliente
	Vendedor vendor = new Vendedor (); // Instancindo Vendedor
	Categoria categ = new Categoria(); // Instanciando Categoria
	Venda vd = new Venda (); // Instanciando Venda
	
	
	public void exibirCaso1() {
		
		int optcad;
		do {
			ui.exibirManutencao();
			System.out.print(" DIGITE UMA OPÇÃO: ");
			optcad = scan.nextInt();
				
				 if (optcad == 1){ // Chama primeira opção para cadastrar produtos
					 
					 evt.cadastrarProduto();
					 continue; // continua para o loop do-While dentro do case 1
					 
				} else if (optcad == 2) { // Chama segunda opção para cadastrar Clientes
					
					evt.cadastrarCliente();
					continue; // continua para o loop do-While dentro do case 1
					
				} else if (optcad == 3) { // Chama Terceira opção para cadastrar Vendedor
					
					evt.cadastrarVendedor();
					continue; // continua para o loop do-While dentro do case 1
					
				} else if (optcad == 4) { // Chama Quarta opção para remover Produto
					
					evt.removerLivro();
					continue; // continua para o loop do-While dentro do case 1
					
				} else if (optcad == 5) { // Chama Quinta opção para remover Cliente
					
					evt.removerCliente();
					continue; // continua para o loop do-While dentro do case 1
					
				} else if (optcad == 6) { // Chama Sexta opção para remover Vendedor
					
					evt.removerVendedor();
					continue; // continua para o loop do-While dentro do case 1
					
				} else if (optcad == 7) { // Chama Setima opção para voltar ao menu principal
					
					break; // Encerra o loop do-While dentro do case 1
					
				} else {
					ui.exibirError(); // exibe mensagem de 'opção invalida'
				}
			
		} while (optcad != 7); // Comparação do loop de acordo com minha entrada dentro do case 1 

		
	}
	
	public void exibirCaso2() {
		
		int optcons;
		do {
			ui.exibirConsultas();
			System.out.print(" DIGITE UMA OPÇÃO: ");
			optcons = scan.nextInt();
				
				 if (optcons == 1){ // Chama primeira opção para consultar categorias
					 
					gprod.listarProdutosPorCategoria();
					 
				} else if (optcons == 2) { // Chama segunda opção para consultar clientes
				
					gclt.listarClientes();
					
				} else if (optcons == 3) { // Chama Terceira opção para consultar vendedores
					
					gv.listarVendedores();
					
				} else if (optcons == 4) { // Chama Quarta opção para listar vendas
					
					continue; // continua para o loop do-While dentro do case 2
					
				} else if (optcons == 5) { // Chama Quinta opção para voltar ao menu principal
					
					break; // Encerra o loop do-While dentro do case 2
					
				} else {
					ui.exibirError(); // exibe mensagem de 'opção invalida'
				}
		
		} while (optcons != 5); // Comparação do loop de acordo com minha entrada dentro do case 2 

		
	}

	

	
	
}
