import java.util.Random;

public class ruleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Random random = new Random();

	        // Simular el giro de la ruleta generando un número aleatorio entre 0 y 36
	        int numeroGanador = random.nextInt(37);

	        // Imprimir el número ganador
	        System.out.println("La bola ha caído en el número: " + numeroGanador);

	        // Determinar si el número es par o impar
	        if (numeroGanador == 0) {
	            System.out.println("¡Es un cero!");
	        } else if (numeroGanador % 2 == 0) {
	            System.out.println("Es un número par.");
	        } else {
	            System.out.println("Es un número impar.");
	        }

	        // Determinar si el número es rojo o negro (en una ruleta real, algunos números son verdes)
	        if (esRojo(numeroGanador)) {
	            System.out.println("Es un número rojo.");
	        } else {
	            System.out.println("Es un número negro.");
	        }
	    }

	    // Método para determinar si un número en la ruleta es rojo o negro
	    private static boolean esRojo(int numero) {
	        // En una ruleta real, algunos números son verdes, pero aquí simplificamos para rojo o negro
	        return (numero > 0 && numero <= 10 && numero % 2 == 0) ||
	               (numero > 10 && numero <= 18 && numero % 2 != 0) ||
	               (numero > 18 && numero <= 28 && numero % 2 == 0) ||
	               (numero > 28 && numero <= 36 && numero % 2 != 0);
		
		
	}

}
