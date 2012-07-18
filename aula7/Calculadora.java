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
		
		switch (operacao) {
			case '+':
				resultado = x + y;
				System.out.println("Resultado: "+resultado);
				break;
			case '-':
				resultado = x - y;
				System.out.println("Resultado: "+resultado);
				break;
			case '*':
				resultado = x * y;
				System.out.println("Resultado: "+resultado);
				break;
			case '/':
				resultado = x / y;
				System.out.println("Resultado: "+resultado);
				break;
			default:
				System.out.println("Operação inválida");
		}
	}
}
