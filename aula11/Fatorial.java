import java.util.Scanner;

public class Fatorial {
	static int fatorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fatorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		int numero;
		Scanner console = new Scanner(System.in);
		System.out.print("Digite um número inteiro positivo: ");
		numero = console.nextInt();
		System.out.println(numero+"! = "+fatorial(numero));
	}
}
