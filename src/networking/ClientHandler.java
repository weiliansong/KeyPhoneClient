package networking;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import org.json.simple.JSONObject;

public class ClientHandler {
	
	@SuppressWarnings("unchecked")
	public static void respond(Socket s) throws IOException {
		OutputStream out = s.getOutputStream();
		JSONObject obj = new JSONObject();
		obj.put("first", "lol");
		obj.put("second", new Integer(100));
		out.write(obj.toString().getBytes());
		out.flush();
		out.close();
	}
}