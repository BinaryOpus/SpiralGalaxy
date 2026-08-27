package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Assets.Spiral;

public class UserInputListener implements KeyListener{
	
	private int keyCode;
	private int activeKey;
	
	public UserInputListener(){
		this.keyCode = 0;
		this.activeKey = 0;
	}
	
    @Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
		
		//Up Arrow Key
		if(keyCode == KeyEvent.VK_UP && activeKey == 0){
			this.activeKey = keyCode;
			Spiral.yTilt += 0.1;
		}
		//Down Arrow Key
		else if(keyCode == KeyEvent.VK_DOWN && activeKey == 0){
			this.activeKey = keyCode;
			Spiral.yTilt -= 0.1;
		}
	
		//Left Arrow Key
		if(keyCode == KeyEvent.VK_LEFT && activeKey == 0){
			this.activeKey = keyCode;
			Spiral.xTilt -= 0.1;
		}
		//Right Arrow Key
		else if(keyCode == KeyEvent.VK_RIGHT && activeKey == 0){
			this.activeKey = keyCode;
			Spiral.xTilt += 0.1;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyCode = e.getKeyCode();
		
		//Up arrow key
		if(keyCode == KeyEvent.VK_UP && keyCode == activeKey){
			this.activeKey = 0;
		}
		//Down arrow key
		else if(keyCode == KeyEvent.VK_DOWN && keyCode == activeKey){
			this.activeKey = 0;
		}
		
		//Left Arrow Key
		if(keyCode == KeyEvent.VK_LEFT && keyCode == activeKey){
			this.activeKey = 0;
		}
		//Right Arrow Key
		else if(keyCode == KeyEvent.VK_RIGHT && keyCode == activeKey){
			this.activeKey = 0;
		}
	}
}