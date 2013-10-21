package engine;
import javax.swing.*;

public class GameFrame extends JFrame
{

	
	public GameFrame(int width, int height)
	{
		setTitle("GameEngine");
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
