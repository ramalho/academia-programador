import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y, resultado;
		System.out.println("Entre com o operando 1:");
		x = teclado.nextInt();
		System.out.println("Entre com o operando 2:");
		y = teclado.nextInt();
		char operacao;
		System.out.println("Entre com a operação + - * /:");
		operacao = teclado.next().charAt(0);
		boolean ok = true;
		switch (operacao) {
			case '+':
				resultado = x + y;
				break;
			case '-':
				resultado = x - y;
				break;
			case '*':
				resultado = x * y;
				break;
			case '/':
				resultado = x / y;
				break;
			default:
				resultado = 0;
				ok = false;
		}
		if (ok) {
			System.out.println("Resultado: "+resultado);
		} else {
			System.out.println("Operação inválida");
		}
	}
}
