package prototype;

public class Main {
	public static void main(String[] args) {
		AbstractSpoon soupSpoon = new SoupSpoon();
		AbstractSpoon saladSpoon = new SaladSpoon();

		AbstractSpoon soupCopy = soupSpoon.clone();

	}
}
