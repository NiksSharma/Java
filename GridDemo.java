import java.awt.*;
class GridDemo extends Frame
{
	Label nameLabel,ageLabel;
	TextField nameText,ageText;
	Button saveButton;
	GridDemo()
	{

		nameLabel=new Label("Name");
		ageLabel=new Label("Age");
		nameText=new TextField(10);
		ageText=new TextField(10);
		saveButton=new Button("Save");
		GridLayout gl=new GridLayout(3,2);
		setLayout(gl);
		/*
		add(nameLabel);
		add(nameText);
		add(ageLabel);
		add(ageText);
		add(saveButton);
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
		add(p1);
		add(p2);
		add(p3);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public static void main(String args[])
{
	GridDemo fd=new GridDemo();
}

}
	

		
	