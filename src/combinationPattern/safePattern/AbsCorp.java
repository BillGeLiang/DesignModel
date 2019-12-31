package combinationPattern.safePattern;

public abstract class AbsCorp {
	private String name;
	private String description;
	
	public void getInfo(){
		System.out.println("name:\t"+name+"\tdescription:\t"+description);
	}
	
	public AbsCorp(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
}
