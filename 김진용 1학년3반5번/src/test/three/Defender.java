package test.three;

public class Defender extends AbstractMonster{
	public Defender() {
		this.hp = 20;
		this.attack = 13;
		this.defense = 25;
	}
	public int attack() {
		System.out.println("Derender - Attack");
		return attack;
	}
}
