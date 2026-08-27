package View;

import javax.swing.JPanel;
import javax.swing.JFrame;
import View.MainPanel;
import Controller.UserInputListener;
public class MainDisplay extends JFrame{
	
	public JPanel mainPanel;
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;

	public MainDisplay(){
		this.initialiseDisplay();
	}
	
	private void initialiseDisplay(){
		this.mainPanel = new MainPanel();
		this.add(mainPanel);
		this.addKeyListener(new UserInputListener());
		

		this.setSize(WIDTH , HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
}