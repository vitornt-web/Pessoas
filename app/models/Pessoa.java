package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Pessoa extends Model {
  
	public String nome;
	public String email;
	public Integer quant;
	
	@ManyToOne
	public Departamento departamento;
}
