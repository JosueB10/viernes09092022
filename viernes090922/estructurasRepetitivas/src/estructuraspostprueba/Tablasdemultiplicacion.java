package estructuraspostprueba;
import java.util.Scanner;

public class Tablasdemultiplicacion {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println(" Bienvenido a las tablas de multiplicar ");
		System.out.println("Tabla de multiplicacion: ");
		byte num = lector.nextByte();
		
		
		
				
		
		
		for (int i = 1; i <=12;i++) {
			
			System.out.println(num+ "x"+ i + "="+num*i);
			
			
			
		}
				
		System.out.println("Fin del programa rey:D");	
		
		lector.close();	
	}

}
