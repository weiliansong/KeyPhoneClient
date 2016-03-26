package networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.cert.Certificate;

import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public class Server implements Runnable {
	private ServerSocket ss;
	private boolean server_status;
	
	public Server(int port_number) throws IOException {
		server_status = true;

		System.setProperty("javax.net.ssl.keyStore", "lfkeystore2");
		System.setProperty("javax.net.ssl.keyStorePassword", "wshr.ut");
		
		SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
		ss = ssf.createServerSocket(port_number);
	}
	
	public void terminate() {
		server_status = false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(server_status) {
			try {
				Socket s = ss.accept();
				SSLSession session = ((SSLSocket) s).getSession();
				Certificate[] cchain2 = session.getLocalCertificates();
				ClientHandler.respond(s);
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
