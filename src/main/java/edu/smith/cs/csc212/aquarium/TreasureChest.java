package edu.smith.cs.csc212.aquarium;

import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;

public class TreasureChest {
	int x;
	int y;
	int width;
	int height;
	
	public TreasureChest() {
		
		this.x = 150;
		this.y = 390;
		this.width = 200;
		this.height = 100;
	}
	
	public void draw(Graphics2D win) {
		win.setColor(Color.black);
		win.drawRect(this.x, this.y, this.width, this.height);
	}

}
