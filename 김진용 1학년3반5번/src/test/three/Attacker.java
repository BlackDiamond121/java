package test.three;

public class Attacker extends AbstractMonster{
	
	public Attacker() {
		this.hp = 30;
		this.attack =30;
		this.defense = 10;
	}
	public int attack() {
		System.out.println("Attacker - Very Strong Attack");
		return attack;
	}
}
