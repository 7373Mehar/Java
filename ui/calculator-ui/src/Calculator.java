import javax.swing.*;
import java.awt.*;
public class Calculator 
{
	JFrame fr=new JFrame("Calculator");
	JTextField tb=new JTextField("0");
	JButton [] bt=new JButton[20];
	JPanel pa=new JPanel();
	public Calculator() 
	{
		fr.setSize(600,650);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setLayout(null);
		addTextBox();
		fr.setVisible(true);
	}
	private void addTextBox()
	{
		tb.setBounds(20,20,550,55);
		tb.setFont(new Font("arial",0,25));
		tb.setHorizontalAlignment(JTextField.RIGHT);
		tb.setEditable(false);
		tb.setBackground(Color.white);
		tb.setBorder(BorderFactory.createLineBorder(Color.black,1));
		fr.add(tb);
		addButtons();
	}
	private void addButtons()
	{
		pa.setBounds(20,100,550,475);
		//pa.setBackground(Color.green);
		fr.add(pa);
		pa.setLayout(new GridLayout(5,4,10,15));
		String [] str= {"Back","CE","C","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		Font fo=new Font("arial",0,30);
		for(int i=0;i<20;i++)
		{
			bt[i]=new JButton(str[i]);
			bt[i].setFont(fo);
			if(i==3 || i==7 || i==11 || i==15 || i==18 || i==19)
				bt[i].setForeground(Color.red);
			else
				bt[i].setForeground(Color.blue);
			pa.add(bt[i]);
		}
	}
	public static void main(String[] args) 
	{
		new Calculator();
	}
}
