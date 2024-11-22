// Import the necessary packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Define a class that extends JFrame and implements ActionListener
public class popupmenu extends JFrame implements ActionListener {

    // Declare the components as instance variables
    private JPopupMenu popupMenu; // The popup menu
    private JMenuItem menuItem1, menuItem2, menuItem3; // The menu items
    private JLabel label; // The label to display the message

    // Define the constructor
    public popupmenu() {
        // Set the title and size of the frame
        super("Popup Menu Demo");
        setSize(300, 200);

        // Create the popup menu and add the menu items
        popupMenu = new JPopupMenu();
        menuItem1 = new JMenuItem("Red");
        menuItem2 = new JMenuItem("Green");
        menuItem3 = new JMenuItem("Blue");
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);

        // Add action listeners to the menu items
        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);

        // Create the label and set its alignment and font
        label = new JLabel("Click within the frame to show the popup menu");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Add the label to the center of the frame
        add(label, BorderLayout.CENTER);

        // Add a mouse listener to the frame to show the popup menu when clicked
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Set the default close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Define the actionPerformed method to handle the menu item clicks
    public void actionPerformed(ActionEvent e) {
        // Get the source of the action event
        Object source = e.getSource();

        // If the source is menuItem1, set the label text and background color to red
        if (source == menuItem1) {
            label.setText("Red item is selected");
            label.setBackground(Color.RED);
            label.setOpaque(true);
        }

        // If the source is menuItem2, set the label text and background color to green
        else if (source == menuItem2) {
            label.setText("Green item is selected");
            label.setBackground(Color.GREEN);
            label.setOpaque(true);
        }

        // If the source is menuItem3, set the label text and background color to blue
        else if (source == menuItem3) {
            label.setText("Blue item is selected");
            label.setBackground(Color.BLUE);
            label.setOpaque(true);
        }
    }

    // Define the main method to create an instance of the class
    public static void main(String[] args) {
        new popupmenu();
    }
}
