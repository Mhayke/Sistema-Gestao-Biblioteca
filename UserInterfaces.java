package view;

public class UserInterfaces {
	
	/*
	 * Ao iniciar a aplicação, o sistema deve apresentar o seguinte menu principal:
	 * 
	 * - 1. Manutenção de Cadastro
	 * 
	 * O menu de **Manutenção de Cadastro** deve permitir:
	 * 
	 * 1. **Cadastro de Produto** - Permite gerenciar produtos no sistema. 
	 * 2. **Cadastro de Cliente** - Permite gerenciar clientes.
	 * 3. **Cadastro de Vendedor** - Permite gerenciar vendedores.
	 * 4. **Voltar** - Retorna ao menu principal.
	 * 
	 * - 2. Consultas
	 * 
	 * O menu de **Consultas** deve permitir:
	 * 
	 * 1. **Consultar Produtos por Categoria** - Exibe os produtos disponíveis em uma determinada categoria. 
	 * 2. **Consultar Cliente por CPF** - Exibe informações de um cliente específico, com base no CPF. 
	 * 3. **Consultar Vendedor por CPF** - Exibe informações de um vendedor específico, com base no CPF. 
	 * 4. **Listar Vendas** - Exibe todas as vendas realizadas. 
	 * 5. **Voltar** - Retorna ao menu principal. 
	 * 
	 * - 3. Iniciar Venda
	 * 
	 * Quando o usuário escolher a opção **Iniciar Venda**, o sistema deve apresentar as seguintes opções:
	 * 
	 * 1. **Adicionar Produto** - Permite adicionar produtos à venda. 
	 * 2. **Remover Produto** - Permite remover produtos adicionados à venda. 
	 * 3. **Calcular Total** - Exibe o valor total da venda. 
	 * 4. **Associar Cliente** - Permite associar um cliente à venda, utilizando o CPF. 
	 * 5. **Associar Vendedor** - Permite associar um vendedor à venda, utilizando o CPF. 
	 * 6. **Concluir Venda** - Finaliza a venda e registra no sistema. 
	 * 7. **Cancelar Venda** - Cancela a venda em andamento e retorna ao menu principal. 
	 * 
	 * - 4. Sair
	 */
	
	
	// Menus Principal
	public String MenuPrincipal = """
			╔═══════════════════════════════════════════════╗ 
			             📚 SISTEMA DE LIVRARIA 📚
			╠═══════════════════════════════════════════════╣
			║ 1. Cadastro e Manutenção 💻   2. Consultas 🔍	║
			║ 3. Iniciar Venda 📈           4. Sair ➡️	║  
			╚═══════════════════════════════════════════════╝
			""";
	
	public String MenuManutencao = """
			╔═════════════════════════════════════════════╗ 
			          💻 Cadastrar e Manutenção 💻
			╠═════════════════════════════════════════════╣
			║ 1. Cadastrar Livro      4. Remover Produto  ║
			║ 2. Cadastrar Cliente    5. Remover Cliente  ║
			║ 3. Cadastrar Vendedor   6. Remover Vendedor ║
			║                         7. Voltar           ║
			╚═════════════════════════════════════════════╝
			"""; 
	
	public String MenuConsultas = """
			╔══════════════════════════════════════════════╗ 
			                  🔍 Consultas 🔍
			╠══════════════════════════════════════════════╣
			║ 1. Consultar Categoria  2. Consultar Cliente ║
			║ 3. Consultar Vendedor   4. Consultar Vendas  ║
			║ 5. Voltar                                    ║
			╚══════════════════════════════════════════════╝
			""";
	
	public String MenuVendas = """
			╔═══════════════════════════════════════════╗ 
			              📉 Iniciar Venda 📈
			╠═══════════════════════════════════════════╣
			║ 1. Adicionar Produto  2. Remover Produto  ║
			║ 3. Associar Vendedor  4. Associar Cliente ║ 
			║ 5. Concluir Venda     6. Cancelar Venda   ║
			╚═══════════════════════════════════════════╝
			""";
	
	public String MenuSair = """
			╔═══════════════════════════════════════════════════════╗ 
			║                ➡️ SISTEMA DE LIVRARIA ➡️		║
			╠═══════════════════════════════════════════════════════╣
			║ AGRADEÇEMOS A USABILIDADE DE NOSSO SISTEMA, ATÉ LOGO. ║
			╚═══════════════════════════════════════════════════════╝
			""";
	
