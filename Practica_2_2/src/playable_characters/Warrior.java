/**
 * 
 */
package playable_characters;
import ability_interfaces.*;
import scream_interfaces.*;
/**
 * @author lucky
 *
 */
public class Warrior extends Playable_Character {

	IAbility firstAbility; //Attack
	IAbility secondAbility; //DoubleAttack
	IAbility thirdAbility; //Rage
	IScream myShout; //Battleshouts
	
	public Warrior()	
	{
		super(50,0);
		this.firstAbility = new Attack();
		this.secondAbility = new DoubleAttack();
		this.thirdAbility = new Rage();
		this.myShout = new Battleshouts();
		this.symbol = "W";
	}
	
	public void Attack(Playable_Character choosen)
	{
		UseAbility(this.firstAbility,choosen);
	}
	
	public void DoubleAttack(Playable_Character choosen)
	{
		UseAbility(this.secondAbility,choosen);
	}
	
	public void Rage(Playable_Character choosen)
	{
		UseAbility(this.thirdAbility,choosen);
	}
	
	public void Scream()
	{
		myShout.Scream(this.mood);
	}
	
	public void UseAbility(IAbility AbilityToUse,Playable_Character choosen)
	{
		AbilityToUse.Use(choosen);
	}
	
	public void setFirst_ability(IAbility first_ability) {
		this.firstAbility = first_ability;
	}

	public void setSecond_ability(IAbility second_ability) {
		this.secondAbility = second_ability;
	}

	public void setThird_ability(IAbility third_ability){
		this.thirdAbility = third_ability;
	}
	
	public void setMyShout(IScream myShout) {
		this.myShout = myShout;
	}

	public IAbility getFirstAbility() {
		return firstAbility;
	}

	public IAbility getSecondAbility() {
		return secondAbility;
	}

	public IAbility getThirdAbility() {
		return thirdAbility;
	}
	
	public void Die()
	{
		this.alive= false;
		setFirst_ability(new NoAttack());
		setSecond_ability(new NoAttack());
		setThird_ability(new NoAttack());
		setMyShout(new Muted());
	}
	
	public void Revive()
	{
		this.alive= true;
		setFirst_ability(new Attack());
		setSecond_ability(new DoubleAttack());
		setThird_ability(new Rage());
		setMyShout(new Battleshouts());
	}
}
