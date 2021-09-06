package Ejercicio2;

import java.util.ArrayList;

public class Pais {
	ArrayList<Provincia> provincias;
	
	public Pais() {
		provincias = new ArrayList<Provincia>();
	}
	public void addProvincia(Provincia p) {
		if (!provincias.contains(p))
			provincias.add(p);
	}
	public ArrayList<Provincia> getProvincias(){
		ArrayList<Provincia> auxiliar = new ArrayList<Provincia>();
		auxiliar = provincias;
		return auxiliar;
	}
	//Calcula las Provincias que tienen mas de la mitad de sus ciudades en deficit
	public ArrayList<Provincia> ProvinciasConCiudadesEnDeficit(){
		ArrayList<Provincia> auxiliar = new ArrayList<Provincia>();
		  for (int i = 0; i < provincias.size();i++) {
			  Provincia p = provincias.get(i);
			  if (p.mayoriaEnDeficit() == true) {
				  auxiliar.add(p);
			  }
		  }
		  return auxiliar;
	}
	//Calcula todas las ciudades que gastan mas de lo que recaudan
	public ArrayList<Ciudad> ciudadesQueMasGastan(){
		ArrayList<Ciudad> auxiliar = new ArrayList<Ciudad>();
		for (int i = 0;i < provincias.size();i++) {
			Provincia p = provincias.get(i);
			auxiliar.addAll(p.ciudadesQueMasGastan());
		}
		return auxiliar;
	}
}
