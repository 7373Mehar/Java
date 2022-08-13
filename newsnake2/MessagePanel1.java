import java.awt.*;
import javax.swing.*;
class MessagePanel1 extends JPanel
{
  public MessagePanel1()
  {
	setBackground(Color.yellow);
	Font fo=new Font("arial",0,20);
	setLayout(null);
	JLabel lafd=new JLabel();
	lafd.setBorder(BorderFactory.createLineBorder(Color.red,8));
	lafd.setBounds(10,10,16,16);
	add(lafd);
	Va.foodv.setFont(fo);
	Va.foodv.setBounds(30,3,100,30);
	add(Va.foodv);
	JLabel labfd=new JLabel(new ImageIcon(getClass().getResource("images/app.png")));
	labfd.setBounds(400,10,16,16);
	add(labfd);
	Va.bfoodv.setFont(fo);
	Va.bfoodv.setBounds(425,3,100,30);
	add(Va.bfoodv);
	Va.replay.setBounds(230,5,100,25);
	Va.replay.setForeground(Color.blue);
	Va.replay.setFont(fo);
	//Va.replay.setBackground(Color.pink);
	Va.replay.setEnabled(false);
	add(Va.replay);
	Va.replay.addActionListener(new ReplayListener());
  }
}