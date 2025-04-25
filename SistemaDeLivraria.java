package view;

import java.util.Locale;
import java.util.Scanner;
import controller.Select;

public class SistemaDeLivraria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Instanciando o Scanner
		scan.useLocale(Locale.US); // Muda maualmente o sistema pt-BR para US em usar (ponto)
		Select slc = new Select (); // Instancia os casos a depender da entrada do usuario
		UserInterfaces ui = new UserInterfaces(); // Instanciando os Menus
		
		int opt;
		do { // loop de repetição do Menu Principal usando do-While
			ui.exibirMenu();
			System.out.print(" DIGITE UMA OPÇÃO: ");
			opt = scan.nextInt();
			
			switch(opt) { // Opções de casos utilizando os cases do switch!
			
			case 1: // Opção de cadastro e Manutenção
				slc.exibirCaso1();
				break; // encerra o switch case
				
			case 2: // Opção de Consultas
				slc.exibirCaso2();
				break;
				
			case 3: // Opção de Iniciação de Vendas
				ui.exibirVenda();
				return;
				
			case 4: // Finaliza o loop do-While e encerra o programa. 
				ui.exibirSaida();
				return;
				
			default: // Quando não ha uma opção numerica valida! 
				ui.exibirError();
			}
			
		} while (opt != 4); // Condição de encerrar o programa.
		
	}

}
