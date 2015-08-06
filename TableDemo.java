/*
JTable

*/
import javax.swing.*;
import java.awt.*;
class TableDemo extends JFrame
{
	JTable jt;
	TableDemo()
	{
		String header[]={"Name","Age","City"};
		String data[][]={ {"Amit","23","Karnal"},{"Sumit","22","Panipat"},{"Sanjay","25","Karnal"}};
		jt=new JTable(data,header);
		JScrollPane jsp=new JScrollPane(jt,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(jsp);
		setBounds(10,10,300,300);
			setVisible(true);
	}
public static void main(String args[])
{
	TableDemo td=new TableDemo();
}
}

	