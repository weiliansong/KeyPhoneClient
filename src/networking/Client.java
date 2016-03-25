package networking;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private static PrintWriter out;
	private static BufferedReader in;
	private Socket s;
	
	public Client(Socket s) {
		this.s = s;
	}
}
