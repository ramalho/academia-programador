public class ExemploAbrirArquivo {
	public static void main(String [] args) {
		Arquivo a = Arquivo.abrirEscrita("teste.txt", "new");
		Arquivo.fechar(a);
	}
}
