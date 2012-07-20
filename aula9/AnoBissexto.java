import java.util.Scanner;

public class AnoBissexto {
	static boolean isLeapYear(int year) {
		if ( (year % 400 == 0) || 
		     ( (year % 4 == 0) && (year % 100 != 0) ) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int anoUsuario;
		Scanner console = new Scanner(System.in);
		System.out.print("Informe o ano (AAAA): ");
		anoUsuario = console.nextInt();
		if (isLeapYear(anoUsuario) ) {
			System.out.println("O ano "+anoUsuario+" é bissexto.");
		} else {
			System.out.println("O ano "+anoUsuario+" não é bissexto.");
		}
	}
}
