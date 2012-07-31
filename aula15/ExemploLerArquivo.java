public class ExemploLerArquivo {
	public static void main(String [] args) {
		Arquivo meuArquivo = Arquivo.abrirLeitura("teste.txt");
		String linha = Arquivo.lerLinha(meuArquivo);
		while (linha != null) {
			System.out.println(linha);
			linha = Arquivo.lerLinha(meuArquivo);
		}
		Arquivo.fechar(meuArquivo);
	}
}
