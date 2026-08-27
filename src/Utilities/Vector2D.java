package Utilities;

public class Vector2D {

    public double x;
    public double y;
    
    public Vector2D(){ }

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D v){
        this.x = v.x;
        this.y = v.y;
    }
	
    public static Vector2D toCartesian(double magnitude, double angle){
        return new Vector2D(magnitude * Math.cos(angle), magnitude * Math.sin(angle));
    }

    public void add(Vector2D v){
        this.x += v.x;
        this.y += v.y;
    }

    @Override
    public String toString(){
        return "Vector2D[" + x + ":" + y + "]";
    }
}