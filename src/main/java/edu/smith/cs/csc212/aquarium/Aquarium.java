package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

/**
 * Aquarium is a graphical "application" that uses some code I built and have
 * shared with you that takes care of opening a window and communicating with
 * the user in a simple way.
 * 
 * The method draw is called 50 times per second, so we make an animation by
 * drawing our fish in one place, and moving that place slightly. The next time
 * draw gets called, our fish looks like it moved!
 * 
 * @author jfoley
 *
 */
public class Aquarium extends GFX {
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;
	
	
	//Create a placeholder for our new Bubble object.
	Bubble crush;
	//Initialize a fixed array for our ten bubbles.
	Bubble[] bubbles = new Bubble[10];
	
	//Initialize our Treasure chest object.
	TreasureChest chest = new TreasureChest();
	
	//Initialize our Seaweed object.
	Seaweed food = new Seaweed();
	
	//Create a placeholder for our two fishes.
	Fish nemo;
	Fish dory;
	
	/**
	 * Put a snail on the top of the tank.
	 */
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top");

	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
		
		crush = new Bubble(chest.x, chest.y, chest.width, chest.height);
		
		for (int i=0; i<bubbles.length; i++) {
			bubbles[i] = new Bubble(chest.x, chest.y, chest.width, chest.height);
		}
		
		//Initialize our fish nemo and dory as a instance of class Fish which take in a few parameters. Parameters in order are:
		//int startX, int startY, boolean isLittle, boolean facingLeft, boolean facingRight, int speedX, int speedY 
		nemo = new Fish(250, 250, true, true, false, 100, 100); 
		dory = new Fish(100, 100, false, false, true, 100, 100); 
	}

	
	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//Draw our bubble.
		crush.draw(g);

		//Draw nemo and dory.
		nemo.draw(g);
		dory.draw(g);

		// Draw our snail!
		algorithm.draw(g);
		
		//Draw our treasure chest.
		chest.draw(g);
		
		//Draw our seaweed.
		food.draw(g);

		//Draw each bubble in list
		//for b in bubbles:
		for (Bubble b : this.bubbles) {
			b.draw(g);
		}
		
	}
	

	public static void main(String[] args) {
		
		//Create a random speed generator
		//Random rand = new Random();
		
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}
