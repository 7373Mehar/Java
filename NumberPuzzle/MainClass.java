import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MainClass extends JFrame
{
  JPanel board=new JPanel();
  JPanel top=new JPanel();
  JPanel bot=new JPanel();
  Font fo=new Font("elephant",0,20);
  public MainClass()
  {
	super("Number Puzzle");
	Va.main=this;
	setSize(600,640);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setResizable(false);
	setLayout(null);
	//getContentPane().setBackground(new Color(200,200,255));
	board.setBounds(100,80,400,400);
	board.setBorder(BorderFactory.createLineBorder(Color.black,3));
	add(board);
	top.setBounds(100,20,400,30);
	add(top);
	bot.setBounds(100,530,400,90);
	add(bot);
	bot.add(new JLabel("<html><h3 style='color:blue'>Arrange numbers in a sequence(such as 1 2 3 4 5 6 )<br>Select a number and click on blank square<br>Selected number must be adjacent to the blank square</h3></html>"));
	addInfo();
	addButtons();
	setVisible(true);
  }
  void addButtons()
  {
    board.setLayout(new GridLayout(4,4));
    Font fo=new Font("elephant",1,30);
    Border b=BorderFactory.createLineBorder(Color.black,3);
    getNos();
    int k=-1;
    PuzzleListener listener=new PuzzleListener();
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<4;j++)
      {
	int n=Va.list.get(++k);
	Va.bt[i][j]=new MButton(String.valueOf(n),i,j);
	if(n==0)
	{
	  Va.bb=Va.bt[i][j];
	  Va.bt[i][j].setText("");
	}
	Va.bt[i][j].addActionListener(listener);
	Va.bt[i][j].setFont(fo);
	Va.bt[i][j].setForeground(Color.white);
	Va.bt[i][j].setBackground(Color.red);
	Va.bt[i][j].setBorder(b);
	board.add(Va.bt[i][j]);
      } 	
    }
  }
  void getNos()
  {
	Va.list=new ArrayList<Integer>();	
	Collections.addAll(Va.list,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
	Collections.shuffle(Va.list);
  }
  class PuzzleListener implements ActionListener
  {
    public void actionPerformed(ActionEvent evt)
    {
	if(!Va.started)
	  return;
	MButton bc=(MButton)evt.getSource();
	if((Va.bb.row==bc.row && Math.abs(Va.bb.col-bc.col)==1)||(Va.bb.col==bc.col && Math.abs(Va.bb.row-bc.row)==1))
	{
	  Va.bb.setText(bc.getText());
	  bc.setText("");
	  Va.bb=bc;
	  Va.clickla.setText(String.valueOf(++Va.clicks));
	  checkNumbers();
	}
    }	
  }
  void addInfo()
  {
	top.setLayout(new GridLayout(1,5,3,3));
	top.add(new JLabel("<html><h1 style='color:blue'>Clicks:</h1></html>"));
	Va.clickla.setFont(fo);
	top.add(Va.clickla);
	Va.startbt.setBounds(250,495,130,35);
	add(Va.startbt);
	Va.startbt.setFont(fo);
	Va.startbt.setMargin(new Insets(0,0,0,0));
	Va.startbt.setForeground(Color.white);
	Va.startbt.setBackground(Color.gray);
	Va.startbt.addActionListener(new StartListener());	
	top.add(new JLabel(""));		
	top.add(new JLabel("<html><h1 style='color:blue'>Time:</h1></html>"));	
	Va.timela.setFont(fo);
	top.add(Va.timela);
  }
  void checkNumbers()
  {
    if(Va.bt[0][0].getText().equals("1")&& Va.bt[0][1].getText().equals("2")&& Va.bt[0][2].getText().equals("3")&& Va.bt[0][3].getText().equals("4") && Va.bt[1][0].getText().equals("5")&&Va.bt[1][1].getText().equals("6")&& Va.bt[1][2].getText().equals("7")&&Va.bt[1][3].getText().equals("8")&&Va.bt[2][0].getText().equals("9")&&Va.bt[2][1].getText().equals("10")&&Va.bt[2][2].getText().equals("11")&&Va.bt[2][3].getText().equals("12")&&Va.bt[3][0].getText().equals("13")&&Va.bt[3][1].getText().equals("14")&& Va.bt[3][2].getText().equals("15"))
    {
	JOptionPane.showMessageDialog(MainClass.this,"Congratulations!!! you did it");
	Va.done=true;
	return;
    } 
  }
  public static void main(String []args)
  {
	setDefaultLookAndFeelDecorated(true);
	new MainClass();
  }
}

