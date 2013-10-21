/*
 * This Canvas calls the initialize, update, and draw methods of a class that extends GameBase
 * This class has handlers for user input that a game that extends GameBase may override. 
 * After a class that extends GameBase creates this canvas it should call start() on it. 
 * 
 * Will Smith
 * Michael Ripley
 */

package engine;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class GameCanvas extends Canvas implements KeyListener, FocusListener, MouseListener, MouseMotionListener, DropTargetListener{
	
	private GameBase game;
	private BufferedImage bufferData;
	private Graphics g;
	private int width;
	private int height;
	
	public GameCanvas(GameBase gm){		
		game = gm;
		width = gm.getWIDTH();
		height = gm.getHEIGHT();
		setPreferredSize(new Dimension(width, height));
		
		addKeyListener(this);
		addFocusListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	//this is called when repaint is called. you do NOT also need a paint method (would cause flickering)
	public void update(Graphics screen){
		if (bufferData == null)
		{
			bufferData = (BufferedImage)createImage(getWidth(), getHeight());
			g = bufferData.getGraphics();
		}
		
		game.draw(g); //call to draw in GameBase
		screen.drawImage(bufferData, 0, 0, null);
	}
	
	
	public void start(){
		game.initialize(); //call to initialize in GameBase
		while(true){
			
			//about 60 fps
			try{
				Thread.sleep(15);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			this.repaint();
			game.update(); //call to update in GameBase
		}
	}
	
	//user input handlers that can be overridden
	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		game.mouseClicked(arg0);
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		game.mouseEntered(arg0);
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		game.mouseExited(arg0);
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		game.mousePressed(arg0);
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		game.mouseReleased(arg0);
	}

	@Override
	public void focusGained(FocusEvent arg0)
	{
		game.focusGained(arg0);
	}

	@Override
	public void focusLost(FocusEvent arg0)
	{
		game.focusLost(arg0);
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		game.keyPressed(arg0);
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		game.keyReleased(arg0);
	}

	@Override
	public void keyTyped(KeyEvent arg0)
	{
		game.keyTyped(arg0);
	}

	@Override
	public void mouseDragged(MouseEvent arg0)
	{
		game.mouseDragged(arg0);
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0)
	{
		game.mouseMoved(arg0);
		
	}

	@Override
	public void dragEnter(DropTargetDragEvent arg0)
	{
		game.dragEnter(arg0);
	}

	@Override
	public void dragExit(DropTargetEvent arg0)
	{
		game.dragExit(arg0);
	}

	@Override
	public void dragOver(DropTargetDragEvent arg0)
	{
		game.dragOver(arg0);
	}

	@Override
	public void drop(DropTargetDropEvent arg0)
	{
		game.drop(arg0);
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent arg0)
	{
		game.dropActionChanged(arg0);
	}
	
}
