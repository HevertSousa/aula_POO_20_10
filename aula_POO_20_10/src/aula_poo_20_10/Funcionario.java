package aula_poo_20_10;

public class Funcionario{
		private String matricula, nome;
		private double salario, horaExtra;
		
		public String getMatricula(){
			return matricula;
		}
		public String getNome(){
			return nome;
		}
		public double getSalario(){
			return salario;
		}
		public double getHoraExtra(){
			return horaExtra;
		}
		public void setMatricula(String matricula){
			this.matricula = matricula;
		}
		public void setNome(String nome){
			this.nome = nome;
		}
		public void setSalario(double salario){
			this.salario = salario;
		}
		public void setHoraExtra(double horaExtra){
			this.horaExtra = horaExtra;
		}
		
		public double calcularSalario(){
			double totalSalario = this.getSalario()+(this.horaExtra*10);
			
			return totalSalario;
		}
                    
	}