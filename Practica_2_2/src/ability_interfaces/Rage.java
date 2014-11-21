/**
 * 
 */
package ability_interfaces;

import playable_characters.Playable_Character;


/**
 * @author lucky
 *
 */
public class Rage implements IAbility {

	int hitpoints;
	
	public Rage()
	{
		this.hitpoints=20;
	}
	
	public void Use(Playable_Character choosen) {
		
		choosen.SubHealth(this.hitpoints);
	}
}
