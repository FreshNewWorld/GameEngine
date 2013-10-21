package engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class Game extends GameBase {
	
	private final int WIDTH = 400;
	private final int HEIGHT = 300;
	
	private ArrayList<Integer> pressedKeys;
	
	public static void main(String[] args) {
		new Game();
	}
	
	public Game()
	{
		GameFrame frame1 = new GameFrame(WIDTH, HEIGHT);		

		GameCanvas gameCanvas = new GameCanvas(this);		

		frame1.add(gameCanvas);
		frame1.pack();
		gameCanvas.start();
		
	}
	
	// this runs once when the gameCanvas.start() is called
	// create your objects here
	public void initialize(){
		
	}
	// this runs constantly once gameCanvas has started
	// call your objects' update methods here
	public void update(){

	}
	
	// this runs constantly once gameCanvas has started
	// call your objects' draw methods here and pass g
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
	public void keyPressed(KeyEvent k){
		if(!pressedKeys.contains(new Integer(k.getKeyCode()))){
			pressedKeys.add(k.getKeyCode());
		}
	}

	public void keyReleased(KeyEvent k){
		pressedKeys.remove(new Integer(k.getKeyCode()));
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}		
	
}
