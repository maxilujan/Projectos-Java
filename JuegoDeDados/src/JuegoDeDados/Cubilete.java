package JuegoDeDados;

import java.util.ArrayList;


public class Cubilete {
	ArrayList<Dado> dados;
	int cara;
	Cubilete(int c){
		dados = new ArrayList<Dado>() ;
		this.cara = c;
	}
	public ArrayList<Dado> getCubilete(){
		ArrayList<Dado> auxiliar = new	ArrayList<Dado>();
		auxiliar = this.dados;
		return auxiliar;
	}
	public void addDado(Dado d) {
		if (d.getNumerodecaras() == this.cara) {
			dados.add(d);
		}
	}
	public int getCaras() {
		return cara;
	}
	public void setCaras(int caras) {
		this.cara = caras;
	}
	public int tirarDados() {
		int pj = 0;
		for (int i = 0; i < dados.size();i++) {
			dados.get(i).Girar();
			pj = pj + dados.get(i).getCara();
		}
		return pj;
	}
}
