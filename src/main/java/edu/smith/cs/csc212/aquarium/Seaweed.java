package edu.smith.cs.csc212.aquarium;

import java.awt.Graphics2D;
import java.awt.Color;

public class Seaweed {
	int x;
	int y;
	int width;
	int height;
	
	public Seaweed() {
		this.x = 450;
		this.y = 400;
		this.width = 5;
		this.height = 100;
	}
	public void draw(Graphics2D win) {
		//Draw our seaweed.
		win.setColor(Color.black);
		win.drawOval(this.x, this.y, this.width, this.height);
		win.drawOval(this.x + 5, this.y, this.width, this.height);
		win.drawOval(this.x + 10, this.y, this.width, this.height);
		win.drawOval(this.x + 15, this.y, this.width, this.height);
		win.drawOval(this.x + 20, this.y, this.width, this.height);
		win.setColor(Color.green);
		win.fillOval(this.x, this.y, this.width, this.height);
		win.fillOval(this.x + 5, this.y, this.width, this.height);
		win.fillOval(this.x + 10, this.y, this.width, this.height);
		win.fillOval(this.x + 15, this.y, this.width, this.height);
		win.fillOval(this.x + 20, this.y, this.width, this.height);
	}
	
	

}
