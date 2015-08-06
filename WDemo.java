import java.awt.*;
import java.awt.event.*;
class WDemo extends Frame 
{
	WDemo()
	{
		addWindowListener(new WndDemo());
		setBounds(10,10,200,200);
		setVisible(true);
	}

class WndDemo extends WindowAdapter
{
public void windowClosing(WindowEvent e){
//dispose();
	MessageBox mb=new MessageBox(WDemo.this);

}
}

public static void main(String args[])
{
	WDemo wd=new WDemo();	
}

}
