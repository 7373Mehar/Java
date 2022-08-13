import java.awt.Point;
class EatFood
{
  static int count=0;
  static void eat()
  {
	if(Va.head.x==Va.food.x && Va.head.y==Va.food.y)
        {
	  setScore(1);
	  Va.clipeat.play();
	  Va.clipeat=Va.clipeat==Va.clipeat1?Va.clipeat2:Va.clipeat1;
 	  Va.foodeaten=true;
	  Va.foodvisible=false;
	  Va.ctr++;
	  if(Va.ctr%5==0)	
    	  {
	      HandleFood.showBonusFood();
    	  }
	  count++;
	  if(count==5)  
	  {
		count=0;
		return;
	  }	
	  growSnake();
        }
  }
  static void growSnake()
  {
    Point nhead=new Point(Va.head.x,Va.head.y);	
    if(Va.cthread instanceof RightThread)
	nhead.x++;
    else if(Va.cthread instanceof LeftThread)
	nhead.x--;
    else if(Va.cthread instanceof DownThread)
	nhead.y++;
    else if(Va.cthread instanceof UpThread)
	nhead.y--;
    Va.base[Va.size]=nhead;
    Va.size++;	
    Va.cthread.li++;
    Va.head=nhead;	
  }
  static void eatBonus()
  {
     if(Va.head.x==Va.bfood.x && Va.head.y==Va.bfood.y)
     {
	setScore(2);
	Va.clipeat.play();
	Va.clipeat=Va.clipeat==Va.clipeat1?Va.clipeat2:Va.clipeat1;
 	Va.bfoodeaten=true;
	Va.bfoodvisible=false;
     }
  }
  static void setScore(int n)
  {
      if(n==1)
	Va.cscore+=Va.sinc[Va.leveli];
      else if(n==2)  	
	Va.cscore+=Va.bsinc[Va.leveli];;
      Va.score.setText(Va.cscore+"");	
      if(Va.cscore>=Va.scv[Va.leveli])		
      {
        Va.leveli++;
	if(Va.leveli%2==1)
	  Va.btime--;
	Va.speed=Va.speedv[Va.leveli];
	Va.level.setText(""+(Va.leveli+1));
	Va.foodv.setText(Va.sinc[Va.leveli]+" Points");
	Va.bfoodv.setText(Va.bsinc[Va.leveli]+" Points");
      } 
  }
}