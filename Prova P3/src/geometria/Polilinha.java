package geometria;

import java.util.ArrayList;

public class Polilinha{

	private ArrayList<Ponto> listaPontos = new ArrayList<Ponto>();
	
	public Polilinha() {
		
	}
	
	public void adicionarPonto(Ponto p) {
		listaPontos.add(p);
	}
	
	public void exibir() {
		Ponto pontoAtual;
		for(int i = 0; i< listaPontos.size(); i++) {
			pontoAtual = listaPontos.get(i);
			pontoAtual.exibir();
		}
	}
	
	public float comprimento() {
		float somaDistancias = 0;
		Ponto pontoAtual;
		for(int i = 0; i< listaPontos.size(); i++) {
			pontoAtual = listaPontos.get(i);
			if(i < listaPontos.size()-1) {
				Ponto proximoPonto = listaPontos.get(i+1);
				somaDistancias = somaDistancias + pontoAtual.distancia(proximoPonto);
			}
		}
		
		return somaDistancias;
	}
	
}
