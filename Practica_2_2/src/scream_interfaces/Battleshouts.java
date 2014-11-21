/**
 * 
 */
package scream_interfaces;


/**
 * @author lucky
 *
 */
public class Battleshouts implements IScream{

	String firstShout;
	String secondShout;
	String thirdShout;
	
	public Battleshouts()
	{
		this.firstShout = "I'm the best!";
		this.secondShout = "You should die in my name!";
		this.thirdShout = "Go to hell!";
	}
	
	public void Scream(int mood)
	{
		switch(mood)
		{
			case 0:
				System.out.print(this.firstShout);
				break;
   		case 1:
   			System.out.print(this.secondShout);
   			break;
   		case 2:
   			System.out.print(this.thirdShout);
   			break;
   		default:
   			System.out.print("Something is wrong with me...");
   			break;
   		}
	}
	
}
