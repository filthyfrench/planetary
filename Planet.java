package hackBCA;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Planet extends JPanel {
	private int diameter = 30;
	private int x, xa = 1;
	private int y, ya = 1;
	private int k = 3 * diameter;
	private int distance;
	private SystemPanel game;

	public Planet(SystemPanel sys) {
		game = sys;
		x = game.getWidth() / 2 - 20;
		y = game.getHeight() / 2 - 20;
	}
	
	public Planet(SystemPanel sys, int newD) {
		game = sys;
		x = game.getWidth() / 2 - 20;
		y = game.getHeight() / 2 - 20;
		diameter = newD;
	}
	
	public Planet(SystemPanel sys, int newD, int newX, int newY) {
		game = sys;
		x = newX;
		y = newY;
		diameter = newD;
	}
	
	public Planet(SystemPanel sys, int newD, int newX, int newY, int newK) {
		game = sys;
		x = newX;
		y = newY;
		diameter = newD;
		k = newK;
	}
	
	public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, diameter, diameter);super.paintComponent(g); 
	}
	
	public void update() {
		x += xa;
		y += ya;
		distance += xa;
		distance += ya;
		System.out.println(distance);
	}
	
	public void moveRight() {
		x += xa;
		distance += xa;
	}
	
	public void moveLeft() {
		x -= xa;
		distance += xa;
	}
	
	public void moveUp() {
		y -= ya;
		distance += ya;
	}
	
	public void moveDown() {
		y += ya;
		distance += ya;
	}
	
	public void squareOrbit() {
		while (distance < k) {
			if (distance < k) {
				moveRight();
			}	
		}
		moveDown();

	}
}

