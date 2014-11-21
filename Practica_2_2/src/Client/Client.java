/**
 * 
 */
package Client;
import playable_characters.*;
import ability_interfaces.*;
import scream_interfaces.*;
import window.*;
/**
 * @author lucky
 *
 */
public class Client {

	public Client()
	{
		//Crear escenario
		MyFrame menu = new MyFrame();
		Playable_Character warrior =  new Warrior();
		Playable_Character healer = new Healer();
		Playable_Character hero = new Hero();
		
		warrior.ShowStatus();
		warrior.Scream();
		warrior.Attack(healer);
		healer.ShowStatus();
		healer.Heal(healer);
		healer.ShowStatus();
		healer.Heal(warrior);
		warrior.ShowStatus();
		hero.Rage(healer);
		hero.DoubleAttack(healer);
		healer.ShowStatus();
		healer.PhoenixTail(healer);
		healer.Scream();
		hero.PhoenixTail(healer);
		healer.ShowStatus();
	}
	
}
