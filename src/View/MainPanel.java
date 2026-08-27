package View;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import Main.Main;
import Assets.Spiral;


public class MainPanel extends JPanel{

	private JLabel guideLabel = new JLabel("Up/Down Arrow = Adjust Spiral Height : Left/Right Arrow = Adjust Spiral Width");
	private JLabel tickRate = new JLabel("Tick Rate: ");
	private JLabel frameRate = new JLabel("Rotation Speed: ");
	
	public JSlider speedSlider = new JSlider(0, 800, 0);
	

	public MainPanel(){
		this.setBackground(Color.BLACK);
		
		guideLabel.setForeground(Color.MAGENTA);
		tickRate.setForeground(Color.GREEN);
		frameRate.setForeground(Color.ORANGE);
		
		this.add(guideLabel);
		this.add(tickRate);
		this.add(frameRate);
		speedSlider.setFocusable(false);
		this.add(speedSlider);
	}
	
	@Override	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		
		Main.spiral.draw(g2D);
		Main.spiral.angleSpeed = speedSlider.getValue();
		
		try{
			tickRate.setText("Tick Rate: " + 1000/Main.deltaTime);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero");
		}
		
		
	}
	
	public int getSpeedSliderValue(){
		return speedSlider.getValue();
	}
}