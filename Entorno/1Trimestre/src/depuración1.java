import java.util.Scanner;

public class depuración1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				// escribir x números aleatorios entre 0 y 100, segun le indiquemos por pantalla, 
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Introduce número:");
				Integer num = scanner.nextInt();
					
				int numeros[]= new int[num];
				for(int i=0;i<numeros.length;i++){
					
					numeros[i]=(int)(Math.random()*100);			
				}	
				
				for(int elem: numeros) {
					System.out.println(elem);
				}
				scanner.close();
			}
	

	}
