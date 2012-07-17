import java.util.Scanner;

public class CalcularAnoNascimento {
    public static void main(String [] args) {
        String nome;
        byte idade;
        int anoNascimento;
        int diasVividos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com seu nome:");
        nome = teclado.nextLine();
        System.out.println(nome + ", entre com sua idade:");
        idade = teclado.nextByte();
        anoNascimento = 2012 - idade;
        System.out.println("Olá "+nome+", você nasceu por volta de "+anoNascimento);
        diasVividos = idade * 365;
        System.out.println("e já viveu aproximadamente "+ diasVividos + " dias.");
    }
}