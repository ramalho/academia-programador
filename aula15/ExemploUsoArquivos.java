
import java.util.Scanner;

public class ExemploUsoArquivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String linhaOpcao;
        char opcao;
        do {
            montaMenu();
			linhaOpcao = teclado.nextLine();
			opcao = linhaOpcao.charAt(0);
            switch (opcao) {
                case '1':
                    System.out.println("-- Inserindo clientes no arquivo --------");
                    System.out.println("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("CPF: ");
                    String cpf = teclado.nextLine();
                    // grava dados no arquivo
                    grava(nome, cpf);
                    regrava();
                    System.out.println("-----------------------------------------");
                    break;
                case '2':
                    System.out.println("-- Listando clientes do arquivo ---------");
                    // Le dados do arquivo
                    lista();
                    System.out.println("-----------------------------------------");
                    break;
                case '3':
                    System.out.println("-- Apagando cliente do arquivo --------");
                    System.out.println("Codigo do cliente: ");
                    int idCliente = teclado.nextInt();
                    String lixo = teclado.nextLine();
                    // regrava arquivo sem o cliente escolhido 
                    remove(idCliente);
                    System.out.println("-----------------------------------------");
                    break;
                case '0':
					break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }
        } while (opcao != '0'); 
    }

    static void montaMenu() {
        // monta menu de opcoes
        System.out.println("");
        System.out.println("1 - Novo cliente");
        System.out.println("2 - Lista clientes");
        System.out.println("3 - Apagar cliente");
        System.out.println("0 - Finalizar");
        System.out.println("Digite a opcao desejada: ");
        System.out.println("");
    }

    static void grava(String nome, String cpf) {
        Arquivo a = Arquivo.abrirEscrita("clientes.txt", "append");
        Arquivo.escrever(a, cpf + "|" + nome);
        Arquivo.fechar(a);
    }

    static void lista() {
        Arquivo a = Arquivo.abrirLeitura("clientes.txt");
        String linha;
        int idCliente = 1;
        while ((linha = Arquivo.lerLinha(a)) != null) {
            String[] dados = Arquivo.separaTokens(linha, "|");
            System.out.println(idCliente + " Nome: " + dados[1] + ", CPF: " + dados[0]);
            idCliente++;
        }
        Arquivo.fechar(a);
    }

	static void regrava() {
        Arquivo original = Arquivo.abrirLeitura("clientes.txt");
        Arquivo backup = Arquivo.abrirEscrita("clientes.bkp", "truncate");
        String linha;
        while ((linha = Arquivo.lerLinha(original)) != null) {
			Arquivo.escrever(backup, linha);
		}
		Arquivo.fechar(original);
		Arquivo.fechar(backup);
	}

	static void remove(int idClienteRemover) {
		regrava(); // garantir que existe um backup completo
        Arquivo antigo = Arquivo.abrirLeitura("clientes.bkp");
        Arquivo novo = Arquivo.abrirEscrita("clientes.txt", "truncate");
        String linha;
        int idCliente = 1;
        while ((linha = Arquivo.lerLinha(antigo)) != null) {
			if (idCliente != idClienteRemover) {
				Arquivo.escrever(novo, linha);
			}
			idCliente++;
		}
		Arquivo.fechar(antigo);
		Arquivo.fechar(novo);
	}
}















