package controllers;

import java.util.List;

import models.Departamento;
import models.Pessoa;
import play.mvc.Controller;

public class Pessoas extends Controller {
	
	public static void form() {
		List<Departamento> departamentos = Departamento.findAll();
		render(departamentos);
		render(); 
	}
	

	public static void salvar(Pessoa pes) {
		if(pes.nome != null) {
			pes.nome = pes.nome.toUpperCase();
		}
		if(pes.email != null) {
			pes.email = pes.email.toLowerCase();
		}
		
		pes.save();
		listar();
	}
	
	public static void listar() {
		List<Pessoa> lista = Pessoa.findAll();
		int quant = lista.size();
		render(lista, quant);
	}
	
	public static void remover(Long id) {
		Pessoa pes = Pessoa.findById(id);
		pes.delete();
		listar();
		
	}
	
	public static void editar(Long id) {
		Pessoa pes = Pessoa.findById(id);
		List <Departamento> departamentos = Departamento.findAll();
		
		render("@{Pessoas.form}", pes);
	}
}

