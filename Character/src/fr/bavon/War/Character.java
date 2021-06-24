package fr.bavon.War;

public abstract class Character {
	private String name;
	final private String RPGClass;
	private int life;
	private int agility;
	private int strength;
	private int wit;
	public Character(String name) {
		this.name=name;
		this.RPGClass="Character";
		this.life=50;
		this.agility=2;
		this.strength=2;
		this.wit=2;
	}
	public String getName() {
		return name;
	}
	public String getRPGClass() {
		return RPGClass;
	}
	public int getLife() {
		return life;
	}
	public int getAgility() {
		return agility;
	}
	public int getStrength() {
		return strength;
	
	}
	public int getWit() {
		return wit;
	}
	public void setName(String name) {
		this.name=name;
	}
	abstract public void attack(String str); 

}
