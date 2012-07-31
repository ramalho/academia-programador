
import java.util.Scanner;

public class ExemploUsoArquivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        montaMenu();
        int opcao = teclado.nextInt();
        while (opcao != 3) {
            switch (opcao) {
                case 1:
                    System.out.println("-- Inserindo clientes no arquivo --------");
                    System.out.println("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.println("CPF: ");
                    String cpf = teclado.nextLine();
                    // grava dados no arquivo
                    grava(nome, cpf);
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println("-- Listando clientes do arquivo ---------");
                    // Le dados do arquivo
                    lista();
                    System.out.println("-----------------------------------------");
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }
            montaMenu();
            opcao = teclado.nextInt();
        }
    }

    static void montaMenu() {
        // monta menu de opcoes
        System.out.println("");
        System.out.println("1 - Novo cliente");
        System.out.println("2 - Lista clientes");
        System.out.println("3 - Finalizar");
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
        while ((linha = Arquivo.lerLinha(a)) != null) {
            String[] dados = Arquivo.separaTokens(linha, "|");
            System.out.println("Cliente: " + dados[1] + ", CPF: " + dados[0]);
        }
        Arquivo.fechar(a);
    }
}
