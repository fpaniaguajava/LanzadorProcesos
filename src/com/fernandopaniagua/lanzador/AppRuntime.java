package com.fernandopaniagua.lanzador;

import java.io.FileReader;
import java.io.InputStreamReader;

public class AppRuntime {

	public static void main(String[] args) {
		try {
			
			//Nombre del programa sin argumentos
			String infoProceso = "MicrosoftEdge.exe";
			
			//Nombre del programa con argumentos
//			String[] infoProceso = {"notepad.exe","readme.txt"};
			
			//Ruta y nombre del programa con argumentos
//			String[] infoProceso = {
//					"C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe",
//					"https://www.java.com/"
//			};
			
			//Nombre del programa (java), un primer argumento que el nombre de la clase Java
			//que queremos ejecutar y un segundo argumento que se pasa a la clase Java
//			String[] infoProceso = {
//				"java",
//				"com.fernandopaniagua.lanzador.ProcesoSecundario",
//				"correcto"
//			};
			
			//Ejecución de un proceso (python) con argumento			
//			String[] infoProceso = {
//					"python",
//					"procesosecundario.py"
//			};
			
			Process proceso = Runtime.getRuntime().exec(infoProceso);
			int valorRetorno = proceso.waitFor();
			System.out.println(valorRetorno);
			if (valorRetorno==0) {
				System.out.println("Finalización correcta");
			} else {
				System.err.println(String.format("Ha ocurrido un error %d",valorRetorno));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
