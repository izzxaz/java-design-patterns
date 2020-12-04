package singleton;

public class Test {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonDoubleCheck.getSingleton();

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonDoubleCheck.getSingleton();

			}
		}).start();
	}

}
