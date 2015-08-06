import java.awt.*;
import java.awt.event.*;
class AdditionProgramss extends Frame 
{
	TextField firstText,secondText,resultText;
	Button sumButton;
	AdditionProgramss()
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
		sumButton.addActionListener(new ActionListener(){

		


public void actionPerformed(ActionEvent e)
{
	String data=firstText.getText();
	int a=Integer.parseInt(data);
	int b=Integer.parseInt(secondText.getText());
	int c=a+b;
	resultText.setText(String.valueOf(c));
}


		});
		setBounds(10,10,300,300);
		setVisible(true);
	}

public static void main(String args[])
{
	AdditionProgramss ap=new AdditionProgramss();
}

}


