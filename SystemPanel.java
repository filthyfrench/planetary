package hackBCA;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SystemPanel extends JFrame {
	private final static int HEIGHT = 700;
	private final static int WIDTH = 450;
	private Planet x;
	private SystemEvent game;
	
	public SystemPanel() {
		setSize(HEIGHT,WIDTH);
		setTitle("Planetary Sim");
		setBackground(Color.BLACK);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		game = new SystemEvent(this);
		add(game);
	}
	
	public static void main(String[] args) {
		new SystemPanel();
	}


}
