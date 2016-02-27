package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
	private ServerSocket server_socket;
	private Socket client_socket;
	private PrintWriter out;
	private BufferedReader in;
	
	public Server(int port_number) throws IOException {
		server_socket = new ServerSocket(port_number);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				client_socket = server_socket.accept();
				out = new PrintWriter(client_socket.getOutputStream(), true);
				in  = new BufferedReader(new InputStreamReader(client_socket.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
}
