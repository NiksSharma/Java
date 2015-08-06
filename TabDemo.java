/*
JTabbedPane
JPanel ---object,inherit
*/
import javax.swing.*;
import java.awt.*;
class FirstPanel extends JPanel
{
	JTextField nameText;
	JButton okButton;
	FirstPanel()
	{
		nameText=new JTextField(10);
		okButton=new JButton("OK");
		add(nameText);
		add(okButton);
		setLayout(new FlowLayout(FlowLayout.CENTER));
	}
}


class TabDemo extends JFrame
{
	JTabbedPane jtp;
	FirstPanel fp;
	JPanel jp;
	JButton anotherButton;
	TabDemo()
	{
		fp=new FirstPanel();
		jp=new JPanel();
		anotherButton=new JButton("Another");
		jp.add(anotherButton);
		jtp=new JTabbedPane();
		jtp.addTab("First",fp);
		jtp.addTab("Second",jp);
		add(jtp);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public static void main(String args[])
{
	TabDemo td=new TabDemo();
}

}



