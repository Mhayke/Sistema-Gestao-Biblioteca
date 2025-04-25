package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import view.UserInterfaces;
import model.Cliente;

public class GerenciarClientes {
	
	Scanner scan = new Scanner(System.in);
	UserInterfaces ui = new UserInterfaces ();
	
	private List<Cliente> clt = new ArrayList<>();

	public void AdicionarCliente(Cliente adc) {
		clt.add(adc);
	}
	
	public void removerCliente() {
		System.out.print(" QUAL O CPF?: ");
	    String cpfrem = scan.nextLine();
	    
	    Cliente encontrado = null;
	    
	    for (Cliente c : clt) {
	        if (c.getCpf().equals(cpfrem)) {
	            encontrado = c;
	            break;
	        }
	    }
	    
	    if (encontrado != null) {
	        clt.remove(encontrado);
	        ui.exibirSRclt();
	    } else {
	        ui.exibirRRclt();
	    }
	}
	

	public void listarClientes () { // Listar clientes cadastrado no sistema
		
		System.out.println("╔═══════════════════════════════════════╗");
		System.out.println("    CLIENTES CADASTRADO NO SISTEMA 🔍 \n");
		
		for(Cliente i : clt) {
			
			System.out.println("   NOME: " + i.getNome());
	        System.out.println("   CPF: " + i.getCpf());
	        System.out.println("   ENDEREÇO: " + i.getEndereco());
	        System.out.println("   NÚMERO: " + i.getNumero()+"\n");
	       
		}
		
		System.out.println("╚═══════════════════════════════════════╝");
	}
	
	
	// getts e setts
	
	public List<Cliente> getClt() {
		return clt;
	}

	public void setClt(List<Cliente> clt) {
		this.clt = clt;
	}
	
}
