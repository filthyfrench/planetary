package hackBCA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Planet extends JPanel {
	private int length = 30;
	private int width = 30;
	private int x, xa = 1;
	private int y, ya = 1;
	private SystemPanel game;

	public Planet(SystemPanel sys) {
		game = sys;
		x = game.getWidth() / 2 - 20;
		y = game.getHeight() / 2 - 20;
	}
	
	public Planet(SystemPanel sys, int newL, int newW) {
		game = sys;
		x = game.getWidth() / 2 - 20;
		y = game.getHeight() / 2 - 20;
		length = newL;
		width = newW;
	}
	
	public Planet(SystemPanel sys, int newL, int newW, int newX, int newY) {
		game = sys;
		x = newX;
		y = newY;
		length = newL;
		width = newW;
	}
	
	public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, length, width);super.paintComponent(g); 
	}
	
	void update() {
		x += xa;
		y += ya;
		System.out.println(x + " " + y);
	}
	
	private void fall() {
		y -= ya;
	}
}

