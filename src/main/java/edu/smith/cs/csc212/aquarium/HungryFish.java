package edu.smith.cs.csc212.aquarium;

import java.awt.Color;


public class HungryFish extends Fish {
	
	int foodX;
	int foodY;
	int foodWidth;
	int foodHeight;
	boolean isVeryHungry;
	int destX;
	int destY;
	
	float r = rand.nextFloat();
	float g = rand.nextFloat();
	float b = rand.nextFloat();
	
	public HungryFish(int startX, int startY, boolean isLittle, boolean facingLeft, boolean facingRight, int speedX, int speedY, int destX, int destY) {
		super(startX, startY, isLittle, facingLeft, facingRight, speedX, speedY);

		this.foodX = 450;
		this.foodY = 400;
		this.foodWidth = 20;
		this.foodHeight = 100;
		this.isVeryHungry = false;
		this.destX = destX;
		this.destY = destY;
		
		navigate();
	}

		
		
	//Partial code was referenced from @author jfoley. URL: https://www.youtube.com/watch?v=2zbhI_Vo1G8&feature=youtu.be
	public void navigate(int destX) {
		if ((Math.abs(this.destX - this.x) >= 5) && Math.abs(this.destY - this.y) >= 5) {
			this.isVeryHungry = true;
		}
		
		if (this.isVeryHungry == true) {
			this.destX = this.foodX;
			this.destY = this.foodY;
			this.color = new Color (r, g, b);
			
		}
	}
}
				
		
	
