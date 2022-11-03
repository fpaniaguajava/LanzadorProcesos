package com.fernandopaniagua.lanzador;

public class AppProcessBuilder {

	public static void main(String[] args) {
		try {

			// Nombre del programa sin argumentos
//			String infoProceso = "XboxPcApp.exe";

			// Con argumentos (String...)
//			Process proceso = new ProcessBuilder("notepad.exe","otrofichero.txt").start();
			
			// Nombre del programa con argumentos
//			String[] infoProceso = {"notepad.exe","readmeprocess.txt"};
//			Process proceso = new ProcessBuilder(infoProceso).start();

			ProcessBuilder pb = new ProcessBuilder("notepad.exe");
			for(int i=0;i<5;i++) {
				pb.start();
			}
			
//			int valorRetorno = proceso.waitFor();
//			System.out.println(valorRetorno);
//			if (valorRetorno == 0) {
//				System.out.println("Finalización correcta");
//			} else {
//				System.err.println(String.format("Ha ocurrido un error %d", valorRetorno));
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Nombre del programa con argumentos
//			String[] infoProceso = {"notepad.exe","readme.txt"};

		// Ruta y nombre del programa con argumentos
//			String[] infoProceso = {
//					"C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe",
//					"https://www.java.com/"
//			};

		// Nombre del programa (java), un primer argumento que el nombre de la clase
		// Java
		// que queremos ejecutar y un segundo argumento que se pasa a la clase Java
//			String[] infoProceso = {
//				"java",
//				"com.fernandopaniagua.lanzador.ProcesoSecundario",
//				"correcto"
//			};

		// Ejecución de un proceso (python) con argumento
//			String[] infoProceso = {
//					"python",
//					"procesosecundario.py"
//			};

	}

}
