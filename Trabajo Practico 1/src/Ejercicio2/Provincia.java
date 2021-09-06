package Ejercicio2;

import java.util.ArrayList;

public class Provincia {
	ArrayList<Ciudad> ciudades;
	public Provincia() {
		ciudades = new ArrayList<Ciudad>();
	}
	public void addCiudad(Ciudad c) {
		if (!ciudades.contains(c))
			ciudades.add(c);
	}
	public ArrayList<Ciudad> getCiudades(){
		ArrayList<Ciudad> auxiliar = new ArrayList<Ciudad>();
		auxiliar = ciudades;
		return auxiliar;
	}
	public boolean mayoriaEnDeficit() {
		int contadorciudades = 0;
		int contadordeciudadesendeficit =0;
		  for (int i = 0;i < this.ciudades.size();i++) {
		    Ciudad aux = ciudades.get(i);
		      if (aux.gastaMasDeLoQueRecauda() == true) {
		    	  contadordeciudadesendeficit += 1;
		      }
		      contadorciudades += 1;
		  }
		  
		  if (contadordeciudadesendeficit >= (contadorciudades/2)) {
			  return true;
		  }
		  return false;
	}
	public ArrayList<Ciudad> ciudadesQueMasGastan(){
		ArrayList<Ciudad> auxiliar = new ArrayList<Ciudad>();
		for (int i = 0;i < ciudades.size();i++) {
			Ciudad c = ciudades.get(i);
			if (c.gastaMasDeLoQueRecauda()) {
				auxiliar.add(c);
			}
		}
		return auxiliar;
	}
	public String toString() {
		String auxiliar = " ";
		for (int i = 0;i < ciudades.size();i++) {
			auxiliar += ciudades.get(i).toString();
		}
		return auxiliar;
	}
}
