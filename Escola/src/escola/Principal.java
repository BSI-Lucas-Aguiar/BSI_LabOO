package escola;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Lucas");
		Aluno aluno2 = new Aluno("João");
		Aluno aluno3 = new Aluno("Maria");

		Professor professor1 = new Professor("Mark Douglas", 100000);
		Professor professor2 = new Professor("Fábio Duncan", 50000);
		
		GrupoDeEstudo grupo1 = new GrupoDeEstudo("Grupo Lab OO", "Grupo de Estudo da Disciplina", aluno1, professor1);
		
		//Mudando o CR
		
		aluno1.setCR(7.2);
		aluno2.setCR(5.5);
		aluno3.setCR(9);
		
		//Adição no Grupo de Estudo
		grupo1.adicionarAluno(aluno1);
		grupo1.adicionarAluno(aluno2);
		grupo1.adicionarAluno(aluno3);
		
		Aluno alunoMaiorCR = grupo1.getAlunoDeMaiorCR();
		System.out.println(alunoMaiorCR.getNome());
		if(grupo1.getResponsavel() instanceof Professor) {
			System.out.println("O responsável é um professor");
			Pessoa professorResponsavel = grupo1.getResponsavel();
			double salario = getRemuneracao(professorResponsavel);
		}else if(grupo1.getResponsavel() instanceof Aluno) {
			System.out.println("O responsável é um aluno");
			Pessoa alunoResponsavel = grupo1.getResponsavel();
		}
		
	}

}
