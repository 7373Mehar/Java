import java.awt.*;
import javax.swing.*;
import java.io.*;
class MessagePanel extends JPanel
{
  JPanel p1=new JPanel();
  JPanel p2=new JPanel();
  public MessagePanel()
  {
	Font fo=new Font("elephant",0,22);
	setLayout(new GridLayout(2,1));    	
	add(p1);
	add(p2);
	p1.setBackground(Color.yellow);
	p1.setBorder(BorderFactory.createLineBorder(Color.blue,5));
	p2.setBorder(BorderFactory.createLineBorder(Color.black,5));
	p2.setBackground(Color.white);
	p1.setLayout(new GridLayout(1,6));
	p1.add(new JLabel("<html><h1 style='Color:blue;font-family:elephant'>Level:</h1></html>"));
	p1.add(Va.level);
	Va.level.setFont(fo);
	p1.add(new JLabel());
	p1.add(new JLabel("<html><h1 style='Color:blue;font-family:elephant'>Score:</h1></html>"));
	p1.add(Va.score);
	Va.score.setFont(fo);
	p2.add(Va.hscore);
	Va.hscore.setForeground(Color.blue);
	Va.hscore.setFont(fo);
  }
  static void fetchScore()
  {
	try{
	   BufferedReader br=new BufferedReader(new FileReader(System.getProperty("user.home")+"/snakescore.dat"));	  
	   Va.highscore=Integer.parseInt(br.readLine());
	   Va.hscore.setText("Highest Score:"+Va.highscore);
	}catch(Exception ex){System.out.println("1:"+ex);}
  }
  static void setScore()
  {
	try{
	     PrintWriter pw=new PrintWriter(new FileWriter(System.getProperty("user.home")+"/snakescore.dat"));	  
	     pw.println(Va.cscore);
	     pw.close();
	}catch(Exception ex){System.out.println("2"+ex);}
  }
  static void createScoreFile()
  {
	try{
	     File file=new File(System.getProperty("user.home")+"/snakescore.dat");
	     if(file.createNewFile())
	     { 	
	       PrintWriter pw=new PrintWriter(new FileWriter(file));	  
	       pw.println(0);
	       pw.close();
	     }
	}catch(Exception ex){System.out.println("2"+ex);}
  }
}