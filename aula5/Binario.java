public class Binario {
	public static void main(String[] args) {
		int q = 15;
		String binario = "";
		System.out.println("decimal: " + q);
		while (q >= 2) {
			int resto = q % 2;
			q = q / 2;
			binario = resto + binario;
		}
		binario = q + binario;
		System.out.println("binario: " + binario);		
	}
}
