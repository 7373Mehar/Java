import javax.swing.*;
public class App2 
{
	JFrame fr=new JFrame("Untitled");
	JButton bt1=new JButton("Submit");
	JButton bt2=new JButton("Cancel");
	public App2()
	{
		fr.setSize(500,500);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setLayout(null);
		bt1.setBounds(100,200,100,40);
		fr.add(bt1);
		bt2.setBounds(250,200,150,30);
		fr.add(bt2);
		fr.setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new App2();
	}
}
