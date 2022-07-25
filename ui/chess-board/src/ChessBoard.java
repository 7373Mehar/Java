import javax.swing.*;
import java.awt.*;
public class ChessBoard 
{
	JFrame fr=new JFrame("Chess");
	JButton [][] bt=new JButton[8][8]; 
	public ChessBoard()
	{
		fr.setSize(900,700);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		addButtons();
		fr.setVisible(true);
	}
	private void addButtons()
	{
		GridLayout layout=new GridLayout(8,8);
		fr.setLayout(layout);
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				bt[i][j]=new JButton();
				if((i+j)%2==0)
					bt[i][j].setBackground(Color.white);
				else
					bt[i][j].setBackground(Color.cyan);
				fr.add(bt[i][j]);
			}
		}
		setImages();
	}
	private void setImages()
	{
		ImageIcon icon3=new ImageIcon(getClass().getResource("image/bp.gif"));
		ImageIcon icon4=new ImageIcon(getClass().getResource("image/wp.gif"));
		for(int i=0;i<8;i++)
		{
			ImageIcon icon1=new ImageIcon(getClass().getResource("image/b"+i+".gif"));
			bt[0][i].setIcon(icon1);
			ImageIcon icon2=new ImageIcon(getClass().getResource("image/w"+i+".gif"));
			bt[7][i].setIcon(icon2);
			bt[1][i].setIcon(icon3);
			bt[6][i].setIcon(icon4);
		}
	}
	public static void main(String[] args) 
	{
		new ChessBoard();
	}
}
