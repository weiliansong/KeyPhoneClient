package networking;

public class TextProtocol {
	private static final int LISTENING = 0;
	private static final int MSG_QUEUED = 1;
	private static final int MSG_SENT = 2;
	private static final int MSG_NOT_SENT = 3;
	private static final int WAITING_FOR_MSG = 4;
	private static final int RECEIVED = 5;
	private static final int SENT_FAILED = 6;
	private static final int MSG_RECEIVED = 7;
	
	
	private int state = LISTENING;
	
	public String processInput(String input) {
		String output = null;
		
		if(state == LISTENING) {
			if(input.equals("NEW_MSG")) {
				state = MSG_RECEIVED;
			} else if(input.equals("MSG_SENT")) {
				
			}
		}
		
		return output;
	}
}
