/**
 * 
 */
package ability_interfaces;
import playable_characters.*;

/**
 * @author lucky
 *
 */
public class DoubleAttack implements IAbility{

	int hitpoints;
	
	public DoubleAttack()
	{
		this.hitpoints=10;
	}
	
	public void Use(Playable_Character choosen) 
	{
		choosen.SubHealth(this.hitpoints);
	}

}
