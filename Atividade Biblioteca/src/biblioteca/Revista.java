package biblioteca;

public class Revista extends Publicacao{
	
	private int periodicidadeEmdias;

	public Revista(long id, String titulo, int numExemplares, int numExemplaresEmprestados, Area area,
			int periodicidadeEmdias) {
		super(id, titulo, numExemplares, numExemplaresEmprestados, area);
		this.periodicidadeEmdias = periodicidadeEmdias;
	}
	
	

}
