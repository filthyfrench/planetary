package hackBCA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SystemEvent extends JPanel implements ActionListener {
	private SystemPanel game;
	private Planet ter;
	int count = 100;
	
	public SystemEvent(SystemPanel sys) {
		setBackground(Color.BLACK);
		this.game = sys;
		ter = new Planet(game);
		// Timer firstTimer = new Timer(count, this); // do later; for gradual motion instead of immediate motion
        Timer timer = new Timer(30, this);
		timer.start();
        System.out.println(timer);
        setFocusable(true);
	}
	
	private void update() {
        ter.update();
    }
	
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        ter.paintComponent(g);
	}

}
