/*

Dialog Modal,Modal less
Frame -Modal less
*/
import java.awt.*;
import java.awt.event.*;
class DialogDemo extends Frame
{
	DialogDemo()
	{
		addWindowListener(new WndDemo());
		setBounds(10,10,400,400);
		setVisible(true);
	}
class WndDemo extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{

		MessageBox mb=new MessageBox(DialogDemo.this);
		mb.setModal(true);
		mb.show();
		//HALT
		if(mb.isYes==true)
			System.exit(0);

		

	}
}
public static void main(String x[])
{
	new DialogDemo();
}
}

class MessageBox extends Dialog implements ActionListener
{
	Label msgLabel;
	Button yesButton,noButton;
	boolean isYes=false;
	MessageBox(Frame parent)
	{
		super(parent);
		msgLabel=new Label("Are u sure to exit  ?");
		yesButton=new Button("yes");
		noButton=new Button("No");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(msgLabel);
		add(yesButton);
		add(noButton);
		yesButton.addActionListener(this);
		noButton.addActionListener(this);
		setBounds(10,10,200,100);
	}
public void actionPerformed(ActionEvent e)
{
	Object obj=e.getSource();
	if(obj==yesButton)
		isYes=true;
	if(obj==noButton)
		isYes=false;
	dispose();
}

}