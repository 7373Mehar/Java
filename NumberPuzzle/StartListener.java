import java.awt.event.*;
class StartListener implements ActionListener
{
  public void actionPerformed(ActionEvent evt)
  {
      if(Va.startbt.getText().equals("START"))
      {
	Va.done=false;
	Va.started=true;
	Va.startbt.setText("New Game");
	new TimerThread().start();
      }
      else
      {
	Va.startbt.setText("START");
	Va.done=true;
	Va.started=false;
	Va.main.getNos();
	int k=-1;
	Va.mm=Va.ss=0;
	Va.clicks=0;
	Va.clickla.setText("0");
	Va.timela.setText("00:00");
	for(int i=0;i<4;i++)
	{
	  for(int j=0;j<4;j++)
	  {
	    int n=Va.list.get(++k);
	    Va.bt[i][j].setText(String.valueOf(n));
	    if(n==0)
	    {
		Va.bt[i][j].setText("");
		Va.bb=Va.bt[i][j];
	    }
	  }
	}
      }
  }	
}