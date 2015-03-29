package hackBCA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Planet extends JPanel {
	private static final int LENGTH = 30;
	private static final int WIDTH = 30;

	public Planet(SystemPanel sys) {
		
	}
	
	public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(200, 150, LENGTH, WIDTH);
	}
	
}

