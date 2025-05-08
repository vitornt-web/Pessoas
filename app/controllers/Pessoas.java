package controllers;

import models.Pessoa;
import play.mvc.Controller;

public class Pessoas extends Controller {
	
	public static void form() {
		render(); 
	}
	
	public static void listar() {
		render();
	}
  
	public static void detalhar(Pessoa pes){
		render(pes);
	}
	
	public static void salvar(Pessoa pes) {
		if(pes.nome != null) {
			pes.nome = pes.nome.toUpperCase();
		}
		if(pes.email != null) {
			pes.email = pes.email.toLowerCase();
		}
		
		pes.save();
		detalhar(pes);
	}
}
