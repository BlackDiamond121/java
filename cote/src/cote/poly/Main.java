package cote.poly;

public class Main {
	public static void main(String[] args) {
		Animal[] myAnimals = new Animal[5];
		myAnimals[0] = new Parrot();
		myAnimals[1] = new Cat();
		myAnimals[3] = new Parrot();
		myAnimals[3] = new Cat();
		myAnimals[4] = new Parrot();
		
		for(Animal a:myAnimals) {
			System.out.println(a.hello());
		}
		/*
		 for(int i = 0; i < myAnimals.length; i++) {
		 Animal a = myAnimals[i];
		 System.out.println(a.hello());
		*/
	}
}
