package diagrama.de.flujo.rec;

import java.util.Scanner;

public class MainDiagramaFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Programa de figuras, seleccione una figura: ");
		System.out.println("1. Imagen triangulo");
		System.out.println("2. Salir");
	
		int opcion=teclado.nextInt();
		
		while (opcion==1) {
			
			System.out.println("Ingrese dimensiones del triangulo: ");
			int dimension=teclado2.nextInt();
			
			if (dimension>=1) {

				for (int alt = 1; alt <= dimension; alt++){
					
					for (int i = dimension; i >= alt; i--){
						System.out.print(" ");
					}
					for(int ast=1;ast<=alt; ast++){
						
		                System.out.print("*");
					}
					System.out.println();
				}
				
			}else {
				System.out.println("Dimensiones incorrectas");
			}
		}
	}
}
