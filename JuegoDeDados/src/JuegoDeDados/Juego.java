package JuegoDeDados;

public class  Juego{
	Cubilete cub;
	Jugador jugadoruno;
	Jugador jugadordos;
	int rondas;
	
	Juego(){
		
	}
	Juego(Cubilete c,Jugador j1,Jugador j2,int r){
		this.cub = c;
		this.jugadoruno = j1;
		this.jugadordos = j2;
		this.rondas = r;
	}
	void jugar() {
		int puntajetemporaljp1 = 0;
		int puntajetemporaljp2 = 0;
		for (int i =0;i < rondas;i++) {
			puntajetemporaljp1 = cub.tirarDados();
			//System.out.print(puntajetemporaljp1+"-");
			puntajetemporaljp2 = cub.tirarDados();
			//System.out.println(puntajetemporaljp2);
			
			  if (puntajetemporaljp2 < puntajetemporaljp1) {
				  jugadoruno.aumentarPuntaje();
			  } else if (puntajetemporaljp2 > puntajetemporaljp1){
				  jugadordos.aumentarPuntaje();
			  }
			//System.out.println("-------------------------------------------------------------------");
		}
	}
	public Jugador ganador() {
		if (jugadoruno.getPuntaje() > jugadordos.getPuntaje()) {
			return jugadoruno;
		} else if (jugadoruno.getPuntaje() < jugadordos.getPuntaje()) {
			return jugadordos;
		} else return null;
	}
}
