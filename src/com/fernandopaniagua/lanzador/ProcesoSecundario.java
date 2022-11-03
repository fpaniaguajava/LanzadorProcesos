package com.fernandopaniagua.lanzador;

public class ProcesoSecundario {

	public static void main(String[] args) {
		System.out.println("Iniciando el proceso secundario...");
		if (args[0].equals("correcto")) {
			System.exit(0);
		} else if (args[0].equals("error")){
			System.exit(-1);
		} else {
			System.exit(-2);
		}
	}
}
