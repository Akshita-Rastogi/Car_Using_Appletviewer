import java.applet.*;

import java.awt.*;

import java.awt.event.*;
import java.awt.Color;

/*<applet code="frame2" height=200 width=400>

</applet>*/

public class frame2 extends Applet implements ActionListener

{ int x; int y; int w;int t1,t2;int h;

 Button b1;Button b2;Button b3;Button b4;Button b5;
Image i;


 String msg=" ";

 void slep()                  //for delay

 {

      try {

    Thread.sleep(100);

          }catch(Exception ex) {

      }

}

 public void init()

   {


i=getImage(getCodeBase(),"6.jfif");
t1=0;t2=1;

 y=60;

 x=20;

 setLayout(new FlowLayout(FlowLayout.CENTER));

 Label l=new Label("Akshita");

 b1=new Button("LEFT");

 add(b1);

 b2=new Button("RIGHT");

 b3=new Button("STOP");

b4=new Button("UP");
b5=new Button("DOWN");
add(b2);
add(b3);
add(b4);
add(b5);


 


 b1.addActionListener(this);

 b2.addActionListener(this);

 b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

  

 }

 

public void start()

 {

 }

 public void actionPerformed(ActionEvent e)

 {

  String s=e.getActionCommand();

 if(s.equals("LEFT"))

 {

  msg="LEFT";

  repaint();

 }
 else if(s.equals("UP"))
 {
 	msg="UP";
 	repaint();

 }
 else if(s.equals("DOWN"))
 {
 	msg="DOWN";
 	repaint();

 }


 else if(s.equals("RIGHT"))

    {

     msg="RIGHT";

  repaint();

  }

 else if(s.equals("STOP"))

  {

   msg="  ";repaint(); }

 }


 public void paint(Graphics g)

 {

//setBackground(Color.decode("#228B22"));
g.drawImage(i,0,0,getWidth() , getHeight(),this);
       w=getWidth();
       h=getHeight();

       Color c1=new Color(20,160,200);

       Color c2=new Color(200,60,200);

       g.setColor(c1);    

       g.drawLine(0,y+75,w,y+75);

       g.setColor(c2);

       g.fillRoundRect(x,y+20,100,40,5,5);

       g.fillArc(x+90,y+20,20,40,270,180);

       g.setColor(c1);  

       g.fillRoundRect(x+10,y,70,25,10,10);

       g.setColor(Color.white);

       g.fillRect(x+20,y+5,20,25);

       g.fillRect(x+50,y+5,20,25);

       g.setColor(Color.black);

       g.fillRoundRect(x+55,y+10,10,20,10,10);

       g.fillOval(x+10,y+50,25,25);
       g.fillOval(x+60,y+50,25,25);

       g.setColor(Color.white);

       g.fillArc(x+20,y+60,5,5,0,360);

    g.fillArc(x+70,y+60,5,5,0,360);

    slep();

    if(msg.equals("RIGHT"))

  {          

  if(x+120<w)

   {

    x=x+1;

    showStatus("press LEFT for moving backward");

    repaint();

   }

  }

    if(msg.equals("LEFT"))

      {

       if(x>0)

    {

    x=x-1;

    showStatus("press RIGHT for moving forward");

    repaint();
    }

  }
  if(msg.equals("DOWN"))

  {          

  if(y+140<h)

   {

    y=y+1;

    showStatus("press UP for moving Upward");

    repaint();

   }

  }

    if(msg.equals("UP"))

      {

       if(y>0)

    {

    y=y-1;

    showStatus("press DOWN for moving Downward");

    repaint();
    }

  }

}

}
