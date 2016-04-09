package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.json.simple.JSONObject;

public class ClientHandler {
	@SuppressWarnings("unchecked")
	public static void respond(Socket s) throws IOException {
//		PrintWriter pw = new PrintWriter(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//		JSONObject obj = new JSONObject();
//		obj.put("first", "lol");
//		obj.put("second", new Integer(100));
//		pw.println(obj.toString()); 
//		pw.flush();
		System.out.println(br.readLine());
		br.close();
//		pw.close();
	}
}