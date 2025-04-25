package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Produto;
import model.Vendedor;
import view.UserInterfaces;

public class GerenciarVendedores {
	
	Scanner scan = new Scanner(System.in);
	UserInterfaces ui = new UserInterfaces();
	
	private List<Vendedor> gvs = new ArrayList<>();
	
	public void AdicionarVendedor(Vendedor adv) {
		gvs.add(adv);
	}
	
	public void removerVendedor() {
		
	    System.out.print(" QUAL O CRB?: ");
	    String crbrem = scan.nextLine();
	    
	    Vendedor encontrado = null;
	    
	    for (Vendedor v : gvs) {
	        if (v.getCrb().equals(crbrem)) {
	            encontrado = v;
	            break;
	        }
	    }
	    
	    if (encontrado != null) {
	        gvs.remove(encontrado);
	        ui.exibirSRvdd();
	    } else {
	        ui.exibirRRvdd();
	    }
	}
	
	public void listarVendedores () { // Listar vendedores cadastrado no sistema
		
		System.out.println("╔═══════════════════════════════════════╗");
		System.out.println("   VENDEDORES CADASTRADO NO SISTEMA 🔍 \n");
		
		for(Vendedor i : gvs) {
			
			System.out.println("   NOME: " + i.getNome());
	        System.out.println("   CPF: " + i.getCpf());
	        System.out.println("   CRB: " + i.getCrb()+"\n");
	       
		}
		
		System.out.println("╚═══════════════════════════════════════╝");
	}
	
	// getts e setts
	
	public List<Vendedor> getGvs() {
		return gvs;
	}
	public void setGvs(List<Vendedor> gvs) {
		this.gvs = gvs;
	}

	
	
}
