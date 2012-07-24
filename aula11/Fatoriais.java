public class Fatoriais {
	static int fatorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fatorial(n-1);
		}
	}
	public static void main(String[] args) {
		int numero;
		for (numero = 1; numero < 21; numero++) {
			System.out.println(numero+"! = "+fatorial(numero));			
		}		
	}
}
