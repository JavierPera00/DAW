import java.util.Random;
import java.util.Scanner;

public class depuraciónej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese cuántas veces desea lanzar el dado");
		Integer n=scanner.nextInt();
		
		for(int i=1;i<n+1;i++) {
	
		Random random = new Random();
		Integer aleatorio= random.nextInt(1,7);
		
		
		System.out.println("Lanzamiento dado "+ i+ "= "+ aleatorio);
		if (aleatorio%2==0){
			aleatorio= aleatorio*2;
			System.out.println("Si es par doblas el "+ aleatorio);
			}
		if (aleatorio%2==1){
			aleatorio=aleatorio-1;
			System.out.println("Si es impar restas 1 "+ aleatorio);
		
			}
		}
		
		

		scanner.close();
	}

}