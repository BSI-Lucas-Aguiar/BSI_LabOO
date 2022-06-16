package geometria;

//Value Object
public class CoordenadaCartesiana extends Ponto{

	public CoordenadaCartesiana(int x, int y) {
		super(x, y);
	}
	
	public void exibir() {
		System.out.println("("+this.x()+","+this.y()+")");
	}
}
