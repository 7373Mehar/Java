import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.applet.*;
public class MainClass extends JFrame
{
  public MainClass()
  {
	super("Snake");
	Va.main=this;
	setSize(40*13+17,55*13+29);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	loadSound();
	Va.pa=new FieldPanel();
	Va.pa.setBounds(0,13*7,41*13,44*13);
	Va.pa.init();
	add(Va.pa);
	MessagePanel mp=new MessagePanel();
	mp.setBounds(0,0,41*13,13*7);
	add(mp);
	MessagePanel1 mp1=new MessagePanel1();
	mp1.setBounds(0,51*13,41*13,4*13);
	add(mp1);
	addKeyListener(new ArrowKeyListener());
	MessagePanel.createScoreFile();
	setVisible(true);
  }
  void loadSound()
  {
      	Va.clipdie=Applet.newAudioClip(getClass().getResource("sound/gameover.wav"));
	Va.clipeat1=Applet.newAudioClip(getClass().getResource("sound/eat.WAV"));
	Va.clipeat2=Applet.newAudioClip(getClass().getResource("sound/eat.WAV"));
	Va.clipeat=Va.clipeat1;
  }
  public static void main(String []args)
  {
	new MainClass();
  }
}