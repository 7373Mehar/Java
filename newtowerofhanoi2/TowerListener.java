import java.awt.event.*;
import javax.swing.*;
class TowerListener extends MouseAdapter
{
   public void mouseClicked(MouseEvent evt)
   {
	Va.cstack=(MLabel)evt.getSource();
	placeDisk();
	return;
   }
   void placeDisk()
   {
     if(!Va.blinking)
     {
	Va.clip2.play();
	return;
     }
     int tw=Va.cstack.tower;
     if(Va.cdisk.tn==tw)
     {
	Va.clip2.play();
   	return;
     }
     Va.destlist=Va.list.get(tw);   		
     if(Va.destlist.isEmpty())
     {
	int x=Va.diskx[tw]-Va.diskw[Va.cdisk.dn]/2;
	place(x,330,tw);
	return;
     }
     MButton la=Va.destlist.peek();      	
     if(la.dn>Va.cdisk.dn)
     {	
     	System.out.println("Invalid move");
	Va.clip2.play();
     	return;
     }
     int x=Va.diskx[tw]-Va.diskw[Va.cdisk.dn]/2;
     place(x,330-(Va.destlist.size()*20),tw);
   }
   void place(int x,int y,int tw)
   {
	Va.clip1.play();
	Va.cdisk.setLocation(x,y);
	Va.blinking=false;
	Va.cdisk.setVisible(true);
	Va.sourcelist.pop();
	Va.destlist.push(Va.cdisk);
	Va.cdisk.tn=tw;
	Va.nom++;
	Va.nomd.setText("<html><h2>Number of moves:"+Va.nom+"</h2></html>");
	if(Va.t3list.size()==Va.nod)
	{
	  Va.timer=false;
	  Va.timesec.setVisible(false);
	  Va.cong.setVisible(true);
	  Va.cong.setText("<html><h2 style='color:red'>Congratulation!! You did it in "+Va.sec+" seconds and "+Va.nom+" moves.</h2></html>");
	  new BlinkMessage().start();
	}
   }  
}