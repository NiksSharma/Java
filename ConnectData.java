import java.sql.*;
class ConnectData
{
	Connection co;
	PreparedStatement ps;
	ResultSet rs;
	ConnectData()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			co=DriverManager.getConnection("jdbc:odbc:javadsn");
		}catch(Exception ee)
		{
			System.out.println(ee);
		}
	
	}

public boolean insertStudent(String name,int age,String city)
{

	try
	{
		ps=co.prepareStatement("insert into Student(studentname,age,city) values(?,?,?)");
		ps.setString(1,name);
		ps.setInt(2,age);
		ps.setString(3,city);
		ps.executeUpdate();
		return true;
	}catch(Exception ee)
	{
		System.out.println(ee);
		return false;
	}
}

public void searchStudent(String name)
{
	try
	{
		ps=co.prepareStatement("select * from student where Name=?");
		ps.setString(1,name);
		rs=ps.executeQuery();
	}catch(Exception ee)
	{
		System.out.println(ee);
	}
}


public boolean updateStudent(String name,int age,String city,int id)
{
	try
	{
		ps=co.prepareStatement("update Student1 set Name=?,Age=?,city=? where ID=?");
		ps.setString(1,name);
		ps.setInt(2,age);
		ps.setString(3,city);
		ps.setInt(4,id);
		ps.executeUpdate();
		return true;
	}catch(Exception ee)
	{
		return false;
	}
}

public boolean deleteStudent(int id)
{
	try
	{
		ps=co.prepareStatement("delete from Student1 where ID=?");
		ps.setInt(1,id);
		ps.executeUpdate();
		return true;

	}catch(Exception ee)
	{
		System.out.println(ee);
		return false;
	}
}}
