package edu.smith.cs.csc212.aquarium;

import java.awt.Graphics2D;
import java.awt.Color;

public class TreasureChest {
	int x;
	int y;
	int width;
	int height;
	
	public TreasureChest() {
		
		this.x = 150;
		this.y = 400;
		this.width = 200;
		this.height = 100;
	}
	
	public void draw(Graphics2D win) {
		//Draw our treasure chest.
		win.setColor(Color.black);
		win.drawRect(this.x, this.y, this.width, this.height);
		win.setColor(Color.gray);
		win.fillRect(this.x, this.y, this.width, this.height);
	}

}
