/**
 * 
 */
package ability_interfaces;
import playable_characters.*;

/**
 * @author lucky
 *
 */
public class Attack implements IAbility{

	int hitpoints;
	
	public Attack()
	{
		this.hitpoints=5;
	}
	
	public void Use(Playable_Character choosen) {
		
		choosen.SubHealth(this.hitpoints);
	}

}
