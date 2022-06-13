package escola;

public class Aluno extends Pessoa{
	
	private double CR;

	public double getCR() {
		return CR;
	}

	public void setCR(double cR) {
		CR = cR;
	}

	public Aluno(String nome, double cR) {
		super(nome);
		CR = cR;
	}
	
	
}
