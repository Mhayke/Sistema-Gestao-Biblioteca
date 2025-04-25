package controller;

import model.Produto;
import view.UserInterfaces;
import java.util.List;
import java.util.Scanner;

public class GerenciarProdutos {
	
	Scanner scan = new Scanner(System.in);
	public UserInterfaces ui = new UserInterfaces ();
    private Produto produto = new Produto();
   

	public void adicionarProduto(String nome, double preco, String isbn, int categoria) {
        produto.adicionarProduto(nome, preco, isbn, categoria);
    }
    
    public void removerLivro() {
    	List<Produto.ProdutoInfo> listaProdutos = produto.getProdutos();
        Produto.ProdutoInfo encontrado = null;
        System.out.print(" QUAL O ISBN?: ");
		String isbnrem = scan.nextLine();

        for (Produto.ProdutoInfo p : listaProdutos) {
            if (p.getIsbn().equals(isbnrem)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            listaProdutos.remove(encontrado);
            ui.exibirSRlivro();
        } else {
        	ui.exibirRRlivro();
        }
		
    }


    public void listarProdutosPorCategoria() {
    	System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("         PRODUTOS POR CATEGORIA 📚 \n");

        for (int i = 1; i <= 16; i++) {
            String nomeCat = nomeCategoria(i);
            System.out.println("  📘 " + nomeCat.toUpperCase() + ":");

            boolean encontrou = false;
            for (Produto.ProdutoInfo p : produto.getProdutos()) {
                if (p.getCategoria() == i) {
                    System.out.println("    - " + p.getNome() + " | R$" + p.getPreco() + " | ISBN: " + p.getIsbn());
                    encontrou = true;
                }
            }

            if (!encontrou) {
                System.out.println("    Nenhum produto cadastrado.\n");
            } else {
                System.out.println();
            }
        }

        System.out.println("╚═══════════════════════════════════════╝");
    }

    private String nomeCategoria(int codigo) {
        return switch (codigo) {
            case 1 -> "Terror";
            case 2 -> "Fantasia";
            case 3 -> "Ficção";
            case 4 -> "Romance";
            case 5 -> "Mangá";
            case 6 -> "Biografia";
            case 7 -> "Infantil";
            case 8 -> "HQ";
            case 9 -> "Religião";
            case 10 -> "Tecnologia";
            case 11 -> "Esportes";
            case 12 -> "Artes";
            case 13 -> "Gastronomia";
            case 14 -> "Ciência";
            case 15 -> "Aventura";
            case 16 -> "Psicologia";
            default -> """
			╔═══════════════════════════════════════════════════╗
			║    CATEGORIA INEXISTENTE! ESCOLHA NOVAMENTE ❌	    ║
			╚═══════════════════════════════════════════════════╝
			""";
        };
    }

    public Produto getProduto() {
        return produto;
    }
    
}
