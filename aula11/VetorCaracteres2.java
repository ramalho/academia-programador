public class VetorCaracteres2 {
	public static void main(String [] args) {
		char[] letras = new char[26];
		for (char letra = 'A'; letra <= 'Z'; letra++) {
			letras[letra-'A'] = letra;
		}
		// uma vez preenchido o vetor, agora vamos exibí-lo
		for (int posicao = 0; posicao < 26; posicao++) {
			System.out.println("letras["+posicao+"] = "+letras[posicao]);
		}
	}
}
