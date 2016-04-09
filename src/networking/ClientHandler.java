package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.json.simple.JSONObject;

public class ClientHandler implements Runnable {
	private Socket s;

	public ClientHandler(Socket s) {
		this.s = s;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void run() {
		try {
			OutputStream out = s.getOutputStream();
			JSONObject obj = new JSONObject();
			obj.put("first", "lol");
			obj.put("second", new Integer(100));
			out.write(obj.toString().getBytes());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}