package builder;

public class Computer {
	private final String cpu;// 必须
	private final String ram;// 必须
	private final int usbCount;// 可选
	private final String keyboard;// 可选
	private final String display;// 可选

	private Computer(Builder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.usbCount = builder.usbCount;
		this.keyboard = builder.keyboard;
		this.display = builder.display;
	}

	public static class Builder {
		private String cpu;// 必须
		private String ram;// 必须
		private int usbCount;// 可选
		private String keyboard;// 可选
		private String display;// 可选

		public Builder(String cpu, String ram) {
			this.cpu = cpu;
			this.ram = ram;
		}

		public Builder setUsbCount(int usbCount) {
			this.usbCount = usbCount;
			return this;
		}

		public Builder setKeyboard(String keyboard) {
			this.keyboard = keyboard;
			return this;
		}

		public Builder setDisplay(String display) {
			this.display = display;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

	public static void main(String[] args) {
		Computer computer = new Computer.Builder("因特尔", "三星").setDisplay("三星24寸").setKeyboard("罗技").setUsbCount(2)
				.build();

	}
}