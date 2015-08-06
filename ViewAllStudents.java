/*
JTable

*/
import javax.swing.*;
import java.awt.*;
import java.sql.*;
class ViewAllStudents extends JFrame
{
	JTable jt;
	ViewAllStudents() throws Exception
	{
		
				
		ConnectData cd=new ConnectData();
		cd.getAllStudents();
		ResultSetMetaData rm=cd.rs.getMetaData();
		int cols=rm.getColumnCount();
		String header[]=new String [cols];
		for(int i=1;i<=cols;i++)
		{
			header[i-1]=rm.getColumnName(i);
		}
		int rows=cd.countStudents();
		String data[][]=new String[rows][cols];
		cd.getAllStudents();
		int row=0;		
		while(cd.rs.next())
		{
			for(int i=1;i<=cols;i++)
			data[row][i-1]=cd.rs.getString(i);
		row++;
		}
				

		jt=new JTable(data,header);
		JScrollPane jsp=new JScrollPane(jt,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(jsp);
		setBounds(10,10,300,300);
			setVisible(true);
	}
public static void main(String args[]) throws Exception
{
	ViewAllStudents td=new ViewAllStudents();
}
}

	