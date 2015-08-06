import java.awt.*;
import java.awt.event.*;
class AdditionProgram extends Frame implements ActionListener
{
	TextField firstText,secondText,resultText;
	Button sumButton;
	AdditionProgram()
	{
		firstText=new TextField(10);
		secondText=new TextField(10);
		resultText=new TextField(10);
		sumButton=new Button("Sum");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(firstText);
		add(secondText);
		add(resultText);
		add(sumButton);
		sumButton.addActionListener(this);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public void actionPerformed(ActionEvent e)
{
	String data=firstText.getText();
	int a=Integer.parseInt(data);
	int b=Integer.parseInt(secondText.getText());
	int c=a+b;
	resultText.setText(String.valueOf(c));
}
public static void main(String args[])
{
	AdditionProgram ap=new AdditionProgram();
}

}
