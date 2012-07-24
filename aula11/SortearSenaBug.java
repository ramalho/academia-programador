/* sorteia 6 dezenas, porém pode sortear dezenas repetidas */

public class SortearSenaBug {
	static final int NUM_DEZENAS = 6;
	public static void main(String [] args) {
		int sorteio;
		for (int i = 0; i < NUM_DEZENAS; i++) {
			sorteio = (int)(Math.random() * 60) + 1;
			System.out.println("dezena " + (i+1) + ": " + sorteio);
		}
	}
}
