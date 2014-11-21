/**
 * 
 */
package playable_characters;
import ability_interfaces.IAbility;

/**
 * @author lucky
 *
 */
public abstract class Playable_Character {

	int health;
	int mood;
	boolean alive;
	String symbol;
	int x,y;
	public enum Direction {
		 NORTH,
		 SOUTH,
		 EAST,
		 WEST;
	}
	
	public Playable_Character(int health,int mood)
	{
		this.health=health;
		this.mood=mood;
		this.alive=true;
	}
	
	public void UseAbility(IAbility AbilityToUse,Playable_Character choosen) {}
	
	public void Scream() {}
	
	public void ShowStatus()
	{
		if(this.health>0){
			System.out.print("You have "+this.health+" points oh health.");
		}
		else 
		{
			System.out.print("You are dead.");
			Die();
		}
	}
	
	public void ChangeMood(int mood)
	{
		this.mood=mood;
	}
	
	public void AddHealth(int healthpoints)
	{
		setHealth(getHealth()+healthpoints);
	}
	
	public void SubHealth(int healthpoints)
	{
		setHealth(getHealth()-healthpoints);
	}
	
	public void Die(){}
	
	public void Revive(){}
	
	public void Attack(Playable_Character choosen){}

	public void Heal(Playable_Character choosen) {}
	
	public void DoubleAttack(Playable_Character choosen){}
	
	public void Rage(Playable_Character choosen){}
	
	public void PhoenixTail(Playable_Character choosen){}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
		
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	
	public int getY() {
		return y;
	}

	
	public void setY(int y) {
		this.y = y;
	}

	public void Move(Direction direction,Playable_Character choosen)
	{
			switch(direction)
			{
				case NORTH:
					setX(getX()-1);
					break;
					
				case SOUTH:
					setX(getX()+1);					
					break;
					
				case EAST:
					setY(getY()+1);			
					break;
					
				case WEST:
					setY(getY()-1);
					break;
					
				default:
					break;
		}
	}
	public void Pintar()
	{
		System.out.print(this.symbol);
	}

	
}
