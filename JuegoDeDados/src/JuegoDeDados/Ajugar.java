package JuegoDeDados;

public class Ajugar {

	public static void main(String[] args) {
		Dado d1 = new Dado(6,6);
		Dado d2 = new Dado(6,3);
		Dado d3 = new Dado(6,2);
		Cubilete c1 = new Cubilete(6);
		c1.addDado(d1);
		c1.addDado(d2);
		c1.addDado(d3);
		Jugador nacho = new Jugador("nacho");
		Jugador Agustin = new Jugador("agustin");
		
		Juego j1 = new Juego(c1,nacho,Agustin,5);
		j1.jugar();
		if (j1.ganador() == null) {
			System.out.println("Hay un empate");
		} else {
		    System.out.println(j1.ganador());
		}
	}

}
