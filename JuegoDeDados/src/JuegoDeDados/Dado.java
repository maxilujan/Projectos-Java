package JuegoDeDados;

public class Dado {
	int numerodecaras;
	int cara;
	
	Dado(){
		
	}
	
	Dado(int nrocaras,int c){
		this.cara = c;
		this.numerodecaras = nrocaras;
	}
	public int getNumerodecaras() {
		return numerodecaras;
	}
	public void setNumerodecaras(int numerodecaras) {
		this.numerodecaras = numerodecaras;
	}
	public int getCara() {
		return cara;
	}
	public void setCara(int cara) {
		this.cara = cara;
	}
	public void Girar() {
		cara = (int)((Math.random()*this.numerodecaras)+1);
	}
	
}
