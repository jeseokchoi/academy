package reference;

public class Unit {
	private String name;		// 이름
	private int atk;			// 공격력
	private int def;			// 방어력
	private int hp;				// 체력
	
	public Unit(String name, int atk, int def, int hp) {
		super();
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
	}

					// 단축기 (S > R > Alt + A > Alt + R (getter & setter 생성)
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAtk() {
		return atk;
	}
	void setAtk(int atk) {
		this.atk = atk;
	}
	int getDef() {
		return def;
	}
	void setDef(int def) {
		this.def = def;
	}
	int getHp() {
		return hp;
	}
	void setHp(int hp) {
		this.hp = hp;
	}

	
}
