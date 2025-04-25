package model;

import java.util.List;

import view.UserInterfaces;
import view.SistemaDeLivraria;
import java.util.ArrayList;
import java.util.Arrays;

public class Produto {
	
	/*	- nome (String): Nome do produto.
		- preco (double): Preço do produto.
		- isbn (String): numero geral do produto
		- categoria (Categoria): Categoria à qual o produto pertence.*/
	
	UserInterfaces ui = new UserInterfaces();
	
	public class ProdutoInfo {
        
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public int getCategoria() {
			return categoria;
		}

		public void setCategoria(int categoria) {
			this.categoria = categoria;
		}
		
		private String nome;
		private double preco;
        private String isbn;
        private int categoria;

        public ProdutoInfo(String nome, double preco, String isbn, int categoria) {
            this.nome = nome;
            this.preco = preco;
            this.isbn = isbn;
            this.categoria = categoria;
        }
    }

    private List<ProdutoInfo> produtos = new ArrayList<>();
	

    // método para adicionar produtos
    public void adicionarProduto(String nome, double preco, String isbn, int categoria) {
        produtos.add(new ProdutoInfo(nome, preco, isbn, categoria));
        incrementarCategoria(categoria); // mantém a contagem como já estava
    }

    public List<ProdutoInfo> getProdutos() {
        return produtos;
    }
	
	
	public void incrementarCategoria(int catprod) { // metodo para contabilizar a categoria após ser validado e cadastrado o produto.
	    switch (catprod) {
	        case 1 -> {catprod++; ui.exibirSucess();} 
	        case 2 -> {catprod++; ui.exibirSucess();} 
	        case 3 -> {catprod++; ui.exibirSucess();}  
	        case 4 -> {catprod++; ui.exibirSucess();} 
	        case 5 -> {catprod++; ui.exibirSucess();} 
	        case 6 -> {catprod++; ui.exibirSucess();} 
	        case 7 -> {catprod++; ui.exibirSucess();} 
	        case 8 -> {catprod++; ui.exibirSucess();} 
	        case 9 -> {catprod++; ui.exibirSucess();} 
	        case 10 -> {catprod++; ui.exibirSucess();} 
	        case 11 -> {catprod++; ui.exibirSucess();} 
	        case 12 -> {catprod++; ui.exibirSucess();} 
	        case 13 -> {catprod++; ui.exibirSucess();} 
	        case 14 -> {catprod++; ui.exibirSucess();} 
	        case 15 -> {catprod++; ui.exibirSucess();} 
	        case 16 -> {catprod++; ui.exibirSucess();} 
	        default -> ui.exibirErrorCateg(); // exibe mensagem de categoria inexistente, caso a opção do usuario seja invalida.
	    }
		
	}
	

}
