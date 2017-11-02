import java.awt.event.*;  
import javax.swing.*;    


class MainInterface1 extends TestImageSplit1 {  
	
	
	
public static void main(String[] args) {  
	
	
    JFrame f=new JFrame("Image Split - Rupali Gupta");    
    JButton b=new JButton("Upload Image");  
    b.setBounds(100,100,195,30);    
    b.addActionListener(new ActionListener(){  
    	
    public void actionPerformed(ActionEvent e){
			int x = uploadimage(); 
			
			if(x==1) {
			f.dispose();}
			
        }  
    });  
    f.add(b);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  