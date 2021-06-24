package fr.bavon.War;

public class Bouger implements Movable {
	private String name;
	public Bouger(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		System.out.println(name + ": moves right");
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println(name + ": moves left");

	}

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println(name + ": moves forward");
	
	}

	@Override
	public void moveBack() {
		// TODO Auto-generated method stub
		System.out.println(name + ": moves back");
	
	}

}