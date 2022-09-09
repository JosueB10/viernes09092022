
package estructuraspostprueba;
import java.util.Scanner;

public class tablas {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println(" Bienvenido a las tablas de multiplicar ");
		System.out.println("Tabla de multiplicacion: ");
		byte num = lector.nextByte();
		
		
		
				
		
		
		for (int i = 1; i <=num ;i++) {
			for (int j = 1; j <=10 ;j++)
			
			System.out.println(i+ "x"+ j + "="+i*j);
			
			
			
		}
				
		System.out.println("Fin del programa rey:D");	
		
		lector.close();	
	}
}