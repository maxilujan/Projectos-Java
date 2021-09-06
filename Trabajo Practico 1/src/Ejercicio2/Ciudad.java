package Ejercicio2;
/*Un país tiene que controlar el gasto público de las ciudades con más de 100.000 habitantes. 
Para ello, tiene información del monto recaudado por cada ciudad a través de cinco diferentes tipos de 
impuestos (denominados aquí, de imp1, imp2, imp3, imp4 e imp5) 
e información acerca de gastos realizados en mantenimiento de la ciudad. Este país necesita un sistema 
que le informe cuáles son las ciudades que gastan más de lo que recaudan, y las provincias que tienen más 
de la mitad de las ciudades en condición de déficit.
*/
public class Ciudad {
	String nombre;
	int habitantes;
	float montorecaudado;
	float gastosrealizados;
	
	public Ciudad() {
		
	}
	
	public Ciudad(String n,int habitantes, float montorecaudado, float gastosrealizados) {
		super();
		this.nombre = n;
		this.habitantes = habitantes;
		this.montorecaudado = montorecaudado;
		this.gastosrealizados = gastosrealizados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public float getMontorecaudado() {
		return montorecaudado;
	}
	public void setMontorecaudado(float montorecaudado) {
		this.montorecaudado = montorecaudado;
	}
	public float getGastosrealizados() {
		return gastosrealizados;
	}
	public void setGastosrealizados(float gastosrealizados) {
		this.gastosrealizados = gastosrealizados;
	}
	public boolean cantidadCiudades() {
		return (this.habitantes>100000);
	}
	public boolean gastaMasDeLoQueRecauda() {
		return (this.gastosrealizados > this.montorecaudado);
	}
	public String toString() {
		return ("Ciudad: "  + this.nombre + " Habitantes: " + this.habitantes + " ");
	}
	
	
}
