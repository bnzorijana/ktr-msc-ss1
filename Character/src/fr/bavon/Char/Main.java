package fr.bavon.Char;

public class Main {

	public static void main(String[] args) {
		TestCharacter test= new TestCharacter("Bavon");
		System.out.println ( test.getName());
		System.out.println ( test.getLife());
		System.out.println ( test.getAgility());
		System.out.println ( test.getStrength());
		System.out.println ( test.getWit());
		System.out.println ( test.getRPGClass());
		test.attack("Noooo");
		
	}

}
