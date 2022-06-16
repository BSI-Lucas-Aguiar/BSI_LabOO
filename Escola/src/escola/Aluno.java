package escola;

public class Aluno extends Pessoa{
	
	private double CR;

	public double getCR() {
		return CR;
	}

	public void setCR(double cR) {
		if (cR < 0 || cR >10)
			throw new IllegalArgumentException("Fora do valor permitido");
		CR = cR;
	}

	public Aluno(String nome) {
		super(nome);
		this.CR = 0;
	}

	@Override
	public double getRemuneracao(Pessoa pessoa) {
		return 0;
	}
	
	
}
