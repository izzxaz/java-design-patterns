package prototype;

public abstract class AbstractSpoon implements Cloneable {
	String spoonName;

	public void setSpoonName(String spoonName) {
		this.spoonName = spoonName;
	}

	public String getSpoonName() {
		return this.spoonName;
	}

	@Override
	public AbstractSpoon clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("AbstractSpoon is not Cloneable");
		}
		return (AbstractSpoon) obj;
	}
}
