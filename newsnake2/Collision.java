import java.awt.*;
class Collision
{
  static void die()
  {
     if(Va.head.x==0 || Va.head.y==0 || Va.head.x==40 || Va.head.y==43 || self())
     {
	Va.clipdie.play();
	for(Thread t:Thread.getAllStackTraces().keySet())
        {
	  if(t instanceof MyThread)
	  {
	     MyThread mt=(MyThread)t;	
	     mt.li=-1;
          }
	}
	Va.started=false;
	Va.replay.setEnabled(true);
	if(Va.cscore>Va.highscore)
	  MessagePanel.setScore();
     }
  }
  static boolean self()
  {
     for(int i=0;i<Va.size-5;i++)
     {
	Point p=Va.base[i];
	if(p.x==Va.head.x && p.y==Va.head.y)
	  return true;
     } 	
     return false;
  }
}