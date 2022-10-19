import java.util.Scanner;

public class Start {
	public static boolean checkIfPrime(int number) {
		 
		boolean primo = true;
 
		for (int divisor = number - 1; divisor > 1; divisor--) {
			int result = number % divisor;
 
			if (result == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		Scanner dataInput = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		n = dataInput.nextInt();
		dataInput.close();
 
		if (checkIfPrime(n)) {
			System.out.print("El número " + n + " es primo.");
		} else {
			System.out.print("El número " + n + " no es primo.");
		}

	}

	
	
	
	
}
