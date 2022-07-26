package tictactoe;
import javax.swing.*;
import java.awt.*;
public class TicTacToe 
{
	JFrame fr=new JFrame("Tic Tac Toe");
	JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
	JPanel [] pa=new JPanel[3];
	JLabel msg=new JLabel("First player turn...");
	JButton reset=new JButton("RESET");
	JButton [] bt=new JButton[9];
	public TicTacToe()
	{
		fr.setSize(600,650);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.setLocationRelativeTo(null);
		fr.add(la);
		addPanels();
		fr.setVisible(true);
	}
	private void addPanels()
	{
		la.setLayout(null);
		for(int i=0;i<3;i++)
		{
			pa[i]=new JPanel();
			la.add(pa[i]);
		}
		pa[0].setBounds(70,30,460,40);
		pa[0].setBackground(Color.cyan);
		pa[1].setBounds(70,100,460,400);
		pa[2].setBounds(70,530,460,40);
		pa[2].setOpaque(false);
		addComponents();
	}
	private void addComponents()
	{
		pa[0].add(msg);
		msg.setFont(new Font("elephant",0,30));
		msg.setForeground(Color.blue);
		pa[2].add(reset);
		reset.setFont(new Font("arial",0,20));
		reset.setEnabled(false);
		addButtons();
	}
	private void addButtons()
	{
		pa[1].setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++)
		{
			bt[i]=new JButton();
			bt[i].setBackground(Color.yellow);
			pa[1].add(bt[i]);
		}
	}
	public static void main(String[] args) 
	{
		new TicTacToe();
	}
}
