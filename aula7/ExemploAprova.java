import java.util.Scanner;

public class ExemploAprova {
	public static void main(String[] args) {
		double p1;
		double p2;
		double media;
		Scanner console = new Scanner(System.in);
		System.out.print("Informe a nota da prova P1: ");
		p1 = console.nextDouble();
		System.out.print("Informe a nota da prova P2: ");
		p2 = console.nextDouble();
		media = (p1 + p2) / 2;
		System.out.println("Media: "+media);
		if (media >= 5) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado...");
		}
	}
}
