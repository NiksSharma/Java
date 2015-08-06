/*
00    10  20
01     11 

*/
import java.awt.*;
class GridBagDemo extends Frame
{
	Label nameLabel,ageLabel;
	TextField nameText,ageText;
	Button saveButton;
	GridBagDemo()
	{

		nameLabel=new Label("Name");
		ageLabel=new Label("Age");
		nameText=new TextField(10);
		ageText=new TextField(10);
		saveButton=new Button("Save");
		GridBagLayout gbl=new GridBagLayout();
		setLayout(gbl);		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbl.setConstraints(nameLabel,gbc);
		add(nameLabel);
		gbc.gridx=1;
		gbc.gridy=0;
		gbl.setConstraints(nameText,gbc);
		add(nameText);
		gbc.gridx=0;
		gbc.gridy=1;
		gbl.setConstraints(ageLabel,gbc);
		add(ageLabel);
		gbc.gridx=1;
		gbc.gridy=1;
		gbl.setConstraints(ageText,gbc);
		add(ageText);
		gbc.gridx=0;
		gbc.gridy=2;
		gbl.setConstraints(saveButton,gbc);
		add(saveButton);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public static void main(String args[])
{
	GridBagDemo fd=new GridBagDemo();
}

}
	

		
	