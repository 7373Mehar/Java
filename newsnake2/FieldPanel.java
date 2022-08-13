import java.awt.*;
import javax.swing.*;
class FieldPanel extends JPanel
{
  Graphics g;
  Image img,imghead;
  public void init()
  {
    int iy=25;
    for(int i=0;i<Va.size;i++)
    {
	Va.base[i]=new Point(3,iy);
	iy--;
    }
    Va.head=Va.base[Va.size-1];
    img=new ImageIcon(getClass().getResource("images/app.png")).getImage();
    imghead=new ImageIcon(getClass().getResource("images/head.png")).getImage();
  }
  public void drawSnake(Graphics g)
  {
	int c=Va.size%2==0?1:0;
	for(int i=0;i<Va.size-1;i++)
	{
	  Point p=Va.base[i];
	  if(i%2==c)
	    g.setColor(Color.black);
	  else
	    g.setColor(Color.white);
	  g.fillOval(p.x*13,p.y*13,12,12);
	}
	g.setColor(Color.black); 
	g.fillRect(Va.base[Va.size-1].x*13,Va.base[Va.size-1].y*13,12,12);
	//g.drawImage(imghead,Va.base[Va.size-1].x*13,Va.base[Va.size-1].y*13,this);
	EatFood.eat();
	Collision.die();
  }
  public void paintComponent(Graphics g)
  {
    this.g=g;	
    if(Va.head.x<=2 || Va.head.y<=2 ||Va.head.x>=38 || Va.head.y>=41 )
      g.setColor(Color.red);
    else
      g.setColor(Color.blue);
    g.fillRect(0,0,41*13,44*13);		
    g.setColor(Color.green);
    g.fillRect(13,13,39*13,42*13);
    /*for(int i=0;i<41;i++)
    {
	for(int j=0;j<44;j++)
	{
	  if(i==0 || j==0 || j==43 || i==40)
	    g.setColor(Color.blue);
	  else
	    g.setColor(Color.green);
	  g.fillRect(i*13,j*13,12,12);
	}
    }*/
    drawSnake(g);
    if(!Va.foodvisible && !Va.bfoodvisible)	
      HandleFood.showFood();
    if(!Va.foodeaten && !Va.bfoodvisible)
    {		
	g.setColor(Color.red);
	g.fillRect(Va.food.x*13,Va.food.y*13,12,12);	
    } 
    if(!Va.bfoodeaten)
    {
	g.drawImage(img,Va.bfood.x*13,Va.bfood.y*13,this);
	EatFood.eatBonus();	
    }
  }
  public void setLocation()
  {
	repaint();
  }
}