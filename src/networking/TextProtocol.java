package networking;

public class TextProtocol {
	private static final int WAITING = 0;
	private static final int MSG_QUEUED = 1;
	private static final int MSG_SENT = 2;
	private static final int MSG_NOT_SENT = 3;
	private static final int DISCONNECTED = 4;
	
	private int state = WAITING;
	
	public String processInput(String input) {
		String output = null;
		
		if(state == WAITING) {
			
		}
		
		return output;
	}
}
