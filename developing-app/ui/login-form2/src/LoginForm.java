import javax.swing.*;
import java.awt.*;
public class LoginForm 
{
	JFrame fr=new JFrame("Login Form");
	JLabel la1=new JLabel("Enter user id:");
	JLabel la2=new JLabel("Enter password:");
	JTextField tb1=new JTextField();
	JPasswordField tb2=new JPasswordField();
	JButton bt=new JButton("Click to Login");
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
		Font fo=new Font("arial",0,25);
		la1.setFont(fo);
		la1.setForeground(Color.blue);
		la1.setBounds(50,100,200,30);
		fr.add(la1);
		tb1.setBounds(250,100,200,35);
		fr.add(tb1);
		tb1.setFont(fo);
		la2.setFont(fo);
		la2.setForeground(Color.blue);
		la2.setBounds(50,200,200,30);
		fr.add(la2);
		tb2.setBounds(250,200,200,35);
		fr.add(tb2);
		tb2.setFont(fo);
		bt.setBounds(260,300,190,35);
		fr.add(bt);
		bt.setFont(fo);
		bt.setForeground(Color.white);
		bt.setBackground(Color.black);
	}
	public static void main(String[] args) 
	{
		new LoginForm();
	}
}
