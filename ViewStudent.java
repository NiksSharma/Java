import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class ViewStudent extends JFrame implements ActionListener
{
	JTextField nameText,ageText,cityText;
	JLabel nameLabel,ageLabel,cityLabel;
	JButton viewButton,cancelButton;
	ViewStudent()
	{
		nameLabel=new JLabel("Name");
		ageLabel=new JLabel("Age");
		cityLabel=new JLabel("City");
		nameText=new JTextField(10);
		ageText=new JTextField(10);
		cityText=new JTextField(10);
		viewButton=new JButton("View");
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
		gbl.setConstraints(viewButton,gbc);
		add(viewButton);

		gbc.gridx=1;
		gbc.gridy=3;
		gbl.setConstraints(cancelButton,gbc);
		add(cancelButton);
		viewButton.addActionListener(this);
		cancelButton.addActionListener(this);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public void actionPerformed(ActionEvent e)
{
	Object obj=e.getSource();
	if(obj==cancelButton)
		dispose();
	if(obj==viewButton)
	{
		try
		{
		ConnectData cd=new ConnectData();
		cd.searchStudent(nameText.getText());
		if(cd.rs.next())
		{
			ageText.setText(cd.rs.getString("age"));
			cityText.setText(cd.rs.getString("city"));
		}
		else
		{
			JOptionPane jp=new JOptionPane();
			jp.showMessageDialog(this,"No such record");
			ageText.setText("");
			cityText.setText("");
		}
		}catch(Exception ee){}
	}
}


	
public static void main(String args[])
{
	ViewStudent as=new ViewStudent();
}

}
