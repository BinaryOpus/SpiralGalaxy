package Main;

import View.*;
import Assets.*;
import Utilities.*;

public class Main{
	//javac Main/*.java View/*.java Assets/*.java Utilities/*.java Controller/*.java
	
	public static MainDisplay display;
	private static final int desiredTickRate = 64;
	private static final long desiredTicksSpeedMillis = (long)((1f/desiredTickRate) * 1000);
	
	
	public float tickRate = 0;
	public static long deltaTime = 0;
	private long timeBetweenChecksInMillis = 1000;
	
	public static Spiral spiral;
	
	public static void main(String[] arguments)throws InterruptedException{
	
		display = new MainDisplay();
		spiral = new Spiral(new Vector2D(780,400), 1345, 5130);
		
		
		
		long startTime = 0;
		long endTime = 0;
		
		while(true){
			startTime = System.currentTimeMillis();
			
			spiral.update();
			display.repaint();
			
			endTime = System.currentTimeMillis();
			
			if(endTime-startTime < desiredTicksSpeedMillis){
				Thread.sleep(desiredTicksSpeedMillis - (endTime-startTime));
			}
			Main.deltaTime = System.currentTimeMillis() - startTime;
		}
	}
}