package gameElements;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

//make game elements like the player extend this class

public class Sprite {
	protected int xPosition;
	protected int yPosition;
	protected Rectangle bounding;
	
	protected BufferedImage spriteSheet;
	protected BufferedImage[][] spriteArray;
	
	protected int stepWidth;
	protected int stepHeight;
	
	protected int numSteps;
	protected int numStages;
	
	protected double stepTime;
	protected double currentStepTime;
	
	protected int currentStep;
	protected int currentStage;
	
	public Sprite(int x, int y){
		xPosition = x;
		yPosition = y;

	}
	
	public void loadGraphics(String fileName, int nSteps, int nStages){
		numSteps = nSteps;
		numStages = nStages;
		
		try{
			spriteSheet = ImageIO.read(getClass().getResource("/resources/" + fileName + ".png"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		stepHeight = spriteSheet.getHeight() / numStages;
		stepWidth = spriteSheet.getWidth() / numSteps;
		
		spriteArray = new BufferedImage[numStages][numSteps];
		for(int i = 0; i < numStages; i++){
			for (int j = 0; j < numSteps; j++) {
				spriteArray[i][j] = spriteSheet.getSubimage(j * stepWidth, i * stepHeight, stepWidth, stepHeight);
			}
		}
		
		bounding = new Rectangle(xPosition, yPosition, stepWidth, stepHeight);
	}
	
	public void draw(Graphics g){
		g.drawImage(spriteArray[currentStage][currentStep], xPosition, yPosition, null);		
	}
	
	public void setPosition(int x, int y){
		setxPosition(x);
		setyPosition(y);
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
}