	public String MenuError = """
			╔═════════════════════════════════════════════╗ 
			      Opção Inválida, Escolha Novamente! ⚠️
			╚═════════════════════════════════════════════╝
			""";
	
	// Metodos ou funções para exibir mini interfaces para melhor visualização de opções
	
	public void exibirMenu() { // Exibi a interface de Menu Principal.
		System.out.print("\n"+MenuPrincipal);
	}
	
	public void exibirManutencao() { // Exibi a interface de Cadastro e Manutenção.
		System.out.println("\n"+MenuManutencao);
	}
	
	public void exibirConsultas() { // Exibi a interface de Consultas.
		System.out.println("\n"+MenuConsultas);
	}
	
	public void exibirVenda() { // Exibi a interface de Vendas.
		System.out.println("\n"+MenuVendas);
	}
	
	public void exibirSaida() { // Exibi a interface de saida.
		System.out.println("\n"+MenuSair);
	}
	
	public void exibirError() { // Exibi a mensagem de 'Opção invalida'
		System.out.println("\n"+MenuError);
	}
	
	
	// Blocos de String's para criar mini interface a ser usado para mostrar ao usuario em cadastro de clientes!
	
	public String MenuNomClient = """
			╔═══════════════════════════╗ 
			      NOME DO CLIENTE 💻
			╚═══════════════════════════╝
			""";
	
	public String MenuCpfClient = """
			╔════════════════════════════╗ 
			        NUMERO DE CPF 💻
			╚════════════════════════════╝
			""";
	
	public String MenuEndClient = """
			╔══════════════════════╗ 
			       ENDEREÇO 💻
			╚══════════════════════╝
			""";
	
	public String MenuNumClient = """
			╔══════════════════════╗ 
			    NÚMERO CELULAR 💻
			╚══════════════════════╝
			""";
	
	public String MenuSucClient = """
			╔════════════════════════════════════════╗
			║   CLIENTE CADASTRADO COM SUCESSO ✅ 	 ║
			╚════════════════════════════════════════╝
			""";
	
	// Metodos ou funções para exibir mini interfaces para melhor visualização de opções
	
	public void exibirNomeClient () {
		System.out.println("\n"+MenuNomClient);
	}
	
	public void exibirCpfClient () {
		System.out.println("\n"+MenuCpfClient);
	}
	
	public void exibirEndClient () {
		System.out.println("\n"+MenuEndClient);
	}
	
	public void exibirNumClient () {
		System.out.println("\n"+MenuNumClient);
	}
	
	public void exibirSucessClient () {
		System.out.println("\n"+MenuSucClient);
	}
	
	// Remover Cliente
	
		public String MenRclt = """
				╔═════════════════════════════════════════════╗ 
				   DIGITE O CPF DO CLIENTE PARA REMOVE-LO 💻
				╚═════════════════════════════════════════════╝
				""";
		
		public String MenSRclt = """
				╔═══════════════════════════════════╗ 
				   CLIENTE REMOVIDO COM SUCESSO ✅
				╚═══════════════════════════════════╝
				""";
		
		public String MenRRclt = """
				╔═══════════════════════════╗ 
				    CPF NÃO ENCONTRADO ❌
				╚═══════════════════════════╝
				""";
	
	public void exibirRclt () {
		System.out.println("\n"+MenRclt);
	}
	
	public void exibirSRclt () {
		System.out.println("\n"+MenSRclt);
	}
	
	public void exibirRRclt () {
		System.out.println("\n"+MenRRclt);
	}
	
	
	// Blocos de String's para criar mini interface a ser usado para mostrar ao usuario em cadastrar produtos
	
	public String MenuNom = """
			╔═════════════════════════════╗ 
			        NOME DO LIVRO 💻
			╚═════════════════════════════╝
			""";
	
	public String MenuIsbn = """
			╔═════════════════════════════╗ 
			    NÚMERO ISBN DO LIVRO 💻
			╚═════════════════════════════╝
			""";
	
	public String MenuPreco = """
			╔═════════════════════════════╗ 
			       PREÇO DO LIVRO $💻
			╚═════════════════════════════╝
			""";
	
	public String MenuCateg = """
					 ╔═════════════════════════════╗ 
					      CATEGORIA DO LIVRO 💻
					 ╚═════════════════════════════╝
			╔════════════════════════════════════════════════════════════════╗ 
			  1. Terror         2. Fantasia     3. Ficção     4. Romance
			  5. Mangá          6. Biografia    7. Infantil   8. HQ
			  9. Religião      10. Tecnologia   11. Esportes  12. Artes
			  13. Gastronomia  14. Ciência      15. Aventura  16. Psicologia
			╚════════════════════════════════════════════════════════════════╝
			""";
	
