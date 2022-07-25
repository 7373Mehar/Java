import javax.swing.*;
public class App 
{
	JFrame fr=new JFrame("Untitled");
	public App()
	{
		fr.setSize(600,600);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new App();
	}
}
