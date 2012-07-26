public class UtilitariosVetores {

	public static void exibir(int[] vetor) {
		System.out.print("{");
		for (int i=0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if (i != (vetor.length-1)) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
	
	public static void ordenar(int[] vetor) {
		boolean houveTroca;
		int temp;
		do {
			houveTroca = false;
			for (int i = 0; i < (vetor.length - 1); i++) {
				if (vetor[i] > vetor[i+1]) {
					temp = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = temp;
					houveTroca = true;
				}
			}
		} while (houveTroca);
	}
	
	public static int buscar(int[] vetor, int procurado) {
		for (int posicao = 0; posicao < vetor.length; posicao++) {
			if (procurado == vetor[posicao]) {
				return posicao;
			}  
		}
		return -1;
	}	
	
	public static void main(String[] args) {
		//                 |0   |1   |2   |3   |4
		int[] vetorTeste = {25,  5,   10,  100, 50};
		exibir(vetorTeste);
		ordenar(vetorTeste);
		exibir(vetorTeste);
		int x = 10;		
		System.out.println("Posicao de "+x+": "+buscar(vetorTeste, x));
		x = 2;
		System.out.println("Posicao de "+x+": "+buscar(vetorTeste, x));		
	}
}
