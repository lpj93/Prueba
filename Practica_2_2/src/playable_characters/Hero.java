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
public class Hero extends Playable_Character{
	
	IAbility firstAbility;
	IAbility secondAbility; 
	IAbility thirdAbility; 
	IScream myShout; 
	
	public Hero()	
	{
		super(40,0);
		this.firstAbility = new Rage();
		this.secondAbility = new DoubleAttack();
		this.thirdAbility = new PhoenixTail();
		this.myShout = new Battleshouts();
		this.symbol = "H";
	}
	
	public void Rage(Playable_Character choosen)
	{
		UseAbility(this.firstAbility,choosen);
	}
	
	public void DoubleAttack(Playable_Character choosen)
	{
		UseAbility(this.secondAbility,choosen);
	}
	
	public void PhoenixTail(Playable_Character choosen)
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
		setFirst_ability(new Rage());
		setSecond_ability(new DoubleAttack());
		setThird_ability(new PhoenixTail());
		setMyShout(new Battleshouts());
	}
	
}
