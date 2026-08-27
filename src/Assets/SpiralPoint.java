package Assets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import View.MainDisplay;
import Utilities.Vector2D;
import Main.Main;

public class SpiralPoint{

	Vector2D position; //Polar Coordinates
	Color colour;
	Color hue;
	
	public SpiralPoint(double magnitudeFromCentre, double relativeAngle){
		this.position = new Vector2D(magnitudeFromCentre,relativeAngle);
		this.colour = randomColor();
	}
	
	public void update(Vector2D centre, float radius, float angle){
		position.y += angle * Main.deltaTime;
		position.set(position);
	}
	
	public void draw(Graphics2D g2D, Vector2D spiralCentre, float xTilt, float yTilt){

		Vector2D cartesian = Vector2D.toCartesian(position.x,position.y);
		cartesian.add(spiralCentre);
		
		g2D.setColor(this.colour);
		g2D.fillOval((int)(((cartesian.x - spiralCentre.x)/xTilt) + spiralCentre.x), (int)(((cartesian.y - spiralCentre.y)/yTilt) + spiralCentre.y) ,2 ,2);
		
	}
	
	public Color randomColor(){
		float randomValue = (float)Math.random();
		
		if(randomValue < 0.75){
			hue = new Color(255,255,255,100);
			return Color.WHITE;
		}
		else if (randomValue < 0.85){
			hue = new Color(255,204,0,100);
			return new Color(255,204,0);
		}
		else if(randomValue < 0.98){
			hue = new Color(140,0,0,100);
			return new Color(140,0,0);
		}
		else{
			hue = new Color(157,0,255,100);
			return new Color(157,0,255);
		}
	}

}