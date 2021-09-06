package Ejercicio_3;
import java.math.*;
public class Punto_geometrico {
	double coordenada_x;
	double coordenada_y;
	
	Punto_geometrico(){
		this.coordenada_x = 0;
		this.coordenada_y = 0;
	}
	
	Punto_geometrico(float x,float y){
		this.coordenada_x = x;
		this.coordenada_y = y;
	}

	public double getCoordenada_x() {
		return coordenada_x;
	}

	public void setCoordenada_x(double cordenada_x) {
		this.coordenada_x = cordenada_x;
	}

	public double getCoordenada_y() {
		return coordenada_y;
	}

	public void setCoordenada_y(double cordenada_y) {
		this.coordenada_y = cordenada_y;
	}
	
	public void desplazarCoordenadas(double x,double y) {
		this.coordenada_x += x;
		this.coordenada_y += y;
	}
	public double obtenerDistanciaEuclidea(double x,double y) {
		return (Math.sqrt(this.coordenada_x - x) + Math.sqrt(this.coordenada_y - y));
		
	}
}
