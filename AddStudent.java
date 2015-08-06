import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class AddStudent extends JFrame implements ActionListener
{
	JTextField nameText,ageText,cityText;
	JLabel nameLabel,ageLabel,cityLabel;
	JButton saveButton,cancelButton;
	AddStudent()
	{
		nameLabel=new JLabel("Name");
		ageLabel=new JLabel("Age");
		cityLabel=new JLabel("City");
		nameText=new JTextField(10);
		ageText=new JTextField(10);
		cityText=new JTextField(10);
		saveButton=new JButton("Save");
		cancelButton=new JButton("Cancel");
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
		gbl.setConstraints(cityLabel,gbc);
		add(cityLabel);
		gbc.gridx=1;
		gbc.gridy=2;
		gbl.setConstraints(cityText,gbc);
		add(cityText);

		gbc.gridx=0;
		gbc.gridy=3;
		gbl.setConstraints(saveButton,gbc);
		add(saveButton);

		gbc.gridx=1;
		gbc.gridy=3;
		gbl.setConstraints(cancelButton,gbc);
		add(cancelButton);
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public void actionPerformed(ActionEvent e)
{
	Object obj=e.getSource();
	if(obj==cancelButton)
		dispose();
	if(obj==saveButton)
	{
		JOptionPane jp=new JOptionPane();
		try
		{	
		ConnectData cd=new ConnectData();
		boolean result=cd.insertStudent(nameText.getText(),Integer.parseInt(ageText.getText()),cityText.getText());
		if(result==true)
		jp.showMessageDialog(this,"Thanks for saving record");
		else
			jp.showMessageDialog(this,"Error in saving record");
		}catch(Exception ee)
		{
			jp.showMessageDialog(this,"Error in saving record");
		}



	}
}


	
public static void main(String args[])
{
	AddStudent as=new AddStudent();
}

}
