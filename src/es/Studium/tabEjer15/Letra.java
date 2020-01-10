package es.Studium.tabEjer15;
/**
 *Letra por posición - Realizar un programa en JAVA que lea una matriz 3x3 de caracteres y nos muestre en otra tabla la posición en el abecedario de cada letra introducida.
 */
import java.util.Scanner;

public class Letra 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char tabla1[][] = new char[3][3];
		int tabla2[][]= new int [3][3];
		Scanner teclado = new Scanner(System.in);
		
	
		
		introducirMatriz(tabla1, teclado);
		
		convertirAscii(tabla1, tabla2);
		
		imprimirOrden(tabla2);
		teclado.close();
	}


	/**
	 * @param tabla2
	 */
	private static void imprimirOrden(int[][] tabla2) {
		int i, e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//Verificamos que sean caracteres de letras
				if ((tabla2[i][e]>=97)&&(tabla2[i][e]<=122))//Si es minusculas imprimira por este codigo
				{
					System.out.print((tabla2 [i][e]-96)+" ");
				}
				else if((tabla2[i][e]>=65)&&(tabla2[i][e]<=90))//Si es mayusculas imprimira por este codigo
				{
					System.out.print((tabla2 [i][e]-64)+" ");
				}
				else //si no son ninguno de los caracteres anteriores, mostrara el siguiente mensaje de error
				{
					System.out.print("Error, tiene que introducir un valor de a-z o A-Z");
				}
			}
			//Despues de escribir las 3 columnas de cada linea imprimira sun salto de linea
			System.out.println();
		}
	}


	/**
	 * @param tabla1
	 * @param tabla2
	 */
	private static void convertirAscii(char[][] tabla1, int[][] tabla2) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//Convertimos el caracter dado a codigo Ascii y lo guardamos su valor en otra tabla
				
				int asciiValue = (int) tabla1 [i][e];
				tabla2 [i][e] = asciiValue;
			}
		}
	}

	
	private static void introducirMatriz(char[][] tabla1, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir de la tabla 1 el valor " + i + " , " + e + " : ");
				tabla1 [i][e] = teclado.next().charAt(0);
			}
		}
	}

}
