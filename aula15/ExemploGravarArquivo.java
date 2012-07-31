public class ExemploGravarArquivo {
	public static void main(String [] args) {
		Arquivo meuArquivo = Arquivo.abrirEscrita("teste.txt", "truncate");
		Arquivo.escrever(meuArquivo, "Olá, este é meu 2º arquivo.");
		Arquivo.escrever(meuArquivo, "Testando gravação.");
		Arquivo.fechar(meuArquivo);
	}
}
