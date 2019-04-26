import java.util.ArrayList;

public class MessagePriorityQue  {

	private ArrayList<ArrayList<Message>> messageLists;
	
	private int numMessages;
	
	public MessagePriorityQue() {
		messageLists = new ArrayList<ArrayList<Message>>(10);
		ArrayList<Message>m1 = new ArrayList<Message>();
		m1.add(null);
	}
	
	public int size() {
		return 0;
	}
	
	public boolean isEmpty() {
		if(messageLists.isEmpty())
			return true;
		return false;
	}
	
	public void add(Message msg) {
		int priority = msg.getPriority();
		messageLists.add(priority, (ArrayList<Message>) msg);
		messageLists.ensureCapacity(messageLists.size() + 1);
	}
	
	public Message remove() {
		
		if(!(messageLists.isEmpty())) {
			return (Message) messageLists.get(0);
		}
		if(!(messageLists.isEmpty())) {
			messageLists.remove(0);
		}
		return null;
	}

}
