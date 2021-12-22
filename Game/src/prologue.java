import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class prologue  implements ActionListener  {
	JFrame frame = new JFrame();
	JTextArea textarea = new JTextArea();
	JButton Next = new JButton();
	public prologue() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(650,1200);
	frame.getContentPane().setBackground(Color.white);
	frame.setLayout(null);
	frame.setResizable(true);
	
	textarea.setBounds(50,50,530,500);
//	textarea.setBackground(new Color(25,25,25));
	textarea.setForeground(new Color(100,150,200));
	textarea.setFont(new Font("Ink Free",Font.BOLD,20));
    textarea.setText("                                   Prologue \n"
			+ "You are the prince you are about to marry the princess. \n"
			+ "But before the wedding day, the princess was taken away \n"
			+ "by a monster and your task is to overcome the challenges \n"
			+ "that the monster has created. To marry a princess, you must\n"
			+ "first have the intelligence to handle the situation.\n"
			+ "Good luck and rescue the princess.\n"	);	
    
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
	@Override
	public void actionPerformed(ActionEvent e) {
	    if(e.getSource()==Next ) {
         	new HiRound1();
	    }
	}

}
