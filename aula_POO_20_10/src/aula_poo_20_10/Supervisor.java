package aula_poo_20_10;

public class Supervisor extends Funcionario implements ValorPlanoSaude{
		private String setor;
		
		public String getSetor(){
			return setor;
		}
		public void setSetor(String setor){
			this.setor = setor;
		}

    @Override
    public void extraPlanoSaude() {
        System.out.println("Possui Plano de Saude");
                }
    @Override
    public void extraPlanoOdonto() {
        System.out.println("Possui Plano Odonto");
    }
	}