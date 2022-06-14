package escola;

public class Aluno extends Pessoa{
	
	private double CR;

	public double getCR() {
		return CR;
	}

	public void setCR(double cR) {
		CR = cR;
	}

	public Aluno(String nome) {
		super(nome);
		this.CR = 0;
	}

	public double getRemuneracao(){
		return 0;
	}
	
	
}
