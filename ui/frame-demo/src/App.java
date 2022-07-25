import javax.swing.JFrame;
public class App 
{
	public static void main(String[] args) 
	{
		JFrame fr=new JFrame("Calculator");
		fr.setSize(800,600);
		//fr.setLocationRelativeTo(null);
		fr.setLocation(100,100);
		fr.setResizable(false);
		fr.setVisible(true);
	}
}
