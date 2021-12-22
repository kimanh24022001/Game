
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class round4 extends JFrame implements ActionListener{

	Scanner scanner = new Scanner(System.in);
	JLabel []game_label = new JLabel[5];
	JLabel background = new JLabel();
	JLabel zombie = new JLabel();
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JButton buttonThree = new JButton();
	JButton buttonFour = new JButton();
	JButton Round5 = new JButton();
	JButton Round3 = new JButton();
	JTextField textOne = new JTextField();
	ImageIcon game1= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game1.png");
	ImageIcon game2= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game2.png");
	ImageIcon game3= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game3.png");
	ImageIcon game4= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game4.png");
	ImageIcon game5= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game5.png");
	ImageIcon game6= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game6.jpg");
	ImageIcon game7= new ImageIcon("C:\\Users\\DELL\\Downloads\\Game\\src\\game7.png");
	int []time= {2,10,1,5};
	int flag=0,c=0,temp,max=0;
	int TIME=17;
	int count=0;	
	round4(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,1200);
		this.setLayout(null);
		
		background.setBounds(0,-270,1200,1200);
		background.setIcon(game6);
		
		zombie.setBounds(0,800,110,110);
		zombie.setIcon(game7);
		game_label[0] = new JLabel();
		game_label[0].setBounds(-20,600,150,170);
		game_label[0].setIcon(game1);	
		game_label[1] = new JLabel();
		game_label[1].setBounds(100,570,200,200);
		game_label[1].setIcon(game2);	
		game_label[2] = new JLabel();
		game_label[2].setBounds(170,470,200,300);
		game_label[2].setIcon(game3);	
		game_label[3] = new JLabel();
		game_label[3].setBounds(340,490,250,300);
		game_label[3].setIcon(game4);	
		game_label[4] = new JLabel();
		game_label[4].setBounds(400,530,600,200);
		game_label[4].setIcon(game5);	
		this.add(background);
		buttonOne.setBounds(80,750,20,20);
		buttonOne.setFocusable(false);
		buttonOne.addActionListener(this);
		buttonOne.setBackground(Color.blue);
		buttonTwo.setBounds(200,750,20,20);
		buttonTwo.setFocusable(false);
		buttonTwo.addActionListener(this);
		buttonTwo.setBackground(Color.blue);
		buttonThree.setBounds(270,750,20,20);
		buttonThree.setFocusable(false);
		buttonThree.addActionListener(this);
		buttonThree.setBackground(Color.blue);
		buttonFour.setBounds(440,750,20,20);
		buttonFour.setFocusable(false);
		buttonFour.addActionListener(this);
		buttonFour.setBackground(Color.blue);
		background.add(game_label[1]);
		background.add(game_label[2]);
		background.add(game_label[3]);
		background.add(game_label[4]);
		background.add(game_label[0]);
		background.add(zombie);
		background.add(buttonOne);
		background.add(buttonTwo);
		background.add(buttonThree);
		background.add(buttonFour);

		this.setVisible(true);
	}
    public void Congratulations(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,1200);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(null);
		this.setResizable(true);
		textOne.setBounds(500,300,200,200);
		textOne .setText("Congratulations!");
		textOne.setForeground(Color.black);
		textOne.setBackground(null);
		textOne.setFont(new Font("Ink Free",Font.BOLD,25));
		
		Round5.setBounds(500,800,100,100);
		Round5.setFont(new Font("Ink Free",Font.BOLD,10));
		Round5.setFocusable(false);
		Round5.addActionListener(this);
		Round5.setText("Round Five");
		Round5.setBackground(Color.white);
		Round5.setForeground(Color.black);
	
		background.add(Round5);
		background.add(textOne);
 }
    public void GameOver(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,1200);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(null);
		this.setResizable(true);

		textOne.setBounds(500,300,200,200);
		textOne.setForeground(Color.black);
		textOne.setFont(new Font("Ink Free",Font.BOLD,30));
		textOne.setBackground(null);
		textOne.setText("  Game Over?");
		
		Round3.setBounds(500,800,100,100);
		Round3.setFont(new Font("Ink Free",Font.BOLD,15));
		Round3.setFocusable(false);
		Round3.addActionListener(this);
		Round3.setText("Return");
		Round3.setBackground(Color.white);
		Round3.setForeground(Color.black);
		background.add(Round3);
		background.add(textOne);
 }


    @Override
	public void actionPerformed(ActionEvent e) {
	    if(e.getSource()==buttonOne ) {
	        if (game_label[0].getX()<400) {
			    game_label[0].setBounds(1070,600,150,170);
				buttonOne.setBounds(1150,750,20,20);
				c=1;
	        }
	        else {
	        	game_label[0].setBounds(-20,600,150,170);
				buttonOne.setBounds(80,750,20,20);
				c=0;
	        }
	  //      count+=Max(time[0],temp);
	       
		    if (count>17) {
		    	GameOver();
		    }
	        if (c==1) {
	            if (flag==0) {
	        	    temp=time[0];
	             	flag=1;
	                }
	            else{
	            	if (time[0]>=temp){
	        	        count+=time[0];
	            	}
	            	else {
	            		count+=temp;
	            	}
		            temp=0;
	        	    flag=0;
	                 }
	        }
	        if(c==0) {
	        	count+=time[0];
	            temp=0;
	        }
		    else if ((game_label[0].getX()>400)  && (game_label[1].getX()>400) && (game_label[2].getX()>400) &&(game_label[3].getX()>400) ) {
		    	Congratulations();
		    }
		}
	    if(e.getSource()==buttonTwo ) {
	        if (game_label[1].getX()<400) {
			    game_label[1].setBounds(960,600,200,200);
			    buttonTwo.setBounds(1030,750,20,20);
			    c=1;
	        }
	        else {
	        	game_label[1].setBounds(100,570,200,200);
	        	buttonTwo.setBounds(200,750,20,20);
	        	c=0;
	        }
	        if (count>17) {
		    	GameOver();
		    }
	        if (c==1) {
	            if (flag==0) {
	        	    temp=time[1];
	             	flag=1;
	                }
	            else{
	            	if (time[0]>=temp){
	        	        count+=time[1];
	            	}
	            	else {
	            		count+=temp;
	            	}
		            temp=0;
	        	    flag=0;
	                 }
	        }
	        if(c==0) {
	        	count+=time[1];
	            temp=0;
	        }
		    else if ((game_label[0].getX()>400)  && (game_label[1].getX()>400) && (game_label[2].getX()>400) &&(game_label[3].getX()>400) ) {
		    	Congratulations();
		    }
		}
	    if(e.getSource()==buttonThree) {
	        if (game_label[2].getX()<400) {
			    game_label[2].setBounds(800,470,200,300);
			    buttonThree.setBounds(850,750,20,20);
			    c=1;
	        }
	        else {
	        	game_label[2].setBounds(170,470,200,300);
	        	buttonThree.setBounds(270,750,20,20);
	        	c=0;
	        }
	        if (count>17) {
		    	GameOver();
		    }
	        if (c==1) {
	            if (flag==0) {
	        	    temp=time[2];
	             	flag=1;
	                }
	            else {
	            	if (time[2]>=temp){
	        	        count+=time[2];
	            	}
	            	else {
	            		count+=temp;
	            	}
		            temp=0;
	        	    flag=0;
	                 }
	        }
	        if(c==0) {
	        	count+=time[2];
	            temp=0;
	        }
		    else if ((game_label[0].getX()>400)  && (game_label[1].getX()>400) && (game_label[2].getX()>400) &&(game_label[3].getX()>400) ) {
		    	Congratulations();
		    }
	    }
	    if(e.getSource()==buttonFour ) {
	        if (game_label[3].getX()<400) {
			    game_label[3].setBounds(740,490,250,300);
			    buttonFour.setBounds(800,750,20,20);
			    c=1;
	        }
	        else {
	        	game_label[3].setBounds(340,490,250,300);
	        	buttonFour.setBounds(440,750,20,20);
	        	c=0;
	        }
	        if (count>17) {
		    	GameOver();
		    }
	        if (c==1) {
	            if (flag==0) {
	        	    temp=time[0];
	             	flag=1;
	                }
	            else {
	            	if (time[3]>=temp){
	        	        count+=time[3];
	            	}
	            	else {
	            		count+=temp;
	            	}
		            temp=0;
	        	    flag=0;
	                 }
	        }
	        if(c==0) {
	        	count+=time[3];
	            temp=0;
	        }
		    else if ((game_label[0].getX()>400)  && (game_label[1].getX()>400) && (game_label[2].getX()>400) &&(game_label[3].getX()>400) ) {
		    	Congratulations();
		    }

		}
	    if(e.getSource()==Round3 ) {
	    	new HiRound3();
	    }
	    if(e.getSource()==Round5 ) {
	    	new HiRound5();
	    }
	
    }
}