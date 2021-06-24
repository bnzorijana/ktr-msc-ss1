package fr.bavon.War;

public class Mage extends Character {
	private String name;
	public Mage(String name) {
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
		System.out.println(name + ": May the gods be with me.");
		System.out.println(name + ": Rrrrrrr....");
		if (str!= "magic" && str!= "wand") {
			System.out.println("I can't attack");
		}
		else {
		System.out.println(name + ": Feel the power of my " + str + "!");
		}

	}

}
