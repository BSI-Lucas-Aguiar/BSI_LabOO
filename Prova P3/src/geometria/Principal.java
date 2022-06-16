package geometria;

public class Principal {

	public static void main(String[] args) {
		
		//Criando e mostrando coordenadas cartesianas e vetoriais
		CoordenadaCartesiana coordCart1 = new CoordenadaCartesiana(0, 0);
		CoordenadaCartesiana coordCart2 = new CoordenadaCartesiana(-1, 1);
		CoordenadaCartesiana coordCart3 = new CoordenadaCartesiana(1, 0);
		
		System.out.println("Coordenadas Cartesianas:");
		coordCart1.exibir();
		coordCart2.exibir();
		coordCart3.exibir();
		
		Vetor coordVetor1 = new Vetor(5,1);
		Vetor coordVetor2 = new Vetor(11,7);
		Vetor coordVetor3 = new Vetor(-2,4);
		
		System.out.println("Coordenadas Vetoriais:");
		coordVetor1.exibir();
		coordVetor2.exibir();
		coordVetor3.exibir();
		
		//Calculando a distancia entre dois pontos
		System.out.println("Distancia entre ponto cartesiano 1 e vetor 1:");
		System.out.println(coordCart1.distancia(coordVetor1));
		
		//Criando uma polilinha e adicionando valores Cartesianos
		Polilinha polilinha1 = new Polilinha();
		polilinha1.adicionarPonto(coordCart1);
		polilinha1.adicionarPonto(coordCart2);
		polilinha1.adicionarPonto(coordCart3);
		
		//Exibindo os pontos da polilinha cartesiana
		System.out.println("Pontos da Polilinha Cartesiana:");
		polilinha1.exibir();
		
		//Exibindo a distancia da polilinha cartesiana
		System.out.println("Comprimento da Polilinha cartesiana");
		System.out.println(polilinha1.comprimento()); 
		
		//Criando uma polilinha e adicionando valores Cartesianos
		Polilinha polilinha2 = new Polilinha();
		polilinha2.adicionarPonto(coordVetor1);
		polilinha2.adicionarPonto(coordVetor2);
		polilinha2.adicionarPonto(coordVetor3);
		
		//Exibindo os pontos da polilinha cartesiana
		System.out.println("Pontos da Polilinha vetorial:");
		polilinha2.exibir();
				
		//Exibindo a distancia da polilinha cartesiana
		System.out.println("Comprimento da Polilinha vetorial");
		System.out.println(polilinha2.comprimento()); 
		
	}

}
