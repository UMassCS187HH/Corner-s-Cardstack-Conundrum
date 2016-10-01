package cardstack;

public class DeckUnderflowException extends Exception {

	String info;
	public DeckUnderflowException(String string) {
		// TODO Auto-generated constructor stub
		info = string;
	}

}
