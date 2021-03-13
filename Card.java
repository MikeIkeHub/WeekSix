package weeksix;

public class Card {
	private int value;
	private String name;

	public Card(String name, int value) {
		this.value = value;
		this.name = name;
	}
	
	public void describe() {
		System.out.print(this.value + " of " + this.name + "||");
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int number) {
		this.value = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String cardName) {
		this.name = cardName;
	}

}
