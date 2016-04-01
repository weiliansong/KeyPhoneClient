package networking;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import org.json.simple.JSONObject;

public class Transporter {
	
	public static boolean send(String msg, String phone_num, int status) {
		try {
			Socket s = new Socket();
			OutputStream out = s.getOutputStream();
			JSONObject obj = new JSONObject();
			obj.put("ID", TextProtocol.NEW_MSG);
			obj.put("phone_num", phone_num);
			obj.put("msg", msg);
			
			out.write(obj.toJSONString().getBytes());
			
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
