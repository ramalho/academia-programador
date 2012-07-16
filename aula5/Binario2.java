public class Binario2 {
	public static void main(String[] args) {
		long q = 0;
		String binario = "";
		boolean erro = false;
		try {
			q = Long.parseLong(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			erro = true;
		}
		catch (NumberFormatException e) {
			erro = true;
		}
		if (erro) {
			System.out.println("Digite um número na linha de comando");
			System.exit(-1);
		}
		System.out.println("decimal: " + q);
		while (q >= 2) {
			long resto = q % 2;
			q = q / 2;
			binario = resto + binario;
		}
		binario = q + binario;
		System.out.println("binario: " + binario);		
	}
}
