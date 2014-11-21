/**
 * 
 */
package ability_interfaces;

import playable_characters.Playable_Character;


/**
 * @author lucky
 *
 */
public class PhoenixTail implements IAbility {


	public void Use(Playable_Character choosen) {
		choosen.setHealth(15);
		choosen.Revive();
	}

}
