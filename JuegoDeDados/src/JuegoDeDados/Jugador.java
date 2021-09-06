package JuegoDeDados;

public class Jugador {
	String nombre;
	int puntaje;
	Jugador(){
		
	}
	Jugador(String n){
		this.nombre = n;
		this.puntaje = 0;
	}
	public void aumentarPuntaje() {
		puntaje +=1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public String toString() {
		return ("El ganador es..."+this.nombre);
	}
}
