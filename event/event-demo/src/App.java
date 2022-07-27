import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App 
{
	JFrame fr=new JFrame("CETPA");
	JPanel pa=new JPanel();
	JButton bt1=new JButton("Red Background");
	JButton bt2=new JButton("Green Background");
	JButton bt3=new JButton("Blue Background");
	public App()
	{
		fr.setSize(700,500);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.add(pa);
		pa.setBackground(Color.yellow);
		pa.add(bt1);
		pa.add(bt2);
		pa.add(bt3);
		ColorListener listener=new ColorListener();
		bt1.addActionListener(listener);
		bt2.addActionListener(listener);
		bt3.addActionListener(listener);
		fr.setVisible(true);
	}
	class ColorListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			Object source=evt.getSource();	
			if(source==bt1)
				pa.setBackground(Color.red);
			else if(source==bt2)
				pa.setBackground(Color.green);
			else if(source==bt3)
				pa.setBackground(Color.blue);
		}
	}
	
	public static void main(String[] args) 
	{
		new App();
	}
}
