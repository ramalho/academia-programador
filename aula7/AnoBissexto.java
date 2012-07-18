import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		int ano;
		Scanner console = new Scanner(System.in);
		System.out.print("Informe o ano (AAAA): ");
		ano = console.nextInt();
		boolean ehBissexto = (ano % 400 == 0) || 
		                     ( (ano % 4 == 0) && (ano % 100 != 0) );
		if (ehBissexto) {
			System.out.println("O ano "+ano+" é bissexto.");
		} else {
			System.out.println("O ano "+ano+" não é bissexto.");
		}
	}
}
