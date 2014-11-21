/**
 * 
 */
package ability_interfaces;
import playable_characters.*;

/**
 * @author lucky
 *
 */
public class Heal implements IAbility {
	
	int healpoints;
	
	public Heal()
	{
		this.healpoints=10;
	}
	
	public void Use(Playable_Character choosen)
	{
		choosen.AddHealth(this.healpoints);
	}

}
