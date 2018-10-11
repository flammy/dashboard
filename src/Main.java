import view.Start;
import javax.swing.JPanel;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
	    // TODO code application logic here
	    Start frame=new Start();
	    
	    JPanel panel = new GPanel();
	    
	    panel.setBackground(new java.awt.Color(255, 255, 255));
	    
	    frame.setContentPane(panel);
	}
}


class GPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr = (Graphics2D) g; 
        
        gr.drawString("Graph", 50, 50);
    }
}