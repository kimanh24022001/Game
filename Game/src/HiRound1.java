import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.*;
public class HiRound1 implements ActionListener {
	
	JFrame frame = new JFrame();

	JButton buttonOne = new JButton();
	JButton Next = new JButton();
	JButton Go = new JButton();
	JButton nextHeir = new JButton();
	JButton check = new JButton();
	JButton submit = new JButton();
	JButton Round1 = new JButton();
	JButton Round2 = new JButton();
	JPanel button_panel = new JPanel();
	JButton[] Cabinets = new JButton[100];
	JTextField textfield = new JTextField();
	JTextField box = new JTextField();
	JTextField gameover = new JTextField();
	JTextArea textarea = new JTextArea();
	Border thickBorder = new LineBorder(new Color(100,150,200), 5);
	int count=0;
	int score=100;
	int mistake=0;
	String key="helloalice";
	public HiRound1() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,1200);
		//frame.setIconImage(background.getImage());
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(false);
		

		buttonOne.setBounds(120,100,400,400);
		buttonOne.setFont(new Font("MV Boli",Font.BOLD,50));
		buttonOne.setFocusable(false);
		buttonOne.addActionListener(this);
		buttonOne.setText("ROUND ONE");
		buttonOne.setBackground(new Color(100,150,200));
		buttonOne.setForeground(Color.white);

		frame.add(buttonOne);
	
		frame.setVisible(true);
	}
	 public void instructRound1(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,1200);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(true);
		
		textarea.setBounds(50,50,530,500);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(100,150,200));
		textarea.setFont(new Font("Ink Free",Font.BOLD,20));
        textarea.setText("There will be a total of 100 cabinets containing 100\n"
				+ " numbers. Starting from 1 to 100 heir some cabinets  \n"
				+ "will be changed lockers. At the end, some will be opened\n"
				+ "and password is contained. \n"
				+ "You need to find the right password \n"
				+ "After each heir, your points will be misused 10.\n"		
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
	 public void Round1(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);

			nextHeir.setBounds(40,630,140,100);
			nextHeir.setFont(new Font("Ink Free",Font.BOLD,18));
			nextHeir.setFocusable(false);
			nextHeir.addActionListener(this);
			nextHeir.setText("NEXT HEIR");
			nextHeir.setBackground(new Color(25,25,25));
			nextHeir.setForeground(Color.white);
		
			Go.setBounds(200,630,100,100);
			Go.setFont(new Font("Ink Free",Font.BOLD,20));
			Go.setFocusable(false);
			Go.addActionListener(this);
			Go.setText("Go");
			Go.setBackground(new Color(25,25,25));
			Go.setForeground(Color.white);
			
			textfield.setBounds(500,630,100,100);
			textfield.setBackground(new Color(25,25,25));
			textfield.setForeground(Color.gray);
			textfield.setFont(new Font("Ink Free",Font.BOLD,15));
			textfield.setHorizontalAlignment(JLabel.CENTER);
			String stringscore=Integer.toString(score);
			textfield.setText("SCORE :"+stringscore);
			textfield.setOpaque(true);
			
			button_panel.setBounds(20,20,600,600);
			button_panel.setLayout(new GridLayout(10,10));
			for(int i=0;i<100;i++) {
				Cabinets[i] = new JButton();
				button_panel.add(Cabinets[i]);
				Cabinets[i].setFont(new Font("MV Boli",Font.BOLD,13));
				Cabinets[i].setFocusable(false);
				Cabinets[i].addActionListener(this);
				String a=Integer.toString(i+1);
				Cabinets[i].setText(a);		
				Cabinets[i].setBackground(new Color(130,150,200));
			}
		    frame.add(nextHeir);
			frame.add(button_panel);
			frame.add(Go);
			frame.add(textfield);
			frame.setVisible(true);

	    }
	 public void Answer(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);

			box.setBounds(120,320,400,80);
			box.setBackground(new Color(25,25,25));
			box.setForeground(Color.white);
			box.setFont(new Font("Ink Free",Font.BOLD,15));
			box.setHorizontalAlignment(JLabel.CENTER);
			box.setOpaque(true);
			box.setText("Enter the code to open the door");
			box.addActionListener(this);

			submit.setBounds(250,400,130,60);
			submit.setForeground(Color.black);
			submit.setFont(new Font("Ink Free",Font.BOLD,15));
			submit.setText("Submit");
			submit.setFocusable(false);
			submit.addActionListener(this);
			frame.add(submit);
			frame.add(box);
	 }
	 public void Congratulations(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);

			box.setText("Congratulations!");
			frame.add(box);
			
			Round2.setBounds(280,600,90,70);
			Round2.setFont(new Font("Ink Free",Font.BOLD,10));
			Round2.setFocusable(false);
			Round2.addActionListener(this);
			Round2.setText("Round Two");
			Round2.setBackground(Color.white);
			Round2.setForeground(Color.black);
			frame.add(Round2);
	 }
	 public void GameOver(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);

			gameover.setBounds(120,320,400,80);
			gameover.setBackground(new Color(25,25,25));
			gameover.setForeground(Color.white);
			gameover.setFont(new Font("Ink Free",Font.BOLD,15));
			gameover.setHorizontalAlignment(JLabel.CENTER);
			gameover.setOpaque(true);
			gameover.setText("Game Over");
			
			Round1.setBounds(280,600,90,70);
			Round1.setFont(new Font("Ink Free",Font.BOLD,15));
			Round1.setFocusable(false);
			Round1.addActionListener(this);
			Round1.setText("Return");
			Round1.setBackground(Color.white);
			Round1.setForeground(Color.black);
			frame.add(Round1);
			frame.add(gameover);
			}
		

	@Override
	public void actionPerformed(ActionEvent e) {
	    if(e.getSource()==buttonOne ) {
	    //	clip.stop();
	    	frame.remove(buttonOne);
	    	instructRound1();
		}
	    if(e.getSource()==Next ) {
		    //	clip.stop();
		    	frame.remove(textarea);
		    	frame.remove(Next);
		    	Round1();
			}
	    if(e.getSource()== nextHeir ) {
	            count=count+1;
		    	for(int i=0;i<100;i++) {
		    		if ((i+1)%count==0){
					  if ( Cabinets[i].getText()==" " ){
						 String a=Integer.toString(i+1);
						 Cabinets[i].setText(a);		
						 Cabinets[i].setBackground(new Color(130,150,200));
				     	 }
					  else {
					     Cabinets[i].setText(" ");	
					     Cabinets[i].setBackground(Color.gray);
					      }
					}
				}
		    	score=score-10;
		    	String stringscore=Integer.toString(score);
				textfield.setText("SCORE :"+stringscore);
		    
		    	// Round1();
			}
	    if(e.getSource()== Go ) {
	    	for(int i=0;i<100;i++) {
				String a=Integer.toString(i+1);
				Cabinets[i].setText(a);		
				Cabinets[i].setBackground(new Color(130,150,200));
			}
	    	check.setBounds(40,630,140,100);
			check.setFont(new Font("Ink Free",Font.BOLD,10));
			check.setFocusable(false);
			check.addActionListener(this);
			check.setBackground(new Color(25,25,25));
			check.setForeground(Color.white);
			check.setText("CHECK ANSWER");
			frame.remove(nextHeir);
			frame.add(check);
			}
	  for(int i=0;i<100;i++) {
	    if (e.getSource()== Cabinets[i]) {
	    	if (i==0) {
	    	  Cabinets[0].setText("h");		
			  Cabinets[0].setBackground(Color.PINK);
		    }
	    	else if (i==3) {
				Cabinets[3].setText("e");		
				Cabinets[3].setBackground(Color.PINK);
			}
		    else if  (i==8){
				Cabinets[8].setText("l");		
				Cabinets[8].setBackground(Color.PINK);
			}
		    else if (i==15) {
				Cabinets[15].setText("l");		
				Cabinets[15].setBackground(Color.PINK);
			}
		    else if (i==24) {
				Cabinets[24].setText("o");		
				Cabinets[24].setBackground(Color.PINK);
			}
		    else if (i==35) {
				Cabinets[35].setText("a");		
				Cabinets[35].setBackground(Color.PINK);
			}
		    else if (i==48) {
				Cabinets[48].setText("l");		
				Cabinets[48].setBackground(Color.PINK);
			}
		    else if (i==63) {
				Cabinets[63].setText("i");		
				Cabinets[63].setBackground(Color.PINK);
			}
		    else if (i==80) {
				Cabinets[80].setText("c");		
				Cabinets[80].setBackground(Color.PINK);
			}
		    else if (i==99) {
				Cabinets[99].setText("e");		
				Cabinets[99].setBackground(Color.PINK);
			}
	    	mistake++;
	    	if (mistake==11) {
				frame.remove(Go);
				frame.remove(check);
		    	frame.remove(button_panel);
		    	GameOver();
		    }
	    }			
	   }
		if (e.getSource()== check) {
			frame.remove(Go);
			frame.remove(check);
	    	frame.remove(button_panel);
			Answer();
		}
		if (e.getSource()== submit) {
			frame.remove(submit);
	    	frame.remove(textfield);
			if ( box.getText().equals(key)) {
				Congratulations();
			}
			else {
				GameOver();
			}
		}
		  if(e.getSource()==Round1 ) {
			    	new HiRound1();
				}

		  if(e.getSource()==Round2 ) {
			    //	clip.stop();
			    	//frame.remove(Next);
			    	new HiRound2();
				}
	}
	
}
