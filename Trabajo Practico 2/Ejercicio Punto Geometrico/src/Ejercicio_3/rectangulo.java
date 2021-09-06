package Ejercicio_3;
/*
 vertice del 1 al 2 y del 3 al 4 es la base
 vertice del 2 al 3 y del 4 al 1 es la altura
 */
public class rectangulo {
	Punto_geometrico vertice1;
	Punto_geometrico vertice2;
	Punto_geometrico vertice3;
	Punto_geometrico vertice4;
	
	public rectangulo(){
		
	}

	public rectangulo(Punto_geometrico vertice1, Punto_geometrico vertice2, Punto_geometrico vertice3,
			Punto_geometrico vertice4) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
		this.vertice4 = vertice4;
	}
	public void desplazarRectangulo(double x,double y) {
		vertice1.desplazarCoordenadas(x, y);
		vertice2.desplazarCoordenadas(x, y);
		vertice3.desplazarCoordenadas(x, y);
		vertice4.desplazarCoordenadas(x, y);
		
	}
	public double calcularArea() {
		return ((vertice1.obtenerDistanciaEuclidea(vertice2.getCoordenada_x(), vertice2.getCoordenada_y()))*
				(vertice4.obtenerDistanciaEuclidea(vertice1.getCoordenada_x(), vertice1.getCoordenada_y())));
	}
	public double calcularMayor(rectangulo r) {
		if (this.calcularArea()>r.calcularArea()) {
			return 1;
		} else if (this.calcularArea() == r.calcularArea()) {
			return 0;
		} else {
			return -1;
		}
	}
}
