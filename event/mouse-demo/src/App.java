import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App 
{
	JFrame fr=new JFrame("CETPA");
	JLabel la=new JLabel("CETPA Infotech");
	public App()
	{
		fr.setSize(400,300);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(new FlowLayout());
		fr.add(la);
		la.addMouseListener(new AA());
		fr.setVisible(true);
	}
	class AA implements MouseListener
	{
		Font fo;
		public void mouseEntered(MouseEvent evt)
		{
			fo=la.getFont();
			la.setFont(new Font("arial",0,30));
			la.setForeground(Color.red);
		}
		public void mouseExited(MouseEvent evt) 
		{
			la.setFont(fo);
			la.setForeground(Color.black);
		}
		public void mouseClicked(MouseEvent evt) {}
		public void mousePressed(MouseEvent evt) {}
		public void mouseReleased(MouseEvent evt) {}
	}
	public static void main(String[] args) 
	{
		new App();
	}
}
