package fr.bavon.Char;

public class TestCharacter extends Character {
	private String name;

	public TestCharacter(String name) {
		super(name);
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public void attack(String str) {
		System.out.println(name + ": Rrrrrrr....");
	}
	

}
