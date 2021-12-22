import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
class HiRound2 implements ActionListener {
	
	JFrame frame = new JFrame();

	JButton buttonOne = new JButton();
	JButton Next = new JButton();
	JButton Run = new JButton();
	JButton Exit = new JButton();
	JButton nextHeir = new JButton();
	JButton check = new JButton();
	JButton submit = new JButton();
	JButton Round2 = new JButton();
	JButton Round3 = new JButton();
	JPanel button_panel = new JPanel();
	JPanel button_panel_doors = new JPanel();
	JButton[] buttons = new JButton[9];
	JButton[] doors = new JButton[16];
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JTextField box = new JTextField();
    Border thickBorder = new LineBorder(new Color(220,169,60), 5);
	int count=0;
	int score=1000;
	String key="ABC";
	public HiRound2() {
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
		buttonOne.setText("ROUND TWO");
		buttonOne.setBackground(new Color(220,169,60));
		buttonOne.setForeground(Color.white);

		frame.add(buttonOne);
	
		frame.setVisible(true);
	}

	  public void instructRound2(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,1200);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(true);

		textarea.setBounds(50,50,530,500);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(220,169,60));
		textarea.setFont(new Font("Ink Free",Font.BOLD,20));
		textarea.setText("You are lost in a house. You saw 20 doors around you. But \n"
				+ "each exit is blocked by an electric barrier with a \n"
				+ "combination keypad. There is only one right exit!  \n"
				+ "There will be a voice announces that you must   \n"
				+ "enter a code consisting of three positive integers \r\n"
				+ "in ascending order (the  second number is  greater \n"
				+"than or equal to the first and the third \r\n"
				+ "is greater than or equal to the first and the second r\n"
				+ "You have three clues: r\n"
				+ "First: Product of the three numbers is 36.\r\n"
				+ "Second: The sum of the numbers is the same as the \n"
				+ "number of the hallway you entered. \n"
				+ "Third: The largest number appears only once\n"
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
	  public void Round2(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);

			Run.setBounds(100,630,100,100);
			Run.setFont(new Font("Ink Free",Font.BOLD,20));
			Run.setFocusable(false);
			Run.addActionListener(this);
			Run.setText("Run");
			Run.setBackground(new Color(25,25,25));
			Run.setForeground(Color.white);
			
			Exit.setBounds(200,630,100,100);
			Exit.setFont(new Font("Ink Free",Font.BOLD,20));
			Exit.setFocusable(false);
			Exit.addActionListener(this);
			Exit.setText("Exit");
			Exit.setBackground(new Color(25,25,25));
			Exit.setForeground(Color.white);
			
			textfield.setBounds(100,150,200,50);
			textfield.setBackground(new Color(25,25,25));
			textfield.setForeground(Color.gray);
			textfield.setFont(new Font("Ink Free",Font.BOLD,15));
			textfield.setHorizontalAlignment(JLabel.CENTER);
			textfield.setText("");
			textfield.setOpaque(true);
			textfield.setBorder(thickBorder);
			
			textarea.setBounds(320,200,300,300);
			textarea.setBackground(Color.black);
			textarea.setText("First: Product of the three numbers is 36.\r\n\n"
					+ "Second: He sum of the numbers is the same as the\n\n"
					+ "number of the hallway she entered. \n\n"
					+ "Third: The largest number appears only once\n\n"
					+ "You have 3 turns \n"
	);
			textarea.setBorder(null);
			button_panel.setBounds(100,200,200,200);
			button_panel.setLayout(new GridLayout(3,3));
			button_panel.setBorder(thickBorder);
			for(int i=0;i<9;i++) {
				buttons[i] = new JButton();
				button_panel.add(buttons[i]);
				buttons[i].setFont(new Font("MV Boli",Font.BOLD,13));
				buttons[i].setFocusable(false);
				buttons[i].addActionListener(this);
				String a=Integer.toString(i+1);
				buttons[i].setText(a);		
				buttons[i].setBackground(Color.white);
				buttons[i].setBorder(thickBorder);
			}
			frame.add(button_panel);
			frame.add(Run);
			frame.add(textfield);
			frame.add(textarea);
			frame.setVisible(true);
         }
	  public void Congratulations(){
			
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
			box.addActionListener(this);
			box.setText("Congratulations!");
			box.setEditable(false);
			frame.add(box);
			
			Round3.setBounds(270,600,100,70);
			Round3.setFont(new Font("Ink Free",Font.BOLD,10));
			Round3.setFocusable(false);
			Round3.addActionListener(this);
			Round3.setText("Round Three");
			Round3.setBackground(Color.white);
			Round3.setForeground(Color.black);
			frame.add(Round3);
			frame.add(box);
}
	 public void GameOver(){
			
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
			box.addActionListener(this);
			box.setText("Game Over");
			box.setEditable(false);
			
			Round2.setBounds(280,600,90,70);
			Round2.setFont(new Font("Ink Free",Font.BOLD,10));
			Round2.setFocusable(false);
			Round2.addActionListener(this);
			Round2.setText("Return");
			Round2.setBackground(Color.white);
			Round2.setForeground(Color.black);
			frame.add(Round2);
			frame.add(box);
	 }
	 public void Exit() {
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);

			button_panel_doors.setBounds(120,100,400,500);
			button_panel_doors.setLayout(new GridLayout(4,4));
			for(int i=0;i<16;i++) {
				doors[i] = new JButton();
				button_panel_doors.add(doors[i]);
				doors[i].setFont(new Font("MV Boli",Font.BOLD,13));
				doors[i].setFocusable(false);
				doors[i].addActionListener(this);
				String a=Integer.toString(i+1);
				doors[i].setText(a);	
				doors[i].setForeground(Color.white);
				doors[i].setBackground(new Color(220,169,60));
			    thickBorder = new LineBorder(Color.black, 10);
				doors[i].setBorder(thickBorder);			
				}
			frame.add(button_panel_doors);
	 }
@Override
public void actionPerformed(ActionEvent e) {
	   // clip.start();
	//buttonOne.setEnabled(false);
    if(e.getSource()==buttonOne ) {
    //	clip.stop();
    	frame.remove(buttonOne);
    	instructRound2();
	}
    if(e.getSource()==Next ) {
        //	clip.stop();
        	frame.remove(textarea);
        	frame.remove(Next);
        	Round2();
    	}
    for(int i=0;i<9;i++) {
		if(e.getSource()==buttons[i]) {
			if (i==0){
				textfield.setText("");
			}
			textfield.setText(textfield.getText()+buttons[i].getText());
			}
    }   
    if(e.getSource()==Exit ) {
    	frame.remove(Run);
		frame.remove(button_panel);
		frame.remove(textfield);
		frame.remove(textarea);
		frame.remove(Exit);
        Exit();
    	}
    if(e.getSource()==doors[12] ) {
        //	clip.stop();
    	Congratulations();
    	}
    if(e.getSource()==Round2 ) {
        //	clip.stop();
        	new HiRound1();
    	}
    if(e.getSource()==Run ) {
        //	clip.stop();
    	count+=1;
    	if (textfield.getText().equals("229")){
    		textfield.setText("Correct");
    		frame.add(Exit);
    	   }
    	else {
    		textfield.setText("Incorrect");
    	   }
    	if (count>3){
    		frame.remove(Run);
    		frame.remove(button_panel);
    		frame.remove(textfield);
    		frame.remove(textarea);
    		frame.remove(Exit);
    		GameOver();
    	   }
    	}
    if(e.getSource()==Round3 ) {
        //	clip.stop();
        	new HiRound3();
    	}
}
}
