import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DrawingApp extends JFrame {
    private DrawingCanvas canvas;

    public DrawingApp() {
        canvas = new DrawingCanvas();

        JButton saveButton = new JButton("Save Drawing");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveDrawing();
            }
        });

        setLayout(new BorderLayout());
        add(canvas, BorderLayout.CENTER);
        add(saveButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Drawing App");
        setSize(800, 600);
        setVisible(true);
    }

    private void saveDrawing() {
        BufferedImage image = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        canvas.paint(g);
        g.dispose();

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                ImageIO.write(image, "PNG", selectedFile);
                System.out.println("Image saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DrawingApp();
            }
        });
    }
}

class DrawingCanvas extends JPanel {
    private int prevX, prevY;
    private boolean dragging;
    private BufferedImage canvasImage;

    public DrawingCanvas() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);

        canvasImage = new BufferedImage(getPreferredSize().width, getPreferredSize().height, BufferedImage.TYPE_INT_ARGB);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                prevX = e.getX();
                prevY = e.getY();
                dragging = true;
            }

            public void mouseReleased(MouseEvent e) {
                dragging = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (dragging) {
                    int x = e.getX();
                    int y = e.getY();
                    Graphics2D g = canvasImage.createGraphics();
                    g.setColor(Color.BLACK);
                    g.drawLine(prevX, prevY, x, y);
                    repaint();
                    g.dispose();
                    prevX = x;
                    prevY = y;
                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(canvasImage, 0, 0, null);
    }
}

