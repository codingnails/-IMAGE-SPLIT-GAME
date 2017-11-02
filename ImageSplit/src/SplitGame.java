import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Date;
import java.util.Random;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

class SplitGame {

	static int splitgame(String s) {
	 JFrame frame =new JFrame("Image Split - Rupali Gupta");    

	 
	 
		JPanel panel = new JPanel(new GridLayout(3, 2));
		frame.setContentPane(panel);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);
		frame.setVisible(true);
		
		
		
		 JLabel label = new JLabel("Click on the Rightly Placed Image");
		    label.setFont(new Font("Serif", Font.PLAIN,12));
		    panel.add(label);
	

		 
		 
		    JLabel label0 = new JLabel("");
		    label.setFont(new Font("Serif", Font.PLAIN, 12));
		    panel.add(label0);
		   

		
		
		
		JLabel label1 = new JLabel();
		label1.setBorder(border);
		panel.add(label1);
		
		JLabel label2 = new JLabel();
		label2.setBorder(border);
		panel.add(label2);
		
		JLabel label3 = new JLabel();
		label3.setBorder(border);
		panel.add(label3);
		
		JLabel label4 = new JLabel();
		label4.setBorder(border);
		panel.add(label4);

		try {
			
			int flag =0;
			
	    String []a = {"img0.jpg","img1.jpg","img2.jpg","img3.jpg"};
	    Random r = new Random();
	    int Low = 0;
	    int High = 4;
	    
	    int Result = r.nextInt(High-Low) + Low;
	    int Result1 = r.nextInt(High-Low) + Low;
	    int Result2 = r.nextInt(High-Low) + Low;
	    int Result3 = r.nextInt(High-Low) + Low;
	    
	    if(Result==0) { flag =1;} 
	    if(Result1==1) {flag =1;} 
	    if(Result2 == 2) {flag =1;} 
	    if(Result3 != 3 && flag ==0) {Result3 = 3;}
	    
	System.out.println(Result+ ""+ Result1 + "" + Result2 + "" + Result3);
			
			
		    BufferedImage myPicture = ImageIO.read(new File(s+ a[Result]));	    
		  
		    
		    BufferedImage myPicture1 = ImageIO.read(new File(s+ a[Result1]));

		    
		    BufferedImage myPicture2 = ImageIO.read(new File(s+ a[Result2]));

		    
		    BufferedImage myPicture3 = ImageIO.read(new File(s+ a[Result3]));

	
		    Executors.newSingleThreadScheduledExecutor().schedule(new Runnable(){
		        @Override
		        public void run(){

		        	JOptionPane.showMessageDialog(null, "You Lost","Try Again Later", JOptionPane.NO_OPTION);
		        	frame.dispose();
		        		

		        }
		    }, 15, TimeUnit.SECONDS);
		    
		    
		    
		    
		    
		    
		    label1.setIcon(new ImageIcon(myPicture));
		    if(Result == 0) {
		    	
		    	label1.addMouseListener(new MouseAdapter()  
			    {  
			        public void mouseClicked(MouseEvent e)  
			        {  
			        	JOptionPane.showMessageDialog(null, "You won!","Congratulation", JOptionPane.NO_OPTION);
			        	frame.dispose();
			        		

			        }  
			    }); 
		    	
		    }
		    
		    
		    
		    label2.setIcon(new ImageIcon(myPicture1));
		    if(Result1 == 1) {
		    	
		    	label2.addMouseListener(new MouseAdapter()  
			    {  
			        public void mouseClicked(MouseEvent e)  
			        {  
			        	JOptionPane.showMessageDialog(null, "You won!","Congratulation", JOptionPane.NO_OPTION);
			        	frame.dispose();
			        		

			        }  
			    }); 
		    	
		    }
		    
		    label3.setIcon(new ImageIcon(myPicture2));
		    if(Result2 == 2) {
		    	
		    	label3.addMouseListener(new MouseAdapter()  
			    {  
			        public void mouseClicked(MouseEvent e)  
			        {  
			        	JOptionPane.showMessageDialog(null, "You won!","Congratulation", JOptionPane.NO_OPTION);
			        	frame.dispose();
			        		

			        }  
			    }); 
		    	
		    }
		    
		    label4.setIcon(new ImageIcon(myPicture3));
		    if(Result3 == 3) {
		    	
		    	label4.addMouseListener(new MouseAdapter()  
			    {  
			        public void mouseClicked(MouseEvent e)  
			        {  
			        	JOptionPane.showMessageDialog(null, "You won!","Congratulation", JOptionPane.NO_OPTION);
			        	frame.dispose();
			        		

			        }  
			    }); 
		    	
		    }
		    
		    
		    
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}

		frame.pack();
		frame.setMinimumSize(frame.getPreferredSize());
	    return 0;
	
	}
	
}
