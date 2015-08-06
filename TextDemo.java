import java.awt.*;
import java.awt.event.*;
class TextDemo extends Frame implements TextListener
{
	TextArea dataArea;
	Label msgLabel;
	TextDemo()
	{
		dataArea=new TextArea(10,20);
		msgLabel=new Label("160 Characters Left");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(dataArea);
		add(msgLabel);
		dataArea.addTextListener(this);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public void textValueChanged(TextEvent e)
{
	String data=dataArea.getText();
	int len=data.length();
	msgLabel.setText( (160-len)+" characters left");
}
public static void main(String args[])
{
	TextDemo td=new TextDemo();
}

}
