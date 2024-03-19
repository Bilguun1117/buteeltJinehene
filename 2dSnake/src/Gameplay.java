import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel {
	
	private int[] snakexlength= new int[750];
	private int[] snakeylength = new int[750];
	
	
	private boolean right=false;
	private boolean left= false;
	private boolean up = false;
	private boolean down = false;
	
	private ImageIcon rightmouth;
	private ImageIcon leftmouth;
	private ImageIcon upmouth;
	private ImageIcon downmouth;
	private ImageIcon snakeimage;
	
	
	private Timer timer;
	private int delay=100;
	
	private int lengthofsnake=3;
	
	
	
	
    private ImageIcon titleImage;
	private int a;      
    
	public Gameplay() {
		
	}
	public void paint(Graphics g) {
		
		
		
		
		//border of title image
		g.setColor(Color.blue);
		g.drawRect(24,10,851,55);
		titleImage = new ImageIcon("snake-head-scratch (2).jpg");
		titleImage.paintIcon(this, g, 25, 11 );
		
		//border of gameplay
		g.setColor(Color.white);
		g.drawRect(24,74,851,577);
		g.setColor(Color.BLACK);
		g.fillRect(25, 75, 850, 575);
		
		
		rightmouth = new ImageIcon("snake-head-scratch (2).jpg");
		rightmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);
		
		for(int a=0; a<lengthofsnake; a++);
		{
			if(a==0 && right)
			{
				rightmouth = new ImageIcon("snake-head-scratch (2).jpg");
				rightmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}
			if(a==0 && left)
			{
				leftmouth = new ImageIcon("snake-head-scratch (3).jpg");
				leftmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}if(a==0 && right)
			{
				upmouth = new ImageIcon("snake-head-scratch (4).jpg");
				upmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}if(a==0 && right)
			{
				downmouth = new ImageIcon("snake-head-scratch (4) - Copy.jpg");
				downmouth.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			}
			
			if(a!=0)
			{
				snakeimage=new ImageIcon("snake-head-filled-outline-icon-line-vector-sign-linear-colorful-pictogram-isolated-white-symbol-logo-illustration-pixel-perfect-106714293 (3).jpg");
			    snakeimage.paintIcon(this, g, snakexlength[a], snakeylength[a]);
			
			
			
			
			}
		}
		     g.dispose();
		
		
		
		
		
	}
}

