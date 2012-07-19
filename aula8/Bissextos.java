public class Bissextos {
	public static void main(String[] args) {
		System.out.println("Anos bissextos de 1900 a 2000");
		for (int ano = 1900; ano < 2001; ano=ano+4) {
			if ( (ano % 400 == 0) ||
			     ( (ano % 4 == 0) && (ano % 100 != 0) ) ) {
				System.out.println(ano);
			}
		}
	}
}
