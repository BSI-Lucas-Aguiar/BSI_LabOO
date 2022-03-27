package biblioteca;

public abstract class Pessoa extends DomainObject{

	private String nome;

	public Pessoa(long id, String nome) {
		super(id);
		this.nome = nome;
	}
	
	
	
}
