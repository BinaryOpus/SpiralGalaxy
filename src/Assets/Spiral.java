package Assets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import View.MainDisplay;
import Utilities.Vector2D;

public class Spiral{

	public Vector2D centre;
	public float radius;
	public float angleSpeed;
	private int pointCount;
	
	private SpiralPoint[] spiralPointsArray;
	
	public static float xTilt = 1;
	public static float yTilt = 1;
	
	public Spiral(Vector2D centre, int radius, int pointCount){
		this.centre = centre;
		this.radius = radius;
		this.pointCount = pointCount;
		
		this.spiralPointsArray = new SpiralPoint[pointCount];
		this.fillSpiral();
		this.angleSpeed = 0f;
	}
	
	public void update(){
		angleSpeed = 0.000006f * (float)angleSpeed;
		for(int i = 0; i<pointCount; ++i){
			spiralPointsArray[i].update(centre, radius, angleSpeed);
		}
	}
	
	public void draw(Graphics2D g2D){
		//g2D.setColor(new Color(255,255,255,100));
		//g2D.fillOval(0,0,600,600);
		for(int i = 0; i<pointCount; ++i){
			spiralPointsArray[i].draw(g2D , centre , xTilt , yTilt);
		}
	}
	
	private void fillSpiral(){
		
		for(int i = 0; i<pointCount; ++i){
			double randomRadius = Math.random() * radius;
			double randomAngle = Math.random() * 2*Math.PI;
			spiralPointsArray[i] = new SpiralPoint((float)randomRadius , (float)randomAngle);
		}
	}


}