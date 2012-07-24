/* sorteia 6 dezenas para a Sena (1 a 60) */

public class SortearSena {
	static final int NUM_DEZENAS = 6;
	public static void main(String [] args) {
		int[] dezenas = new int[NUM_DEZENAS];
		int sorteio;
		boolean repetido;
		for (int i = 0; i < NUM_DEZENAS; i++) {
			do {
				sorteio = (int)(Math.random() * 60) + 1;
				repetido = false;
				for (int j = 0; j < i; j++) {
					if (sorteio == dezenas[j]) {
						repetido = true;
						break;
					}
				}					
			} while (repetido);
			dezenas[i] = sorteio;
		}
		for (int i = 0; i < NUM_DEZENAS; i++) {
			System.out.println("dezena " + (i+1) + ": " + dezenas[i]);
		}
	}
}
