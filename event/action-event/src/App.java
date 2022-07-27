import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App 
{
	JFrame fr=new JFrame("CETPA");
	JPanel pa=new JPanel();
	JButton bt1=new JButton("Red Background");
	JButton bt2=new JButton("Green Background");
	public App()
	{
		fr.setSize(500,500);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.add(pa);
		pa.setBackground(Color.yellow);
		pa.add(bt1);
		pa.add(bt2);
		bt1.addActionListener(new AA());
		bt2.addActionListener(new BB());
		fr.setVisible(true);
	}
	class AA implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			pa.setBackground(Color.red);
		}
	}
	class BB implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			pa.setBackground(Color.green);
		}
	}
	public static void main(String[] args) 
	{
		new App();
	}
}
