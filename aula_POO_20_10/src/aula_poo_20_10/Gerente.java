package aula_poo_20_10;

public class Gerente extends Funcionario implements ValorPlanoSaude{
		private double bonusCargo;
		
		public double getBonusCargo(){
			return bonusCargo;
		}
		public void setBonusCargo(double bonusCargo){
			this.bonusCargo = bonusCargo;
		}

    @Override
    public void extraPlanoSaude() {
        System.out.println("Recebe Plano Saúde");
    }

    @Override
    public void extraPlanoOdonto() {
        System.out.println("Recebe Plano Odonto");
    }
	}