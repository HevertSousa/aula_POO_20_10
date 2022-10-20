package aula_poo_20_10;

public class Aplicacao{
		
		public static void main(String[] args){
			
			Funcionario f = new Funcionario();
			Funcionario s = new Supervisor();
			Funcionario g = new Gerente();
			
			g.setSalario(1000.0);
			g.setHoraExtra(100.0);
			f.setSalario(2000.0);
			s.setHoraExtra(200);	
	}

}