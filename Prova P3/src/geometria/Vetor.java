package geometria;

//Value Object
public class Vetor extends Ponto{
	
	public Vetor(int x, int y) {
		super(x, y);
	}
	
	public void exibir() {
		//Diferencia��o para exibi��o com '+'
		if(this.y() >= 0) {
			System.out.println(this.x()+"i+"+this.y()+"j");
		}else if(this.y() < 0) {
			System.out.println(this.x()+"i"+this.y()+"j");
		}
		
	}
}
