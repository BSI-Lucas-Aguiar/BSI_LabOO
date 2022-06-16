package escola;

import java.util.ArrayList;
import java.util.Iterator;

public class GrupoDeEstudo {

	private String nome;
	private String descricao;
	private Professor orientador;
	private Pessoa responsavel;
	
	//Lista para conter os alunos no grupo
	private ArrayList<Aluno> grupoListaAlunos = new ArrayList<Aluno>();
	
	//Iterador de Alunos
	Iterator<Aluno> iteradorAlunos = grupoListaAlunos.iterator();
	    
	//Construtor
	public GrupoDeEstudo(String nome, String descricao, Pessoa responsavel, Professor orientador) {
		super();
		if (responsavel == null)
			throw new IllegalArgumentException("Nao pode ser null!");
		if (orientador == null)
			throw new IllegalArgumentException("Nao pode ser null!");
		this.nome = nome;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.orientador = orientador;
	}

	//Set e Get Nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Get e set Descricao
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Get e Set Responsável
	public Pessoa getResponsavel() {
		return this.responsavel;
	}
	
	public void setResponsavel(Pessoa pessoa) {
		this.responsavel = pessoa;
	}
	
	//Adicionar e Remover Aluno
	public void adicionarAluno(Aluno aluno) {
		grupoListaAlunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		grupoListaAlunos.remove(aluno);
	}
	
	//Retornar Alunos
	public Iterator<Aluno> getAlunos() {
		return iteradorAlunos;
	}
	
	//Get e Set Orientador
	public Professor getOrientador() {
		return this.orientador;
	}
	
	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}
	
	//Verificacao do Aluno de Maior CR
	public Aluno getAlunoDeMaiorCR() {
		double maiorCR = 0;
		int posicaoMaiorCR = 0;
		Aluno alunoAtual;
		for(int i = 0; i < grupoListaAlunos.size(); i++) {
			alunoAtual = grupoListaAlunos.get(i);
			if(alunoAtual.getCR() >= maiorCR) {
				maiorCR = alunoAtual.getCR();
				posicaoMaiorCR = i;
			}
		}
		return grupoListaAlunos.get(posicaoMaiorCR);
	}
}
