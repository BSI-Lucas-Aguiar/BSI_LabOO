package escola;

public class Professor extends Pessoa{

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Professor(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	
	public double getRemuneracao() {
		return this.getSalario();
	}

}
