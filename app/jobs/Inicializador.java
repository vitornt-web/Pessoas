package jobs;


import models.Departamento;
import models.Pessoa;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart	
public class Inicializador extends Job{
   
	@Override
	public void doJob() throws Exception{
		if(Pessoa.count() == 0) {
		   Departamento ti = new Departamento("TI", 101);
		   ti.save();
		   Departamento rh = new Departamento("RH", 102);
		   rh.save();
		   Departamento financeiro = new Departamento("Financeiro", 103);
		   financeiro.save();
		   
		   Pessoa pedro = new Pessoa();
		   pedro.nome = "Pedro Neto";
		   pedro.email = "pedroneto1211@gmail.com";
		   pedro.departamento = financeiro;
		}
	}
}
