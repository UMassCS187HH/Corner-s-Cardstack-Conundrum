package cardstack;

public class LLCardNode {

	private String data;
	private LLCardNode link;
	public LLCardNode (String card) {
		this.data = card;
		this.link = null;
	}
	public LLCardNode (String card, LLCardNode link) {
		this.data = card;
		this.link = link;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public LLCardNode getLink() {
		return link;
	}
	public void setLink(LLCardNode link) {
		this.link = link;
	}
}
