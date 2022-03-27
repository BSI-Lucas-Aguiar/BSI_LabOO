package biblioteca;

public class Publicacao extends DomainObject{
	
	private String titulo;
	private int numExemplares;
	private int numExemplaresEmprestados;
	private Area area;
	
	public Publicacao(long id, String titulo, int numExemplares, int numExemplaresEmprestados, Area area) {
		super(id);
		this.titulo = titulo;
		this.numExemplares = numExemplares;
		this.numExemplaresEmprestados = numExemplaresEmprestados;
		this.area = area;
	}
	
	public int obterNumExemplaresDisponiveis() {
		return this.numExemplares - this.numExemplaresEmprestados;
	}
	
	public int obterNumExemplares() {
		return this.numExemplares;
	}
	
	public void atualizarNumExemplares(int numExemplares) {
		this.numExemplaresEmprestados = numExemplares;
		
	}
	
	

}
