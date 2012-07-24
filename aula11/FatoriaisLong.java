public class FatoriaisLong {
	static long fatorial(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fatorial(n-1);
		}
	}
	public static void main(String[] args) {
		long numero;
		long fat = 0;
		long fatAnterior = -1;
		for (numero = 1; fat > fatAnterior; numero++) {
			fatAnterior = fat;
			fat = fatorial(numero);
			if (fat > fatAnterior) {
				System.out.println(numero+"! = "+fat);
			}			
		}		
		System.out.println("Erro: "+fatAnterior+" > "+fat);
	}
}
