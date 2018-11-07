import view.Start;

import javax.swing.JFrame;
import javax.swing.JPanel;

import library.GraphPanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
	    // TODO code application logic here
		Random rnd=new Random();
	    Start frame=new Start();
	    List<Double> testScores=new ArrayList<Double>();
	    for(double i=1;i<100;i++) {
	    	testScores.add(null);
	    }
	    GraphPanel grPanel= new GraphPanel(testScores);
	    grPanel.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(grPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        while(true) 
        {        	        	       	
        		if(testScores.size()>100)
            	{
            		testScores.remove(0) ;
            	}
        		testScores.add(rnd.nextDouble());
        	
        	grPanel.setScores(testScores);    
        	try {
        		Thread.sleep(50);
				} 
        	catch (InterruptedException e) 
	    		{
        		e.printStackTrace();
	    		}
        }
	}
}
