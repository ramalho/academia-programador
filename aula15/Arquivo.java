
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.StringTokenizer;

/**
 * Classe utilizada para encapsular os recursos da linguagem Java de acesso a
 * arquivos. Esta classe ser� utilizada na Academia do Programador para ensinar
 * os conceitos de abertura/leitura/grava��o/fechamento de arquivos sem entrar
 * nos detalhes de implementa��o em Java.
 * 
 */
public class Arquivo {

    private String nomeArquivo;
    private Reader in;
    private Writer out;
    private BufferedReader leitor;

    /**
     * Construtor para cria��o de um objeto do tipo Arquivo.
     *
     * @param nomeArquivo
     *            nome do arquivo a ser aberto.
     */
    private Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    /**
     * M�todo para abrir um arquivo para leitura.
     *
     * @param nomeArquivo
     *            nome do arquivo a ser aberto
     * @return o arquivo aberto
     */
    public static Arquivo abrirLeitura(String nomeArquivo) {
        Arquivo a;
        try {
            a = new Arquivo(nomeArquivo);
            a.in = new FileReader(new File(nomeArquivo));
            a.leitor = new BufferedReader(a.in);
            log("Arquivo aberto para leitura", nomeArquivo);
        } catch (IOException e) {
            a = null;
            log("Problema ao tentar abrir arquivo para leitura", nomeArquivo);
        }
        return a;
    }

    /**
     * M�todo para abrir arquivo para escrita
     *
     * @param nomeArquivo
     *            nome do arquivo a ser aberto
     * @param operacao
     *            forma de tratamento do arquivo. As possibilidades s�o
     *            <code>"new"</code> - para criar novo arquivo,
     *            <code>"append"</code> - para adicionar ao conte�do j�
     *            existente, e <code>"truncate"</code> - para apagar o conte�do
     *            existente.
     * @return o arquivo aberto
     */
    public static Arquivo abrirEscrita(String nomeArquivo, String operacao) {
        Arquivo a;
        File f = new File(nomeArquivo);
        try {
            a = new Arquivo(nomeArquivo);
            boolean append = false;
            if (operacao.equalsIgnoreCase("new")) {
                f.createNewFile();
            } else if (operacao.equalsIgnoreCase("truncate")) {
                append = false;
            } else if (operacao.equalsIgnoreCase("append")) {
                append = true;
            }
            a.out = new FileWriter(f, append);
            log("Arquivo aberto para escrita", nomeArquivo);
        } catch (IOException e) {
            a = null;
            log("Problema ao tentar abrir arquivo para escrita", nomeArquivo);
        }
        return a;
    }

    /**
     * M�todo para escrita de conte�do no arquivo informado.
     *
     * @param a
     *            arquivo onde o conte�do deve ser escrito
     * @param texto
     *            conte�do a ser escrito
     */
    public static void escrever(Arquivo a, String texto) {
        if (a != null) {
            try {
                BufferedWriter b = new BufferedWriter(a.out);
                b.write(texto);
                b.newLine();
                b.flush();
                log("Texto escrito no arquivo : " + texto, a.nomeArquivo);
            } catch (IOException e) {
                log("Problema ao tentar escrever no arquivo", a.nomeArquivo);
            }
        } else {
            log("Arquivo nao esta aberto para escrita.", "");
        }
    }

    /**
     * M�todo para leitura de linhas do arquivo. Este m�todo l� apenas uma linha
     * por vez. O controle das linhas lidas devem ser feitos pelo programador
     * que ter� que se preocupar com o fim de arquivo.
     *
     * @param a
     *            arquivo a ser lido
     * @return um linha de texto do arquivo.
     */
    public static String lerLinha(Arquivo a) {
        if (a != null) {
            String texto = null;
            try {
                texto = a.leitor.readLine();
            } catch (IOException e) {
                log("Problema ao tentar ler do arquivo", a.nomeArquivo);
            }
            return texto;
        } else {
            log("Arquivo nao esta aberto para leitura.", "");
        }
        return null;
    }

    /**
     * M�todo para fechamento do arquivo informado.
     *
     * @param a
     *            arquivo a ser fechado.
     */
    public static void fechar(Arquivo a) {
        if (a != null) {
            try {
                if (a.in != null) {
                    a.in.close();
                }
            } catch (IOException e) {
                // tratamento de erro para fechamento de arquivo
            }
            try {
                if (a.out != null) {
                    a.out.close();
                }
            } catch (IOException e) {
                // tratamento de erro para fechamento de arquivo
            }
            log("Fechando arquivo", a.nomeArquivo);
        } else {
            log("Arquivo nao esta aberto.", "");
        }
    }

    /**
     * M�todo utilit�rio para separar os tokens de uma linha do arquivo texto
     * usando um delimitador.
     *
     * @param linha
     *            a linha ser separada
     * @param separador
     *            o delimitador de tokens
     * @return um array de Strings com os tokens separados
     */
    public static String[] separaTokens(String linha, String separador) {
        StringTokenizer s = new StringTokenizer(linha, separador);
        String[] tokens = new String[s.countTokens()];
        for (int i = 0; s.hasMoreTokens(); i++) {
            tokens[i] = s.nextToken();
        }
        return tokens;
    }

    /**
     * M�todo para renomear um arquivo
     *
     * @param nomeArquivo1
     *            nome do arquivo a ser renomeado
     * @param nomeArquivo2
     *            novo nome do arquivo
     */
    public static void renomear(String nomeArquivo1, String nomeArquivo2) {
        File f1 = new File(nomeArquivo1);
        if (f1.exists()) {
            File f2 = new File(nomeArquivo2);
            f1.renameTo(f2);
            log("Renomeando arquivo", nomeArquivo1);
        } else {
            log("Arquivo nao existe.", nomeArquivo1);
        }
    }

    /**
     * M�todo para apagar um arquivo.
     *
     * @param nomeArquivo
     *            nome do arquivo a ser apagado.
     */
    public static void apagar(String nomeArquivo) {
        File f = new File(nomeArquivo);
        if (f.exists()) {
            f.delete();
            log("Apagando arquivo.", nomeArquivo);
        }

    }

    /**
     * M�todo de uso interno para log do que est� sendo feito no arquivo. O log
     * sai na console.
     *
     * @param texto
     *            texto a ser logado.
     * @param nomeArquivo
     *            arquivo que est� sendo manipulado.
     */
    private static void log(String texto, String nomeArquivo) {
        System.out.println("log - " + nomeArquivo + " >> " + texto);
    }
}
