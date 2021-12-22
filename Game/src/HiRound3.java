import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.*;
public class HiRound3 implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton buttonOne = new JButton();
    Border thickBorder = new LineBorder(new Color(200,209,90), 5);
	JTextField gameover = new JTextField();
	JTextField textTwo = new JTextField();
	JButton Next = new JButton();
	JButton submit = new JButton();
	JButton Round3 = new JButton();
	JButton Round4 = new JButton();
	JButton yellow = new JButton();
	JButton blue = new JButton();
	JPanel button_panel = new JPanel();
	JButton[] Buttons = new JButton[110];
	JTextField textfield = new JTextField();
	JTextField box = new JTextField();
	JTextArea textarea = new JTextArea();
	int results=1;
	int[] flagYellowBlue=
		   {0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            1,1,1,1,0,1,1,1,1,1,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0};
	int[][] keyflagYellowBlue= {
			
			{0,0,0,0,1,0,0,0,0,0,
		                      0,0,0,0,1,0,0,0,0,0,
		                      0,0,0,0,1,0,0,0,0,0,
		                      0,0,0,0,1,0,0,0,0,0,
		                      0,0,0,0,1,0,0,0,1,0,
		                      0,0,0,0,1,1,1,1,1,0,
		                      0,1,1,1,1,0,0,0,0,0,
		                      0,0,0,0,1,0,0,0,0,0,
		                      0,0,0,0,1,0,0,0,0,0,
		                      0,0,0,1,1,0,0,0,0,0,
		                      0,0,0,0,0,0,0,0,0,0},
			
			{0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,1,1,1,1,0,0,0,1,0,
            0,0,0,0,1,1,1,1,1,0,
            1,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,1,1,0,0,0,
            0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,1,1,1,1,0,0,0,0,0,
            0,0,0,0,1,1,1,1,1,0,
            1,0,0,0,1,0,0,0,1,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,0,1,0,0,0,0,0,
            0,0,0,1,1,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,1,1,1,1,0,0,0,0,0,
0,0,0,0,1,1,1,1,1,0,
0,0,0,0,1,0,0,0,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,1,0,0,0,0,
0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,1,0,
0,0,0,0,1,1,1,1,1,0,
0,1,1,1,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,1,0,0,0,0,
0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,1,1,1,1,0,
0,1,1,1,1,0,0,0,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,1,0,0,0,0,
0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,1,1,1,1,0,
0,1,1,1,1,0,0,0,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,1,1,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,1,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,1,1,1,1,0,
0,1,1,1,1,0,0,0,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,1,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,1,0,
0,0,0,0,1,1,1,1,1,0,
0,1,1,1,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,0,1,1,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,1,1,1,1,0,
0,1,1,1,1,0,0,0,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,0,1,1,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,1,0,
0,0,0,0,1,1,1,1,1,0,
0,1,1,1,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,0,1,1,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,1,1,1,1,0,0,0,0,0,
0,0,0,0,1,1,1,1,1,0,
0,0,0,0,1,0,0,0,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,0,1,1,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,1,1,1,1,0,0,0,1,0,
0,0,0,0,1,1,1,1,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,1,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,1,1,1,1,0,0,0,0,0,
0,0,0,0,1,1,1,1,1,0,
0,0,0,0,1,0,0,0,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},
{0,0,0,0,0,0,0,0,0,0,
0,0,0,1,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,1,1,1,1,0,0,0,1,0,
0,0,0,0,1,1,1,1,1,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0,
0,0,0,0,1,0,0,0,0,0},};
	int flag=0;
	int temp=0;
	int check=0;
	int time=0;
	public HiRound3() {
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
		buttonOne.setText("ROUND THREE");
		buttonOne.setForeground(Color.white);
		buttonOne.setBackground(new Color(200,209,90));
		
		frame.add(buttonOne);
		frame.setVisible(true);
	}
	 public void instructRound3(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,1200);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.setResizable(true);
		
		textarea.setBounds(50,50,530,500);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(200,209,90));
		textarea.setFont(new Font("Ink Free",Font.BOLD,20));
        textarea.setText("Do you like jigsaw puzzles?\n"
				+ "There are squares with only 2 colors, blue and yellow.\n"
				+ " Your task is to make sure that each square can  \n"
				+ "move to all the squares of the same color as it vertically \n"
				+ "or horizontally. Satisfy the rules: \r\n"
				+ "No square may be moved more than onc \n"
				+ "No more than six total swaps are allowed \n"

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
	 public void Round3(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(new Color(200,100,80));
			frame.setLayout(null);
			frame.setResizable(true);
			
			button_panel.setBounds(15,15,600,500);
			button_panel.setLayout(new GridLayout(11,10));
			for(int i=0;i<110;i++) {
				Buttons[i] = new JButton();
				button_panel.add(Buttons[i]);
				Buttons[i].setFont(new Font("MV Boli",Font.BOLD,13));
				Buttons[i].setFocusable(false);
				Buttons[i].addActionListener(this);
				if (flagYellowBlue[i]==1) {
					Buttons[i].setBackground(new Color(100,110,200));
				}
				else{
					Buttons[i].setBackground(new Color(200,209,90));
				}
			}
	
			frame.add(button_panel);
			frame.setVisible(true);

	    }
	 public void Congratulations(){
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(650,1200);
			frame.getContentPane().setBackground(Color.black);
			frame.setLayout(null);
			frame.setResizable(true);
			textTwo.setBounds(200,40,300,300);
			textTwo .setText("Congratulations!");
			textTwo.setFont(new Font("Ink Free",Font.BOLD,30));
			textTwo.setForeground(Color.white);
			textTwo.setBackground(null);
			
			Round4.setBounds(280,600,90,70);
			Round4.setFont(new Font("Ink Free",Font.BOLD,10));
			Round4.setFocusable(false);
			Round4.addActionListener(this);
			Round4.setText("Round Two");
			Round4.setBackground(Color.white);
			Round4.setForeground(Color.black);
		//	for(int i=0;i<110;i++) {
			//	if (Buttons[i].setBackground()
			frame.add(Round4);
			frame.add(textTwo);
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
			
			Round3.setBounds(280,600,90,70);
			Round3.setFont(new Font("Ink Free",Font.BOLD,15));
			Round3.setFocusable(false);
			Round3.addActionListener(this);
			Round3.setText("Return");
			Round3.setBackground(Color.white);
			Round3.setForeground(Color.black);
			
			frame.add(Round3);
			frame.add(gameover);
			frame.add(gameover);
			
			 }
    void swap(int a,int b) {
      //  System.out.println(b);  

    	int tmp=a;
    	a=b;
    	b=tmp;
        System.out.println(b);  

    }
	@Override
	public void actionPerformed(ActionEvent e) {
		   // clip.start();
		//buttonOne.setEnabled(false);
	    if(e.getSource()==buttonOne ) {
	    	frame.remove(buttonOne);
	    	instructRound3();
		}
	    if(e.getSource()==Next ) {
		    //	clip.stop();
		    	frame.remove(textarea);
		    	frame.remove(Next);
		    	Round3();
			}
	    if(e.getSource()==Round3 ) {
		    //	clip.stop();
		    	new HiRound3();
			}
	    for(int i=0;i<110;i++) {
	    	if(e.getSource()==Buttons[i]) {
	    		Buttons[i].setEnabled(false);
	    		if (flag==0) {
	    			temp=i;
	    			flag=1;
	    		}
	    		else if ((i==temp-1) || (i==temp+1)|| (i==temp-10)||(i==temp+10)||(i==temp+11) ||(i==temp+9)||(i==temp-9)||(i==temp-11)) {
	    			Color a=Buttons[i].getBackground();
	    			Color b=Buttons[temp].getBackground();
	    			Buttons[i].setBackground(b);
	    			Buttons[temp].setBackground(a);
	    			time++;
	    			flag=0;
					
	    			//swap(flagYellowBlue[i],flagYellowBlue[temp]);
	    			int tmp=flagYellowBlue[i];
	    			flagYellowBlue[i]=flagYellowBlue[temp];
	    			flagYellowBlue[temp]=tmp;
	    			if (time==6) { 		

		    			for (int k=0;k<15;k++) {
	    					int count=0;
	    					for (int j=0;j<110;j++) {

	    						if (flagYellowBlue[j]==keyflagYellowBlue[k][j]) {
	    					      System.out.println(k);  
	    					//      System.out.println(keyflagYellowBlue[k][j]);  

	    							    count++;
	    							//    GameOver();

	    						}
    					      //  System.out.println(count);  
	    						if (count==110) {
	    							results=0;
	    							frame.remove(button_panel);
	    	    			    	Congratulations();
	    					     	break;

	    						}	    			    				
	    					 }
	    					}
	    				if (results==1) {
	    					frame.remove(button_panel);
							GameOver();
	    				}
	    				}

	    		}
	    		
	    		}
	    
	    	}
	    	
}
}

