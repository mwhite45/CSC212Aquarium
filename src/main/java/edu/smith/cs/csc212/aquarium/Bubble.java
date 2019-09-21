package edu.smith.cs.csc212.aquarium;

import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;

//This code was referenced from @author jfoley. URL: https://www.youtube.com/watch?v=QkGI5_HhiU8&feature=youtu.be
public class Bubble {
	
	//Create a placeholder for variables to be initialized in constructor.
	int x;
	int y;
	int wiggle;
	int width;
	int chestWidth;
	int chestHeight;
	int chestX;
	int chestY;
	
	Random rand = new Random();
	
	public Bubble(int x, int y, int width, int height) {
		
		//Has bubbles start in random places within chest width and height 
		this.x = x + rand.nextInt(width);
		this.y = y + rand.nextInt(height);
		this.wiggle = 0;
		//Needed to generate random-sized bubbles with minimum size of 10.
		this.width = (10 + rand.nextInt(10));
		this.chestX = x;
		this.chestY = y;
		this.chestWidth = width;
		this.chestHeight = height;
		
	}
	
	public void draw(Graphics2D win) {
		Font f = win.getFont();
		win.setFont(f.deriveFont(40.23f));
		win.setColor(Color.white);
		//Draws our bubble shape using graphics Oval method.
		win.drawOval(this.x + this.wiggle, this.y, this.width, this.width);
		
		
		animate();	
	}
	public void animate() {
		this.y -= 6;
		if (this.y < -450) {
			//off the screen
			this.x = this.chestX + rand.nextInt(this.chestWidth);
			this.y = this.chestY + rand.nextInt(this.chestHeight);
		}
		//Use trig to get wiggle motion of bubbles as they float upward.
		//Use sine over cosine and work with y coordinate over x to have vertical ascension over horizontal
		this.wiggle = (int) (30.0 * Math.cos(this.y / 60.0));
	}

}
