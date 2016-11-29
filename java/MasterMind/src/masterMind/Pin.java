package masterMind;

public class Pin {

	private int value;

	Pin(int value) {
		this.value = value;
	}
	
	Pin(char value) {
		this.value = Character.getNumericValue(value);
		System.out.println(value);
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
