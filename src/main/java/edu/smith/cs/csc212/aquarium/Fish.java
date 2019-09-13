package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	// every fish has a color that is a Color
	Color color;
	// every fish has a position (x,y) that are integers.
	int x;
	int y;
	boolean isLittle;
	
	public Fish(Color color, int startX, int startY, boolean isLittle) {
		this.color = color;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
	}
	
	public void draw(Graphics2D g) {
		if (this.isLittle) {
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		} else {
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		}
		
		this.swim();
	}
	
	public void swim() {
		this.x +=1;
		this.y +=1;
	}
	

}
