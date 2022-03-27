package biblioteca;

import java.util.Set;

public class Livro extends Publicacao{
	private String ISBN;
	private Set<Autor> autor;

	public Livro(long id, String titulo, int numExemplares, int numExemplaresEmprestados, Area area, String iSBN) {
		super(id, titulo, numExemplares, numExemplaresEmprestados, area);
		this.ISBN = iSBN;
	}

	public void adicionarAutor(Autor autor) {
		this.autor.add(autor);
	}
	
	public void removerAutor(Autor autor) {
		if(this.autor.contains(autor)) {
			this.autor.remove(autor);
		}
		
	}

}
