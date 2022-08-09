import javax.swing.*;
import java.awt.*;
public class CountDown 
{
	JFrame fr=new JFrame("Count Down");
	JLabel la=new JLabel("10");
	public CountDown()
	{
		fr.setSize(300,300);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,110));
		la.setFont(new Font("arial",Font.PLAIN,30));
		fr.add(la);
		new NumberThread().start();
		fr.setVisible(true);
	}
	private class NumberThread extends Thread 
	{
		public void run()
		{
			for(int num=10;num>=1;num--)
			{
				la.setText(String.valueOf(num));
				try{
					Thread.sleep(1000);
				}catch(Exception ex){}
			}
			la.setText("Let's play");
			try {
				Thread.sleep(2000);
			}catch(Exception ex) {}
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new CountDown();
	}
}
