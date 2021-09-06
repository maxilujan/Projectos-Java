package Ejercicio2;

import java.util.ArrayList;

public class Administracion {

	public static void main(String[] args) {
		
		//Creo las ciudades
		Ciudad olavarria = new Ciudad("olavarria",50,50,60);
		Ciudad tandil = new Ciudad("tandil",100,100,110);
		Ciudad azul = new Ciudad("azul",20,20,10);
		
		Ciudad sl1 = new Ciudad("sl1",80,70,21);
		Ciudad sl2 = new Ciudad("sl2",190,12,100);
		Ciudad sl3 = new Ciudad("sl3",50,50,80);
		
		//Creo las provincias y le agrego las ciudades
		Provincia baires = new Provincia();
		baires.addCiudad(olavarria);
		baires.addCiudad(tandil);
		baires.addCiudad(azul);
		
		Provincia sanluis = new Provincia();
		sanluis.addCiudad(sl1);
		sanluis.addCiudad(sl2);
		sanluis.addCiudad(sl3);
		
		//Creo el pais y le agrego las provincias
		Pais arg = new Pais();
		arg.addProvincia(sanluis);
		arg.addProvincia(baires);
		
		ArrayList<Ciudad> prueba = new ArrayList<Ciudad>();
		
		//Probando el metodo que devuelve una lista de todas las ciudades que gastan mas de lo que recaudan
		prueba = arg.ciudadesQueMasGastan();
		System.out.println(prueba);
		//System.out.println(baires);
		
		/*Probando el metodo que devuelve una lista de las provincias que tienen más de la mitad de las ciudades 
		  en condición de déficit(gastan mas de lo que recaudan)*/
		
		
	}

}
