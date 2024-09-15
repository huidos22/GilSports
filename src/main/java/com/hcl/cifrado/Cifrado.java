package com.hcl.cifrado;

public class Cifrado {

	// int array1 [][][] = {{{1,2,3,4},{10,11,12,13},{20,21,22,23}}};

	int array2[][] = { { 1, 2, 3, 4 }, { 10, 11, 12, 13 } };

	// int j [] = {10,11,12,13};

	// int k [] = {20,21,22,23};

	public void recorreArreglo() {

		for (int i = 0; i < array2.length; i++)

		{

			for (int j = 0; j < array2[i].length; j++)

				System.out.println("imprime " + array2[i][j]);

		}

	}

	public String Encriptar(String cadena) {

		// public void Encriptar (String cadena){

		// String cadena = "hola";

		// System.out.print(" el codigo obtenido es ");

		String resultado = "";

		for (int i = 0; i < cadena.length(); i++) {

			switch (cadena.charAt(i)) {

			case 'a':

				resultado = resultado + "001";

				break;

			case 'b':

				resultado = resultado + "002";

				break;

			case 'c':

				resultado = resultado + "003";

				break;

			case 'd':

				resultado = resultado + "004";

				break;

			case 'e':

				resultado = resultado + "005";

				break;

			case 'f':

				resultado = resultado + "006";

				break;

			case 'g':

				resultado = resultado + "007";

				break;

			case 'h':

				resultado = resultado + "008";

				break;

			case 'i':

				resultado = resultado + "009";

				break;

			case 'j':

				resultado = resultado + "010";

				break;

			case 'k':

				resultado = resultado + "011";

				break;

			case 'l':

				resultado = resultado + "012";

				break;

			case 'm':

				resultado = resultado + "013";

				break;

			case 'n':

				resultado = resultado + "014";

				break;

			case 'o':

				resultado = resultado + "015";

				break;

			case 'p':

				resultado = resultado + "016";

				break;

			case 'q':

				resultado = resultado + "017";

				break;

			case 'r':

				resultado = resultado + "018";

				break;

			case 's':

				resultado = resultado + "019";

				break;

			case 't':

				resultado = resultado + "020";

				break;

			case 'u':

				resultado = resultado + "021";

				break;

			case 'v':

				resultado = resultado + "022";

				break;

			case 'w':

				resultado = resultado + "023";

				break;

			case 'x':

				resultado = resultado + "024";

				break;

			case 'y':

				resultado = resultado + "025";

				break;

			case 'z':

				resultado = resultado + "026";

				break;

			default:

				System.out.println("acceso degenado:P ");

				break;

			}

		} // end for

		// System.out.println(" La palabra que ingresaste fue
		// "+cadena.toUpperCase());

		return resultado;

	}

	public String Encriptar2(String cadena) {

		// public void Encriptar2 (String cadena){

		// String cadena = "hola";

		// System.out.print(" la cadena obtenida es "+cadena);

		String resultado2 = "";

		int longitud = (cadena.length() / 3);

		for (int i = 0; i < longitud; i++) {

			String subcadena = cadena.substring(0, 3);

			// String subcadena = "";

			// subcadena = cadena.substring(0, 2);

			if (cadena.length() > 3) {

				cadena = cadena.substring(3);

			}

			else {

				cadena = "";

			}

			if (subcadena.equals("001")) {

				// System.out.print("a");

				resultado2 = resultado2 + "a";

			}

			else if (subcadena.equals("002")) {

				// System.out.print("b");

				resultado2 = resultado2 + "b";

			}

			else if (subcadena.equals("003")) {

				// System.out.print("c");

				resultado2 = resultado2 + "c";

			}

			else if (subcadena.equals("004")) {

				// System.out.print("d");

				resultado2 = resultado2 + "d";

			}

			else if (subcadena.equals("005")) {

				// System.out.print("e");

				resultado2 = resultado2 + "e";

			}

			else if (subcadena.equals("006")) {

				// System.out.print("f");

				resultado2 = resultado2 + "f";

			}

			else if (subcadena.equals("007")) {

				// System.out.print("g");

				resultado2 = resultado2 + "g";

			}

			else if (subcadena.equals("008")) {

				// System.out.print("h");

				resultado2 = resultado2 + "h";

			}

			else if (subcadena.equals("009")) {

				// System.out.print("i");

				resultado2 = resultado2 + "i";

			}

			else if (subcadena.equals("010")) {

				// System.out.print("j");

				resultado2 = resultado2 + "j";

			}

			else if (subcadena.equals("011")) {

				// System.out.print("k");

				resultado2 = resultado2 + "k";

			}

			else if (subcadena.equals("012")) {

				// System.out.print("l");

				resultado2 = resultado2 + "l";

			}

			else if (subcadena.equals("013")) {

				// System.out.print("m");

				resultado2 = resultado2 + "m";

			}

			else if (subcadena.equals("014")) {

				// System.out.print("n");

				resultado2 = resultado2 + "n";

			}

			else if (subcadena.equals("015")) {

				// System.out.print("o");

				resultado2 = resultado2 + "o";

			}

			else if (subcadena.equals("016")) {

				// System.out.print("p");

				resultado2 = resultado2 + "p";

			}

			else if (subcadena.equals("017")) {

				// System.out.print("q");

				resultado2 = resultado2 + "q";

			}

			else if (subcadena.equals("018")) {

				// System.out.print("r");

				resultado2 = resultado2 + "r";

			}

			else if (subcadena.equals("019")) {

				// System.out.print("s");

				resultado2 = resultado2 + "s";

			}

			else if (subcadena.equals("020")) {

				// System.out.print("t");

				resultado2 = resultado2 + "t";

			}

			else if (subcadena.equals("021")) {

				// System.out.print("u");

				resultado2 = resultado2 + "u";

			}

			else if (subcadena.equals("022")) {

				// System.out.print("v");

				resultado2 = resultado2 + "v";

			}

			else if (subcadena.equals("023")) {

				// System.out.print("w");

				resultado2 = resultado2 + "w";

			}

			else if (subcadena.equals("024")) {

				// System.out.print("x");

				resultado2 = resultado2 + "x";

			}

			else if (subcadena.equals("025")) {

				// System.out.print("y");

				resultado2 = resultado2 + "y";

			}

			else if (subcadena.equals("026"))

			{

				// System.out.print("z");

				resultado2 = resultado2 + "z";

			}

		} // end for

		// System.out.print(" el codigo que ingresaste fue "+cadena);

		return resultado2;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// String cadena = "";

		Cifrado recorre1 = new Cifrado();

		// recorre1.recorreArreglo();

		String cadena1 = "hola";

		System.out.println("La cadena es: " + cadena1);

		String resultado1 = recorre1.Encriptar(cadena1);

		System.out.println("El resultado es: " + resultado1);

		String cadena2 = resultado1;

		System.out.println("El codigo es: " + cadena2);

		String resultado2 = recorre1.Encriptar2(cadena2);

		System.out.println("El resultado es: " + resultado2);

		// recorre1.Encriptar2("008015012001");

	}
}