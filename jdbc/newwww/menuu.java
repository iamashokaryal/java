import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class menuu implements ActionListener {

    JFrame f;
    JMenuBar jm;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste;
    JTextArea ta;
    menuu()
    {

f = new JFrame();
f.setSize(400,600);
f.setLayout(null);
jm = new JMenuBar();
file = new JMenu("File");
edit = new JMenu("edit");
help= new JMenu("help");

copy = new JMenuItem("copy");
cut = new JMenuItem("cut");
paste = new JMenuItem("paste");

copy.addActionListener(this);
cut.addActionListener(this);
paste.addActionListener(this);

copy.add(copy);
cut.add(cut);
paste.add(paste);

jm.add(file);
jm.add(edit);
jm.add(help);
ta = new JTextArea();
ta.setBounds(5, 5, 360, 320);
f.setVisible(true);
f.setJMenubar(jm);
    }
}
class hello{
    public static void main(String[] args)
    {
        new menuu();    }

    }