	public String MenuSucess = """
			╔════════════════════════════════════════╗
			║    LIVRO CADASTRADO COM SUCESSO ✅ 	 ║
			╚════════════════════════════════════════╝
			""";
	
	public String MenuCatError = """
			╔═══════════════════════════════════════════════════╗
			║    CATEGORIA INEXISTENTE! ESCOLHA NOVAMENTE ❌	    ║
			╚═══════════════════════════════════════════════════╝
			""";
	
	// Metodos ou funções para exibir mini interfaces para melhor visualização de opções
	
	public void exibirNom() {
		System.out.println("\n"+MenuNom);
	}
	
	public void exibirIsbn() {
		System.out.println("\n"+MenuIsbn);
	}
	
	public void exibirPreco() {
		System.out.println("\n"+MenuPreco);
	}
	
	public void exibirCateg() {
		System.out.println("\n"+MenuCateg);
	}
	
	public void exibirSucess() {
		System.out.println("\n"+MenuSucess);
	}
	
	public void exibirErrorCateg() {
		System.out.println("\n"+MenuCatError);
	}
	
	// Remover livro
	
		public String MenRlivro = """
				╔═════════════════════════════════════════════╗ 
				    DIGITE O ISBN DO LIVRO PARA REMOVE-LO 💻
				╚═════════════════════════════════════════════╝
				""";
		
		public String MenSRlivro = """
				╔═══════════════════════════════════╗ 
				    LIVRO REMOVIDO COM SUCESSO ✅
				╚═══════════════════════════════════╝
				""";
		
		public String MenRRlivro = """
				╔═══════════════════════════╗ 
				    ISBN NÃO ENCONTRADO ❌
				╚═══════════════════════════╝
				""";
		
	public void exibirRlivro () {
		System.out.println("\n"+MenRlivro);
	}
	
	public void exibirSRlivro () {
		System.out.println("\n"+MenSRlivro);
	}
	
	public void exibirRRlivro () {
		System.out.println("\n"+MenRRlivro);
	}
	
	// Blocos de String's para criar mini interface a ser usado para mostrar ao usuario em cadastro de vendedor!

		public String MenuNomVendor = """
				╔═══════════════════════════╗ 
				      NOME DO VENDEDOR 💻
				╚═══════════════════════════╝
				""";
		
		public String MenuCpfVendor = """
				╔════════════════════════════╗ 
				        NUMERO DE CPF 💻
				╚════════════════════════════╝
				""";
		
		public String MenuCrbVendor = """
				╔═════════════════════════════════════════════╗ 
				   NUMERO DE REGISTRO BIBLIOTECARIO (CRB) 💻
				╚═════════════════════════════════════════════╝
				""";
		
		public String MenuVendorSucess = """
				╔════════════════════════════════════════╗
				║   VENDEDOR CADASTRADO COM SUCESSO ✅ 	 ║
				╚════════════════════════════════════════╝
				""";
		
	// Metodos ou funções para exibir mini interfaces para melhor visualização de opções
		
	public void exibirNomVendedor() {
		System.out.println("\n"+MenuNomVendor);
	}
	
	public void exibirCpfVendedor() {
		System.out.println("\n"+MenuCpfVendor);
	}
	
	public void exibirCrbVendedor() {
		System.out.println("\n"+MenuCrbVendor);
	}
	
	public void exibirSucVendedor() {
		System.out.println("\n"+MenuVendorSucess);
	}
	
	// Remover Vendedor
	
		public String MenRvdd = """
				╔══════════════════════════════════════════════╗ 
				   DIGITE O CRB DO VENDEDOR PARA REMOVE-LO 💻
				╚══════════════════════════════════════════════╝
				""";
		
		public String MenSRvdd = """
				╔════════════════════════════════════╗ 
				   VENDEDOR REMOVIDO COM SUCESSO ✅
				╚════════════════════════════════════╝
				""";
		
		public String MenRRvdd = """
				╔═══════════════════════════╗ 
				    CRB NÃO ENCONTRADO ❌
				╚═══════════════════════════╝
				""";
			
	public void exibirRvdd () {
		System.out.println("\n"+MenRvdd);
	}
	
	public void exibirSRvdd () {
		System.out.println("\n"+MenSRvdd);
	}
	
	public void exibirRRvdd () {
		System.out.println("\n"+MenRRvdd);
	}
	

}
