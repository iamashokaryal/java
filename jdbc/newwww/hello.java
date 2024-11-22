import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
class DrawBarChart extends JPanel{
double[] values = {46,94,85}; //array of student number (double)
String[] labels = {"Java","C","C++"}; // array of subject number(String) 
Color[] colors = {Color.green,Color.red,Color.blue}; //array of color for different bar 
int panelWidth,panelHeight,barWidth; 
int vgap=30; //top and bottom margin(vertical gap)
int hgap=40; //left and right margin(horizontal gap)
public DrawBarChart(){
int maxValue=0,labelMaxValue=0; 
for(int i=0;i<values.length;i++){
if(maxValue < values[i]){
maxValue = (int)values[i]; //sorting max value to be drawn 
}
if(labelMaxValue < labels[i].length()){
labelMaxValue = labels[i].length(); //for barWidth , sorting max length string
}
}
20 | P a g e
barWidth = labelMaxValue*values.length; //setting barWidth like Java =4 and 3(4*3=12px)
panelHeight = maxValue*3+2*vgap; // dynamically assigned panel height (94*3+2*30 = 342px)
panelWidth = barWidth*25+2*hgap; // dynamically assigned panel width (12*25+2*40 = 380px)
System.out.println(panelWidth+" "+panelHeight); //see console
setSize(panelWidth,panelHeight); //now seting(dynamic) panel size(380,342)
}
public int setHeight(){ // return height for frame
return panelHeight;
}
public int setWidth(){ //return width for frame
return panelWidth;
}
public void paintComponent(Graphics g){
super.paintComponent(g);
int initialX = 80; //first bar initial x-coordinate
int initialY;
for(int i=0;i<values.length;i++){
initialY = panelHeight-3*vgap-(int)values[i]*2; // for individual y-coordinate 
g.setColor(colors[i]); //setting particular color
g.fillRect(initialX, initialY, barWidth*4, (int)values[i]*2); //(int)values[i]*2 magnify height of bar twice
g.setColor(Color.BLACK);
g.drawRect(initialX, initialY, barWidth*4, (int)values[i]*2);
g.setFont(new Font("Times New Roman",Font.BOLD,20));
g.drawString(labels[i], initialX+4, panelHeight-64);
initialX = initialX+(barWidth*4);
}
}
}
public class BarChartExample {
public static void main(String[] args) {
JFrame frame = new JFrame("Bar Chart");
DrawBarChart dbc = new DrawBarChart();
int w = dbc.setWidth(); // width of frame dynamically 
int h = dbc.setHeight(); // height of frame dynamically
frame.add(dbc);
frame.setSize(w,h);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.setVisible(true);
}
}
