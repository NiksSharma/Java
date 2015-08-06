import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseMotionListener
{
	Label msgLabel;
	MouseDemo()
	{
		msgLabel=new Label("");
		setLayout(new BorderLayout());
		add(msgLabel,BorderLayout.SOUTH);
		addMouseMotionListener(this);
		setBounds(10,10,200,200);
		setVisible(true);
	}
public void mouseMoved(MouseEvent e)
{

}
public void mouseDragged(MouseEvent e)
{
	msgLabel.setText(e.getX()+","+e.getY());
}
public static void main(String arg[])
{
	MouseDemo md=new MouseDemo();
}
}
