import java.awt.*;
class BorderDemo extends Frame
{
	Label nameLabel,ageLabel;
	TextField nameText,ageText;
	Button saveButton;
	BorderDemo()
	{

		nameLabel=new Label("Name");
		ageLabel=new Label("Age");
		nameText=new TextField(10);
		ageText=new TextField(10);
		saveButton=new Button("Save");
		BorderLayout bl=new BorderLayout();
		setLayout(bl);		

/*
		add(nameLabel,BorderLayout.NORTH);
		add(nameText,BorderLayout.NORTH);
		add(ageLabel,BorderLayout.CENTER);
		add(ageText,BorderLayout.CENTER);
		add(saveButton,BorderLayout.SOUTH);
*/
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		p1.setBackground(Color.RED);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.BLUE);
		p1.add(nameLabel);
		p1.add(nameText);
	
		p2.add(ageLabel);
		p2.add(ageText);

		p3.add(saveButton);

		add(p1,BorderLayout.NORTH);	
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);


		setBounds(10,10,300,300);
		setVisible(true);
	}
public static void main(String args[])
{
	BorderDemo fd=new BorderDemo();
}

}
	

		
	