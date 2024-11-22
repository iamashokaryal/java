import javax.swing.*;
public class dialog{

    dialog()
    {

        JFrame f = new JFrame("Frame");
        f.setSize(300, 300);
    int name= JOptionPane.showConfirmDialog(f,"Are Yoou Sure");

       
        
    }
    public static void main (String[] args ){

        new dialog();
    }

}


