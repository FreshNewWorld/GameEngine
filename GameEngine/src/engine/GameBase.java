package engine;
import java.awt.Graphics;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class GameBase
{	
	public abstract void initialize();
	
	public abstract void draw(Graphics g);
	
	public abstract void update();
	
	public void mouseClicked(MouseEvent arg0)
	{}
	
	public void mouseEntered(MouseEvent arg0)
	{}

	public void mouseExited(MouseEvent arg0)
	{}

	public void mousePressed(MouseEvent arg0)
	{}
	
	public void mouseReleased(MouseEvent arg0)
	{}
	
	public void focusGained(FocusEvent arg0)
	{}
	
	public void focusLost(FocusEvent arg0)
	{}
	
	public void keyPressed(KeyEvent arg0)
	{}
	
	public void keyReleased(KeyEvent arg0)
	{}
	
	public void keyTyped(KeyEvent arg0)
	{}
	
	public void mouseDragged(MouseEvent arg0)
	{}
	
	public void mouseMoved(MouseEvent arg0)
	{}
	
	public void dragEnter(DropTargetDragEvent arg0)
	{}
	
	public void dragExit(DropTargetEvent arg0)
	{}
	
	public void dragOver(DropTargetDragEvent arg0)
	{}
	
	public void drop(DropTargetDropEvent dtde)
	{}
	
	public void dropActionChanged(DropTargetDragEvent arg0)
	{}
	
	public abstract int getWIDTH();

	public abstract int getHEIGHT();
}
