import java.awt.*;
class FlowDemo extends Frame
{
	Label nameLabel,ageLabel;
	TextField nameText,ageText;
	Button saveButton;
	FlowDemo()
	{

		nameLabel=new Label("Name");
		ageLabel=new Label("Age");
		nameText=new TextField(10);
		ageText=new TextField(10);
		saveButton=new Button("Save");
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		setLayout(fl);		

		add(nameLabel);
		add(nameText);
		add(ageLabel);
		add(ageText);
		add(saveButton);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public static void main(String args[])
{
	FlowDemo fd=new FlowDemo();
}

}
	

		
	