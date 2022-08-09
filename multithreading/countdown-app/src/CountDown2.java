import javax.swing.*;
import java.applet.*;
import java.awt.*;
public class CountDown2 
{
	JFrame fr=new JFrame("Count Down");
	JLabel la=new JLabel("10");
	AudioClip [] clips=new AudioClip[11];
	AudioClip clip=Applet.newAudioClip(getClass().getResource("audio/intro.mid"));
	public CountDown2()
	{
		fr.setSize(300,300);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,110));
		la.setFont(new Font("arial",Font.PLAIN,30));
		fr.add(la);
		clip.loop();
		loadFiles();
		new NumberThread().start();
		fr.setVisible(true);
	}
	private class NumberThread extends Thread 
	{
		public void run()
		{
			for(int num=10;num>=1;num--)
			{
				clips[num].play();
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
	private void loadFiles()
	{
		for(int i=1;i<11;i++)
		{
			clips[i]=Applet.newAudioClip(getClass().getResource("audio/"+i+".wav"));
		}
	}
	public static void main(String[] args) 
	{
		new CountDown2();
	}
}
