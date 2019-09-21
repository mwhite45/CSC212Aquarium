package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

//Did not have a lab buddy.

public class Fish {
	// every fish has a color that is a Color.
	Color color;
	// every fish has a position (x,y) that are integers.
	int x;
	int y;
	// every fish has a size that is a boolean.
	boolean isLittle;
	// every fish has a direction that is made up of two booleans.
	boolean facingLeft;
	boolean facingRight;
	// every fish has a destination (x,y) that are integers.
	int destX;
	int destY;
	// every fish has a speed (x,y) that are integers.
	int speedX;
	int speedY;
	
	Random rand = new Random();
	
	
	public Fish(int startX, int startY, boolean isLittle, boolean facingLeft, boolean facingRight, int speedX, int speedY) {
		
		//Referenced from https://stackoverflow.com/questions/4246351/creating-random-colour-in-java
		//Generates randomness in color using rgb.
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		this.color = new Color (r, g, b);
		
		this.x = startX;
		this.y = startY;
		
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		this.facingRight = facingRight;
		
		this.destX = rand.nextInt(500);  
		this.destY = rand.nextInt(500);
		
		this.speedX = 3;
		this.speedY = 3;	
	
	}
	
	public void draw(Graphics2D g) {
		navigate();
		
		//Determine size and direction 
		if (this.isLittle && this.facingLeft) {
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		} else if (!this.isLittle && this.facingLeft) {
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		} else if (this.isLittle && !this.facingLeft) {
			DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		} else if (!this.isLittle && !this.facingLeft) {
			DrawFish.facingRight(g, this.color, this.x, this.y);
		}
		
	}
	
	//This code was referenced from @author jfoley. URL: https://www.youtube.com/watch?v=2zbhI_Vo1G8&feature=youtu.be
	//Determine how the fish navigates to destination, randomly chooses next destination and then changes direction.
	public void navigate( ) { 
		
		if (this.x < this.destX - this.speedX) {
			this.x += this.speedX;
			this.facingLeft = false;
		} else if (this.x > this.destX + this.speedX) {
			this.x -= this.speedX;
			this.facingLeft = true;
		}  if (this.y < this.destY) {
			this.y += this.speedY;
		} else if (this.y > this.destY) {
			this.y -= this.speedY;
		} if ((Math.abs(this.destX - this.x) <= 5) && Math.abs(this.destY - this.y) <= 5) { //Uses inequalities to determine if (x,y) are close enough.
			this.destX = rand.nextInt(500);
			this.destY = rand.nextInt(500);
		}
	}
	

}
