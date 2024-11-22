import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingBallExample {
	private JFrame frame;
	private JPanel ballPanel;
	private JButton upButton, downButton, rightButton, leftButton;
	private int ballX, ballY;

	public MovingBallExample() {
    	frame = new JFrame("Moving Ball Example");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 
    	ballX = 150; // Initial X position of the ball
    	ballY = 150; // Initial Y position of the ball
   	 
    	ballPanel = new JPanel() {
        	public void paintComponent(Graphics g) {
            	super.paintComponent(g);
            	g.setColor(Color.RED);
            	g.fillOval(ballX, ballY, 50, 50);
        	}
    	};
   	 
    	upButton = new JButton("Up");
    	downButton = new JButton("Down");
    	rightButton = new JButton("Right");
    	leftButton = new JButton("Left");
   	 
    	upButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	ballY -= 10;
            	ballPanel.repaint();
        	}
    	});
   	 
    	downButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	ballY += 10;
            	ballPanel.repaint();
        	}
    	});
   	 
    	rightButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	ballX += 10;
            	ballPanel.repaint();
        	}
    	});
   	 
    	leftButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	ballX -= 10;
            	ballPanel.repaint();
        	}
    	});
   	 
    	frame.setLayout(new BorderLayout());
    	frame.add(ballPanel, BorderLayout.CENTER);
   	 
    	JPanel buttonPanel = new JPanel();
    	buttonPanel.add(upButton);
    	buttonPanel.add(downButton);
    	buttonPanel.add(rightButton);
    	buttonPanel.add(leftButton);
   	 
    	frame.add(buttonPanel, BorderLayout.SOUTH);
   	 
    	frame.setSize(400, 400);
    	frame.setVisible(true);
	}
    
	public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
            	new MovingBallExample();
        	}
    	});
	}
}
