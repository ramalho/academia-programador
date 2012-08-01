import java.net.*;
import java.io.*;

public class ClientSocket {
	
	public static void main(String args []) throws Exception {
		BufferedReader leitorLinhas;
		InputStreamReader leitorCaracteres;
		InputStream leitorSocket;
		String hostname;
		if (args.length > 0) {
			hostname = args[0];
		} else {
			hostname = "localhost";
		}
		System.out.println("Acessando "+hostname+"...");
		Socket s = new Socket(hostname, 8080);
		
		leitorSocket = s.getInputStream();
		
		leitorCaracteres = new InputStreamReader(leitorSocket);
		
		leitorLinhas = new BufferedReader(leitorCaracteres);
		System.out.println(leitorLinhas.readLine());
		s.close();
	}
}

