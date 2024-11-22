import javax.swing.*;
import java.awt.event.*;
public class mymenu extends JFrame implements ActionListener,MouseListener{



    JLabel l;
    JPopupMenu popup;
    JMenuItem first,second;

    public mymenu()
    {

        setSize(400,500 );
setLayout(null);
        l = new JLabel();
        l.setBounds(100,100,150,75);
        popup = new JPopupMenu();
        first = new JMenuItem("first");
        
        second = new JMenuItem("second");
        add(popup);
        add(l);
        popup.add(first);
         popup.add(second);
         first.addActionListener(this);
        second.addActionListener(this);
        addMouseListener(this);
setVisible(true);
    }

    

    public void actionPerformed(ActionEvent ee)
    {
        if (ee.getSource() == first ) { // Right-click
            popup.show(this, ee.getX(), ee.getY());
    }

    public void mouseClicked(MouseEvent e)
    {
        
popup.show(null,e.getX(),e.getY());
        }
    }
    public static void main(String[] args)
    {
        new mymenu();
    }

    
}