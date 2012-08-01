import java.io.*;
import java.net.*;

public class Server {
	static final int port = 8080;
	public static void main(String args[]) throws Exception {
		OutputStreamWriter output;
		BufferedWriter writer;
		
		ServerSocket server = new ServerSocket(port);
		System.out.println("Servidor escutando na porta "+port);
		
		while (true) {
			Socket s = server.accept();
			output = new OutputStreamWriter(s.getOutputStream());
			writer = new BufferedWriter(output);
			writer.write("Academia do Programador 2012\n");
			writer.flush();
			writer.close();
		}
	}
}
