import javax.swing.*;
import java.awt.*;
public class LoginForm 
{
	JFrame fr=new JFrame("Login form");
	JLabel la1=new JLabel("Enter user name:");
	JLabel la2=new JLabel("Enter password:");
	JTextField tb1=new JTextField();
	JPasswordField tb2=new JPasswordField();
	JButton bt=new JButton("Sign In");
	public LoginForm()
	{
		fr.setSize(500,500);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setLayout(null);
		addComponents();
		fr.setVisible(true);
	}
	private void addComponents()
	{
		Font font=new Font("arial",0,25);
		la1.setFont(font);
		la1.setForeground(Color.blue);
		la1.setBounds(50,100,250,30);
		fr.add(la1);
		la2.setFont(font);
		la2.setForeground(Color.blue);
		la2.setBounds(50,200,200,30);
		fr.add(la2);
		tb1.setBounds(250,100,200,30);
		fr.add(tb1);
		tb2.setBounds(250,200,200,30);
		fr.add(tb2);
		bt.setBounds(300,300,150,35);
		fr.add(bt);
		bt.setFont(font);
		bt.setForeground(Color.white);
		bt.setBackground(Color.black);
	}
	public static void main(String[] args) 
	{
		new LoginForm();
	}
}
