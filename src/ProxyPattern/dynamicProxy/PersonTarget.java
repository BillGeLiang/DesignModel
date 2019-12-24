package ProxyPattern.dynamicProxy;

public class PersonTarget implements PersonBean {
	private String name;
	private String gender;
	private String interests;
	private double hotRate;

	public PersonTarget() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonTarget(String name, String gender, String interests,
			double hotRate) {
		super();
		this.name = name;
		this.gender = gender;
		this.interests = interests;
		this.hotRate = hotRate;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;

	}

	@Override
	public double getHotRate() {
		// TODO Auto-generated method stub
		return hotRate;
	}

	@Override
	public void setHotRate(double hotRate) {
		// TODO Auto-generated method stub
		this.hotRate = hotRate;

	}

	@Override
	public String getInterests() {

		return interests;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;

	}

}
