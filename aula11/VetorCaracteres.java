public class VetorCaracteres {
	public static void main(String [] args) {
		char[] letras = new char[26];
		char letra = 'A';
		for (int posicao = 0; posicao < 26; posicao++) {
			letras[posicao] = letra;
			letra++;
		}
		// uma vez preenchido o vetor, agora vamos exibí-lo
		for (int posicao = 0; posicao < 26; posicao++) {
			System.out.println("letras["+posicao+"] = "+letras[posicao]);
		}
	}
}
