/**
 * 
 */
package playable_characters;
import scream_interfaces.*;
import ability_interfaces.*;

/**
 * @author lucky
 *
 */
public class Healer extends Playable_Character {
	
	IAbility firstAbility;
	IAbility secondAbility;
	//IAbility thirdAbility;
	IScream myShout;
	
	public Healer()
	{
		super(20,0);
		this.firstAbility = new Heal();
		this.secondAbility = new PhoenixTail();
		//this.thirdAbility = new CureStates();
		this.myShout = new Battleshouts();
		this.symbol = "L";
	}
	
	public void UseAbility(IAbility AbilityToUse,Playable_Character choosen)
	{
		AbilityToUse.Use(choosen);	
	}
	
	public void Die()
	{
		this.alive= false;
		setFirst_ability(new NoAttack());
		setSecond_ability(new NoAttack());
		//setThird_ability(new NoAttack());
		setMyShout(new Muted());
	}
	
	public void Revive()
	{
		this.alive= true;
		setFirst_ability(new Heal());
		setSecond_ability(new PhoenixTail());
		//setThird_ability(new CureStates());
		setMyShout(new Battleshouts());
	}
	
	public void Heal(Playable_Character choosen)
	{
		UseAbility(this.firstAbility,choosen);
	}
	
	public void PhoenixTail(Playable_Character choosen)
	{
		UseAbility(this.secondAbility,choosen);
	}
	
	public void Scream()
	{
		myShout.Scream(this.mood);
	}
	
	public void setFirst_ability(IAbility first_ability) {
		this.firstAbility = first_ability;
	}

	public void setSecond_ability(IAbility second_ability) {
		this.secondAbility = second_ability;
	}
	
	//public void setThird_ability(IAbility third_ability) {
	//	this.thirdAbility = third_ability;
	//}
	
	public void setMyShout(IScream myShout) {
		this.myShout = myShout;
	}
	
	public IAbility getHeal() {
		return firstAbility;
	}

	public IAbility getAttack() {
		return secondAbility;
	}

	//public IAbility getCureStates() {
	//	return thirdAbility;
	//}
	
}
