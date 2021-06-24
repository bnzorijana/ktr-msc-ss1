package fr.bavon.War;

public class Main {

	public static void main(String[] args) {
		Warrior bavon=new Warrior("Luc");
		Mage kevin= new Mage("Robert");
		Bouger will= new Bouger("Rose");
		bavon.attack("un 9mm");
		kevin.attack("magic");
		will.moveRight();
		will.moveLeft();
		will.moveForward();
		will.moveBack();
		
	}

}
