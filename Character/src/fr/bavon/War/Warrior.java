package fr.bavon.War;

public class Warrior extends Character {
	private String name;
	public Warrior(String name) {
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

	@Override
	public void attack(String str) {
		// TODO Auto-generated method stub
		System.out.println(name + ": My name will go down in history");
		System.out.println(name + ": Rrrrrrr....");
		if (str!= "hammer" && str!= "sword") {
			System.out.println("I can't attack");
		}
		else {
		System.out.println(name + ": I'll crush you with my " + str + "!");
		}
	}

}
