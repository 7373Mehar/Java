class ResetDisks
{
  static void reset()
  { 	
	Va.nod=(Integer)Va.cb.getSelectedItem();
	Va.t2list.clear();
	Va.t3list.clear();
	Va.t1list.clear();
	for(int i=0;i<8;i++)
  	{
	  Va.main.remove(Va.disks[i]);
	}
	for(int i=0;i<3;i++)
	  Va.main.remove(Va.vbar[i]);
	int s=8-Va.nod;
	int y=350;
	for(int i=s;i<8;i++)
	{
		Va.t1list.push(Va.disks[i]);	  
		Va.disks[i].tn=0;
		int x=98-Va.diskw[i]/2;
		Va.main.add(Va.disks[i]);
		Va.disks[i].setBounds(x,y-=20,Va.diskw[i],20);
	}
        for(int i=0;i<3;i++)
	  Va.main.add(Va.vbar[i]);
	Va.main.repaint();
	Va.nom=0;
	Va.cong.setText("");
	Va.cong.setVisible(false);
	Va.sec=0;
	Va.timesec.setText("<html><h2>Time &nbsp;&nbsp;:&nbsp;&nbsp;"+Va.sec+"&nbsp;&nbsp;seconds</h2></html>");
	Va.timesec.setVisible(true);
	Va.nomr.setText("<html><h2 style='font-size:17'>(Solving this puzzle requires atleast "+((int)Math.pow(2,Va.nod)-1)+" moves)</h3></html>");
	Va.nomd.setText("<html><h2>Number of moves:0</h2></html>");
	Va.blinking=false;
	if(Va.cdisk!=null)
	  Va.cdisk.setVisible(true);
	Va.cdisk=null;Va.cstack=null;
      } 	
}