package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
	}
	protected AbstractMonster() {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	public boolean defense() {
		if(defense > attack) {
			defense -= attack;
			return true;
		}else {
			hp = hp + (defense - attack);
			return false;
		}
	}
	public int attack() {
		System.out.println("기술명");
		return attack;
	}
}
