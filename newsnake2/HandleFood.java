import java.awt.*;
import java.util.Random;
class HandleFood
{
  static int x,y;
  static Random ra=new Random();
  static void showFood()
  {
     findPos(Va.food);
     Va.foodvisible=true;
     Va.foodeaten=false;
  }
  static void showBonusFood()
  {
     findPos(Va.bfood);  
     Va.bfoodeaten=false;
     Va.bfoodvisible=true;
     new BonusFoodTimer().start();		
  }
  static void findPos(Point p)
  {
     boolean mt=true; 
     x=0;y=0;	
     while(mt)
     {	
       mt=false; 
       x=ra.nextInt(36)+3;
       y=ra.nextInt(39)+3;
       for(int i=0;i<Va.size;i++)
       {
	  if(Va.base[i].x==x && Va.base[i].y==y)
	  {
	    mt=true;
	    break;	  		
	  }
       }
     }
     p.x=x;
     p.y=y;	
  }
}