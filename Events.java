package controller;

import view.UserInterfaces;
import model.Produto;
import model.Cliente;
import model.Vendedor;
import model.Categoria;
import model.Venda;
import java.util.Scanner;

public class Events {
	
		private GerenciarVendedores gv;
		private GerenciarClientes gclt;
		private GerenciarProdutos gprod;
	
		// recebe os dois gerenciadores em um só
	    public Events(GerenciarVendedores gv, GerenciarClientes gclt, GerenciarProdutos gprod) {
	        this.gv = gv;
	        this.gclt = gclt;
	        this.gprod = gprod;
	    }
	   

		// Importações de outras classes
		Scanner scan = new Scanner(System.in);
		UserInterfaces ui = new UserInterfaces();
		Produto prod = new Produto();
		Cliente clt = new Cliente();
		Vendedor vendor = new Vendedor ();
		Categoria categ = new Categoria();
		Venda vd = new Venda ();
		
		
		// CASE 1 - Manutenção e Cadastro - Opção de cadastrar Produto
		
		public void cadastrarProduto() {
			
			ui.exibirNom(); // exibe uma interface de nome
			System.out.print(" DIGITE O NOME DO PRODUTO: ");
			String nomprod = scan.nextLine();
			
			
			ui.exibirPreco();
			System.out.print(" QUAL O PREÇO DO PRODUTO: ");
			double precoprod = scan.nextDouble();
			
			
			ui.exibirIsbn();
			System.out.print(" DIGITE O ISBN DO PRODUTO: ");
			scan.nextLine(); // limpa o buff \n
			String isbnprod = scan.nextLine();
			
	
			int catprod; // declaração da variavel fora do loop do-While para atualização de vezes escolhida pelo usuario
			do {
				ui.exibirCateg();
				System.out.print(" QUAL A CATEGORIA DO PRODUTO (1-16): ");
				catprod = scan.nextInt();
				scan.nextLine();
				
			
			} while (catprod <= 0 || catprod >= 17); // loop para condição caso minha categoria seja invalida.
			
			gprod.adicionarProduto(nomprod, precoprod, isbnprod, catprod);
			
		}
		
		// CASE 1 - Manutenção e Cadastro - Opção de cadastrar Cliente
		
		public void cadastrarCliente() {
			
			ui.exibirNomeClient();
			System.out.print(" DIGITE O NOME DO CLIENTE: ");
			String nome = scan.nextLine();
			
			ui.exibirCpfClient();
			System.out.print(" DIGITE O CPF DO CLIENTE: ");
			String cpf = scan.nextLine();
		
			ui.exibirEndClient();
			System.out.print(" DIGITE O ENDEREÇO DO CLIENTE: ");
			String endereco = scan.nextLine();
			
			ui.exibirNumClient();
			System.out.print(" DIGITE O NÚMERO DO CLIENTE: ");
			String numero = scan.nextLine();
			
			Cliente novoClt = new Cliente(nome, cpf, endereco, numero);
			gclt.AdicionarCliente(novoClt);
			ui.exibirSucessClient(); // exibir uma mensagem de "cadastro sucess"
			
		}
		
		// CASE 1 - Manutenção e Cadastro - Opção de cadastrar Vendedor
		
		public void cadastrarVendedor() {
			
			ui.exibirNomVendedor();
			System.out.print(" DIGITE O NOME DO VENDEDOR: ");
			String nome = scan.nextLine();
		
			ui.exibirCpfVendedor();
			System.out.print(" DIGITE O CPF DO VENDEDOR: ");
			String cpf = scan.nextLine();
			
			ui.exibirCrbVendedor();
			System.out.print(" DIGITE O CRB DO VENDEDOR: ");
			String crb = scan.nextLine();
			
			Vendedor novoVendedor = new Vendedor(nome, cpf, crb);
			gv.AdicionarVendedor(novoVendedor);
			ui.exibirSucVendedor(); // exibir uma mensagem de "cadastro sucess"
			
		}
		
		public void removerLivro () {
			ui.exibirRlivro();
			gprod.removerLivro();
		}
		
		public void removerCliente () {
			ui.exibirRclt();
			gclt.removerCliente();
		}
		
		public void removerVendedor () {
			ui.exibirRvdd();
			gv.removerVendedor();
		}
	

	}
	

