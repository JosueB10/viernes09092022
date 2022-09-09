package estructuraspostprueba;

public class EstructuraDoWhile {

	public static void main(String[] args) { 
	int num =5;
	System.out.println("Ciclo While ");
	
	
	while(num<10) {
		num++;
		System.out.println("Num = "+num);	
	}

	//Con el Do-While
	System.out.println("Ciclo Do-While");
	
	do {
		num++;
		System.out.println("Num= "+num);
	}while(num < 10);
	
	
	
	System.out.println("Fin del programa :D");
	}

}
