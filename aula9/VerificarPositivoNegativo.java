import java.util.Scanner;

public class VerificarPositivoNegativo {
	static boolean ehPositivo(int n) {
		if (n > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int numero;
		Scanner console = new Scanner(System.in);
		System.out.print("Informe um número: ");
		numero = console.nextInt();
		if (ehPositivo(numero)) {
			System.out.println("O número "+numero+" é positivo.");
		} else {
			System.out.println("O número "+numero+" não é positivo.");
		}
	}
}
