import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.*;
public class HiRound5 implements ActionListener {
	
	JFrame frame = new JFrame();

	JButton buttonOne = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JLabel background = new JLabel();
	JLabel Prince = new JLabel();
	JLabel Princess = new JLabel();
	JLabel PrincessTwo = new JLabel();
	JLabel PrincessThree = new JLabel();
	JLabel lalala = new JLabel();
	JTextField textOne = new JTextField();
	JTextField textTwo = new JTextField();
	JTextField textThree= new JTextField();
	JButton Next = new JButton();
	JButton Round4 = new JButton();
	JTextField textfield = new JTextField();
	JTextField box = new JTextField();
	JTextArea textarea = new JTextArea();
    Border thickBorder = new LineBorder(Color.pink, 5);
	ImageIcon game8= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game8.jpg");
	ImageIcon prince= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game3.png");
	ImageIcon princess= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game10.png");
	ImageIcon img= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game9.png");
	ImageIcon img1= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game11.png");
	ImageIcon img2= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game12.png");
	int flag=0;
	int step=20;
	int check=0;
	int seconds=20;
	public HiRound5() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,1200);
		//frame.setIconImage(background.getImage());
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(false);	

		buttonOne.setBounds(120,100,400,400);
		buttonOne.setFont(new Font("MV Boli",Font.BOLD,45));
		buttonOne.setFocusable(false);
		buttonOne.addActionListener(this);
		buttonOne.setText("ROUND FIVE");
		buttonOne.setForeground(Color.white);
		buttonOne.setBackground(Color.pink);
	
		textOne.setBounds(23,200,60,60);
		textOne.setBackground(Color.black);
		textOne.setForeground(Color.white);
		textOne.setHorizontalAlignment(JLabel.CENTER);
		textOne.setFont(new Font("Ink Free",Font.BOLD,15));
		textOne.setText("THE");
		
		textTwo.setBounds(240,15,80,80);
		textTwo.setBackground(Color.black);
		textTwo.setForeground(Color.white);
		textTwo.setFont(new Font("Ink Free",Font.BOLD,15));
		textTwo.setHorizontalAlignment(JLabel.CENTER);
		textTwo.setText("LAST");
		
		textThree.setBounds(520,200,100,100);
		textThree.setBackground(Color.black);
		textThree.setForeground(Color.white);
		textThree.setFont(new Font("Ink Free",Font.BOLD,15));
		textThree.setHorizontalAlignment(JLabel.CENTER);
		textThree.setText("GAME");
	
		frame.add(buttonOne);
		frame.add(textOne);
		frame.add(textTwo);
		frame.add(textThree);
		frame.setVisible(true);
	}
	 public void instructRound5(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,1200);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(true);
		
		textarea.setBounds(50,50,530,500);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(Color.pink);
		textarea.setFont(new Font("Ink Free",Font.BOLD,25));
 textarea.setText("You have found the forest where the \n"
				+ "princess is. But you see three princesses.\n"
				+ "You have to use little time to rescue the\n"
				+ "princess, if you choose wrong you won't \n"
				+ "be able to rescue the princess. Remember \n"
				+ "that the princess is very beautiful and \n"
				+ "has a beautiful voice \n"	
);
		textarea.setOpaque(true);
		textarea.setBorder(thickBorder);

		Next.setBounds(280,600,90,70);
		Next.setFont(new Font("MV Boli",Font.BOLD,15));
		Next.setFocusable(false);
		Next.addActionListener(this);
		Next.setText("NEXT");
		Next.setBackground(Color.white);
		Next.setForeground(Color.black);
		
		frame.add(textarea);
		frame.add(Next);
	
		frame.setVisible(true);

    }
	 public void Round5(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(1200,700);
			frame.getContentPane().setBackground(new Color(200,100,80));
			frame.setLayout(null);
			frame.setResizable(true);
			
			background.setBounds(0,-15,1200,700);
			background.setIcon(game8);
			Prince.setBounds(500,400,300,300);
			Prince.setIcon(prince);
			Princess.setBounds(0,400,300,300);
			Princess.setIcon(princess);
			PrincessTwo.setBounds(50,300,300,300);
			PrincessTwo.setIcon(princess);
			lalala.setBounds(150,300,300,300);
			lalala.setIcon(img1);
			PrincessThree.setBounds(1000,300,300,300);
			PrincessThree.setIcon(img);
			
			button1.setBounds(130,660,20,20);
			button1.setFocusable(false);
			button1.addActionListener(this);
			button1.setBackground(Color.blue);
			button2.setBounds(200,550,20,20);
			button2.setFocusable(false);
			button2.addActionListener(this);
			button2.setBackground(Color.blue);
			button3.setBounds(1100,570,20,20);
			button3.setFocusable(false);
			button3.addActionListener(this);
			button3.setBackground(Color.blue);

		    
			frame.add(background);
		    background.add(Prince);
		    background.add(Princess);
		    background.add(PrincessTwo);
		    background.add(PrincessThree);
		    background.add(lalala);
		    background.add(button1);
		    background.add(button2);
		    background.add(button3);
			frame.setVisible(true);

	    }
	 public void Congratulations(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(1200,700);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);
			textTwo.setBounds(400,40,300,300);
			textTwo .setText("Congratulations!");
			textTwo.setFont(new Font("Ink Free",Font.BOLD,30));
			textTwo.setForeground(Color.white);
			textTwo.setBackground(null);
			
			frame.add(textTwo);
	 }
	 public void GameOver(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(1200,700);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);
			textTwo.setBounds(400,40,300,300);
			textTwo.setFont(new Font("Ink Free",Font.BOLD,30));
			textTwo.setForeground(Color.white);
			textTwo.setBackground(null);
			textTwo.setText("Game Over?");
			frame.add(textTwo);
			 }
	 Timer timer = new Timer(500, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				seconds--;
				Princess.setBounds(step,400,300,300);
				button1.setBounds(130+step,660,20,20);
				step=step+20;
				if(seconds<=0) {
					timer.stop();
					Congratulations();
				}
			}
			});
	@Override
	public void actionPerformed(ActionEvent e) {
		   // clip.start();
		//buttonOne.setEnabled(false);
	    if(e.getSource()==buttonOne ) {
	    	frame.remove(buttonOne);
	    	frame.remove(textOne);
	    	frame.remove(textTwo);
	    	frame.remove(textThree);
	    	instructRound5();
		}
	    if(e.getSource()==Next ) {
	    	frame.remove(textarea);
		    frame.remove(Next);
		   	Round5();
			}
	    if(e.getSource()==button1 ) {
	    	timer.start();
			}
	    if(e.getSource()==button2 ) {
	        PrincessTwo.setIcon(img2); 
	        GameOver();
		    			}
	    if(e.getSource()==button3 ) {
        	PrincessThree.setIcon(img2);
        	GameOver();
			}
	    
}
}

