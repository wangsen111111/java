package com.company;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame
{
    public static  void main(String[] args)
     {
    Main jfrm=new Main();
         ImageIcon ic = new ImageIcon("中国灯笼");
         Jbutton btn= new Jbutton("灯笼",ic);
    jfrm.setLayout(null);
   jfrm.setSize(250,180);
   jfrm.setTitle("按钮类窗口");
   btn.setBounds(50,40,100,40);
   btn.setToolTiptext("我是按钮");
     }
}
