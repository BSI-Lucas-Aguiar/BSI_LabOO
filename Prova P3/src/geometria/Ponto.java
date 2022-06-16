package geometria;

//Abstract
//ValueObject
public abstract class Ponto {

	private int x;
	private int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
	
	//Método Abstrato Exibir
	public abstract void exibir();
	
	public float distancia(Ponto outro) {
		float distancia = 0;
		
		//Cálculo da Distancia
		distancia = (float) (Math.pow((outro.x() - this.x()), 2))+ (float) (Math.pow((outro.y() - this.y()), 2));
		distancia = (float) Math.sqrt(distancia);
		
		return distancia;
	}
	
	/*
	public boolean equals(Object O) {
		
	}
	
	@Override
	public int hashCode() {
		return this.codigo + this.getClass().hashCode();
	}
	*/
	
	
}
