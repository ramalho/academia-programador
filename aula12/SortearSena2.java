/* sorteia 6 dezenas para a Sena (1 a 60) */
/* usando UtilitariosVetores */

public class SortearSena2 {
	static final int NUM_DEZENAS = 6;
	public static void main(String [] args) {
		int[] dezenas = new int[NUM_DEZENAS];
		int sorteio;
		boolean repetido;
		for (int i = 0; i < NUM_DEZENAS; i++) {
			do {
				sorteio = (int)(Math.random() * 60) + 1;
				repetido = false;
				if (UtilitariosVetores.buscar(dezenas, sorteio) >= 0) {
					repetido = true;
				}					
			} while (repetido);
			dezenas[i] = sorteio;
		}
		UtilitariosVetores.ordenar(dezenas);
		System.out.print("Dezenas: ");
		UtilitariosVetores.exibir(dezenas);
	}
}
