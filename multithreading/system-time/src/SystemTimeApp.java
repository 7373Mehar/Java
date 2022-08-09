import javax.swing.*;
import java.awt.*;
import java.time.*;
public class SystemTimeApp 
{
	JFrame fr=new JFrame("Time App");
	JLabel la=new JLabel();
	public SystemTimeApp()
	{
		fr.setSize(300,300);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,110));
		la.setFont(new Font("arial",Font.PLAIN,30));
		fr.add(la);
		new TimeThread().start();
		fr.setVisible(true);
	}
	private class TimeThread extends Thread 
	{
		public void run()
		{
			while(true)
			{
				LocalTime time=LocalTime.now();
				la.setText(time.toString());
				try{
					Thread.sleep(1);
				}catch(Exception ex){}
			}
		}
	}
	public static void main(String[] args) 
	{
		new SystemTimeApp();
	}
}
