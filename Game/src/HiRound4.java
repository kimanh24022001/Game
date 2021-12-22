import java.util.Scanner;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HiRound4 implements ActionListener {
	
	JFrame frame = new JFrame();
 	Scanner scanner = new Scanner(System.in);
	JButton buttonOne = new JButton();
	JTextField textOne = new JTextField();
	JTextField textTwo = new JTextField();
	JTextField textThree= new JTextField();
	JTextField textFour= new JTextField();
	JButton Next = new JButton();
	JButton next = new JButton();
	JButton submit = new JButton();
	JButton Round1 = new JButton();
	JButton Round4 = new JButton();
	JPanel button_panel = new JPanel();
	JButton[] Buttons = new JButton[110];
	JTextField textfield = new JTextField();
	JTextField box = new JTextField();
	JTextArea textarea = new JTextArea();
    Color yellow=new Color(200,209,90);
    Color blue=new Color(100,110,200);
    Border thickBorder = new LineBorder(new Color(200,209,90), 5);
    JLabel game1_label = new JLabel();
    JLabel game2_label = new JLabel();
    JLabel game3_label = new JLabel();
    JLabel game4_label = new JLabel();
    JLabel game5_label = new JLabel();
	ImageIcon game1= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game1.png");
	ImageIcon game2= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game2.png");
	ImageIcon game3= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game3.png");
	ImageIcon game4= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game4.png");
	ImageIcon game5= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game5.png");
	int flag=0;
	int temp=0;
	int count=4;
	public HiRound4() {
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
		buttonOne.setText("ROUND FOUR");
		buttonOne.setForeground(Color.white);
		buttonOne.setBackground(new Color(100,150,120));
		
		frame.add(buttonOne);
		frame.add(textOne);
		frame.add(textTwo);
		frame.add(textThree);
		frame.add(textFour);
		frame.setVisible(true);
	}
	 public void instructRound4(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,1200);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(true);
		
		textarea.setBounds(50,50,530,500);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(200,209,90));
		textarea.setFont(new Font("Ink Free",Font.BOLD,15));
        textarea.setText("You will meet 3 friends and you have to rescue them from the zombie killers."
		        +"The only way to do that is to cross an old rope bridge spanning a massive gorge. "
		        +"You can dash across in a minute while your friends take 2 minutes, 5 minutes, and 10 "
		        +"minutes each. The zombies will catch up to you in 17 minutes, so you only have that "
		        +"much time to get everyone to the other side and cut the rope. Unfortunately, the "
		        +"bridge can only accommodate two people at a time. To make matters worse, it's so dark \n"
				+ "out that you can barely see. Can you figure out a way to have everyone escape in time. \n"
				+ "Remember: no more than two people cross the bridge together, anyone crossing must \n"
				+ "either hold the lantern or stay right next to it, and any of you can safely wait in  \n"
				+ "the dark on either side of the gorge. everyone must be safely across before the \r\n"
				+ "Can you figure out a way to have everyone escape in time?\r\n"
				+ "zombies arrive, otherwise, the first zombie could step on the bridge while people are \r\n"
				+ "still on it.\r\n"
	
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
	 public void Round4(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(600,1300);
			frame.getContentPane().setBackground(Color.white);
			frame.setLayout(null);
			frame.setResizable(true);
			
			textOne.setBounds(0,80,100,100);
			textOne .setText("2 Minutes");
			textOne.setFont(new Font("MV Boli",Font.BOLD,17));
			textOne.setForeground(Color.black);
			textOne.setBackground(null);			
			textTwo.setBounds(100,80,100,100);
			textTwo .setText("10 Minutes");
			textTwo.setFont(new Font("MV Boli",Font.BOLD,17));
			textTwo.setForeground(Color.black);
			textTwo.setBackground(null);
			textThree.setBounds(200,80,100,100);
			textThree .setText("1 Minutes");
			textThree.setFont(new Font("MV Boli",Font.BOLD,17));
			textThree.setForeground(Color.black);
			textThree.setBackground(null);
			textFour.setBounds(300,80,100,100);
			textFour .setText("5 Minutes");
			textFour.setFont(new Font("MV Boli",Font.BOLD,17));
			textFour.setForeground(Color.black);
			textFour.setBackground(null);
			
			game1_label.setBounds(-20,330,150,170);
			game1_label.setIcon(game1);	
			game2_label.setBounds(100,300,200,200);
			game2_label.setIcon(game2);	
			game3_label.setBounds(170,200,160,300);
			game3_label.setIcon(game3);	
			game4_label.setBounds(300,200,250,300);
			game4_label.setIcon(game4);	
			game5_label.setBounds(400,200,600,200);
			game5_label.setIcon(game5);	
			
			next.setBounds(100,600,90,70);
			next.setFont(new Font("MV Boli",Font.BOLD,15));
			next.setFocusable(false);
			next.addActionListener(this);
			next.setText("NEXT");
			next.setBackground(Color.white);
			next.setForeground(Color.black);
		
			frame.add(next);
			frame.add(game1_label);
			frame.add(game2_label);
			frame.add(game3_label);
			frame.add(game4_label);
			frame.add(game5_label);
			frame.add(textOne);
			frame.add(textTwo);
			frame.add(textThree);
			frame.add(textFour);
		//	game1_label.addKeyListener(this);
			frame.setVisible(true);

	    }
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		   // clip.start();
		//buttonOne.setEnabled(false);
	    if(e.getSource()==buttonOne ) {
	    	frame.remove(buttonOne);
	    	frame.remove(textOne);
	    	frame.remove(textTwo);
	    	frame.remove(textThree);
	    	frame.remove(textFour);
	    	instructRound4();
		}
	    if(e.getSource()==Next ) {
		    //	clip.stop();
		    	frame.remove(textarea);
		    	frame.remove(Next);
		    	Round4();
			}
	    if(e.getSource()==next ) {
		    //	clip.stop();
		    	frame.remove(textarea);
		    	frame.remove(Next);
		    	new round4();
			}

}
}

