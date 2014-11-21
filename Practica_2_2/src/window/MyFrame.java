/**
 * 
 */
package window;
import javax.swing.*;
import java.awt.*;
/**
 * @author lucky
 *
 */
public class MyFrame {
	
	public MyFrame()
	{
		JFrame frame = new JFrame("Menu");
		JPanel mypanel = CreatePanelButton("Comenzar juego");
		JPanel mypanel2 = CreatePanelButton("Salir");
		frame.setLayout(new GridLayout(5,10));
		frame.add(mypanel, BorderLayout.EAST);
		frame.add(mypanel2, BorderLayout.EAST);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public JPanel CreatePanelButton(String chain)
	{
		JPanel mypanel = new JPanel(new BorderLayout ( ));
		JButton mybutton = new JButton(chain);
		mypanel.add(mybutton);
		return mypanel;
	}
	
}
