package builder.tradition;

public class Director {
	private ComputerConfigBuilder mBuilder;

	public void setBuilder(ComputerConfigBuilder builder) {
		this.mBuilder = builder;
	}

	public void createComputer() {
		mBuilder.setCPU();
		mBuilder.setMemery();
		mBuilder.setHardDisk();
		mBuilder.setKeyboard();
		mBuilder.setMouse();
	}

	public Computer getComputer() {
		return mBuilder.getComputer();
	}

	public static void main(String[] args) {
		Director director = new Director();// 创建装机人员
		director.setBuilder(new LowConfigBuilder()); // 告诉装机人员电脑配置，这里为低配版
		director.createComputer(); // 装机人员开始组装
		Computer computer = director.getComputer(); // 从装机人员获取组装好的电脑
		System.out.print("电脑配置：" + computer.toString()); // 查看电脑配置
//		--------------------------------------
//		输出结果：
//		电脑配置：Computer{CPU='i5', memory='8G', hardDisk='500G', keyboard='薄膜键盘', mouse='有线鼠标'}
//		--------------------------------------
		director.setBuilder(new HighConfigBuilder());
		director.createComputer();
		Computer computer2 = director.getComputer();
		System.out.print("电脑配置：" + computer2.toString());
//		--------------------------------------
//		输出结果：
//		电脑配置：Computer{CPU='i7', memory='16G', hardDisk='1T', keyboard='机械键盘', mouse='无线鼠标'}
//		--------------------------------------
	}
}